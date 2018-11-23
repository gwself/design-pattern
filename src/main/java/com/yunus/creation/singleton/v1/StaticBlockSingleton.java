package com.yunus.creation.singleton.v1;

/**
 * @Author: gaoyunfeng
 * @date: 2018/11/23
 * 静态初始化块单例
 */
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    /**
     * 私有构造函数，避免被客户端使用
     */
    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) { // 异常处理
            throw new RuntimeException("Uffff, i was not expecting this!", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
