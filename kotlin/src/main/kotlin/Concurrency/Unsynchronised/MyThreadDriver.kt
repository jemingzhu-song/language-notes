package Concurrency.Unsynchronised

import java.util.concurrent.TimeUnit

fun main() {
    for (i in 0..10) {
        var thread: MyThread = MyThread("Thread $i")
        var startThread: Thread = Thread(thread)
        startThread.start()
    }
}