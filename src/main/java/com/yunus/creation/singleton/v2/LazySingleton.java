package com.yunus.creation.singleton.v2;

/**
 * @Author: gaoyunfeng
 * @date: 2018/11/23
 * 延迟初始化单例（非线程安全）
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
