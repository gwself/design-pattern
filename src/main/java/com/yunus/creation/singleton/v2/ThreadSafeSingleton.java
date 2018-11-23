package com.yunus.creation.singleton.v2;

/**
 * @Author: gaoyunfeng
 * @date: 2018/11/23
 * synchronized 修饰方法粗颗粒安全
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
