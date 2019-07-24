package com.ThreadPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
/*
线程池使用步骤：
    1，使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
    2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
    3，调用ExecutorService中的方法submit，传递线程任务实现类，开启线程，执行run方法
    4.调用ExecutorService中的方法shutdown销毁线程池
 */
public class Demo1ThreadPool  {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());//pool-1-thread-1创建了一个新线程
        executorService.submit(new RunnableImpl());//pool-1-thread-2创建了一个新线程
        executorService.submit(new RunnableImpl());//pool-1-thread-1创建了一个新线程
        executorService.shutdown();

    }
}
