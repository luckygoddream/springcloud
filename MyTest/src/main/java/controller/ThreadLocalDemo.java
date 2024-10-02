package controller;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo {


    public static final int MAXIMUM_POOL_SIZE = 8;
    public static final int MAXIMUM_QUEUE_SIZE = 16;
    public static final long KEEP_ALIVE_SECONDS = 0L;

    // 定义ThreadLocal
    ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    ThreadPoolExecutor pool = new ThreadPoolExecutor(
            MAXIMUM_POOL_SIZE,
            MAXIMUM_POOL_SIZE,
            KEEP_ALIVE_SECONDS,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(MAXIMUM_QUEUE_SIZE),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );


}
