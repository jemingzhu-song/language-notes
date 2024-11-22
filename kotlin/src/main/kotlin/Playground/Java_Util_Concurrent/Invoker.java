package Playground.Java_Util_Concurrent;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executor;

public class Invoker implements Executor {
    @Override
    public void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
