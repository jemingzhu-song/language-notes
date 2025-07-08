package reactive.tutorial.ReactiveProgramming.Playground;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Playground {
    public static void main(String[] args) throws InterruptedException {
        Flux<String> names = Flux.just("Adam", "Brian", "Charles");

        names
            .flatMap(name -> Mono.fromCallable(() -> {
                    int delay = new Random().nextInt(10);
                    System.out.println("Delaying: " + name + " by " + delay + "sec");
                    Thread.sleep(delay * 1000);
                    return Mono.empty();// test
                })
                .subscribeOn(Schedulers.newParallel("X-parallel", 5))
                .thenReturn(name)
            )
            .doOnNext(name -> System.out.println("Processing name: " + name + " on thread: " + Thread.currentThread().getName()))
            .subscribe(
                name -> System.out.println("Finished processing name: " + name + " on thread: " + Thread.currentThread().getName())
            );


        


//        names
//            .flatMap(name -> {
//                int delay = new Random().nextInt(10);
//                System.out.println("Delaying: " + name + " by " + delay + "sec");
//                return Mono.delay(Duration.ofMillis(delay * 1000), Schedulers.newParallel("A-parallel"))
//                    .thenReturn(name);
//            })
//            .publishOn(Schedulers.newParallel("B-parallel"))
//            .doOnNext(name -> System.out.println("Processing name: " + name + " on thread: " + Thread.currentThread().getName()))
//            .subscribe(
//                name -> System.out.println("Finished processing name: " + name + " on thread: " + Thread.currentThread().getName())
//            );

        System.out.println("Hello world");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

//        names
//            .flatMap(name -> {
//                System.out.println("Started processing... " + name + "on thread: " + Thread.currentThread().getName());
//                return Mono.just(name);
//            })
//            .publishOn(Schedulers.newParallel("p1", 5))
//            .flatMap(name -> Mono.fromCallable(() -> {
//                int delay = new Random().nextInt(10);
//                System.out.println("Delaying: " + name + " by: " + delay + "sec");
//                Mono.delay(Duration.ofMillis(delay * 1000));
//                System.out.println("Processing name 1#: " + name + " on thread " + Thread.currentThread().getName());
//                return Mono.just(name);
//            }).thenReturn(Mono.just(name)))
//            .publishOn(Schedulers.newParallel("p2", 5))
//            .flatMap(name -> {
//                System.out.println("Processing name 2#: " + name + " on thread " + Thread.currentThread().getName());
//                Mono.delay(Duration.ofMillis(new Random().nextInt(10) * 1000));
//                return Mono.just(name);
//            })
//            .subscribeOn(Schedulers.newParallel("end", 5))
//            .subscribe(
//                name -> System.out.println("Finished name: " + name + " on thread " + Thread.currentThread().getName())
//            );



//        System.out.println("Started on thread: " + Thread.currentThread().getName());
//
//        Flux<Integer> values = Flux.just(100, 5000, 3000, 22000, 500);
//
//        values
//            .flatMap(value -> Mono.delay(Duration.ofMillis(Long.parseLong(value.toString())))
//                    .thenReturn(value)
//            )
//            .flatMap(value -> {
//                System.out.println("Evaluating " + value + " on thread " + Thread.currentThread().getName());
//                return Mono.just(value);
//            })
//            .subscribeOn(Schedulers.boundedElastic())
//            .subscribe();
//
//        Thread.sleep(30000);
//        System.out.println("Finished on thread: " + Thread.currentThread().getName());
    }
}
