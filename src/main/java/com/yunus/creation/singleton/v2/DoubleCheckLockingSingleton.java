package com.yunus.creation.singleton.v2;

/**
 * @Author: gaoyunfeng
 * @date: 2018/11/23
 * 双重检查锁定单例
 */
public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                // 双重检查
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
