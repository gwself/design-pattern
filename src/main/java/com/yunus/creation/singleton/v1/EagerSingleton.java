package com.yunus.creation.singleton.v1;

/**
 * @Author: gaoyunfeng
 * @date: 2018/11/23
 * 懒汉模式
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    /**
     * 私有构造函数，避免被客户端代码使用
     */
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
