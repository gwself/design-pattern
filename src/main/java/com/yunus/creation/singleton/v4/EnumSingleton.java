package com.yunus.creation.singleton.v4;

/**
 * 枚举单例
 *
 * @author lanxum
 */

public enum EnumSingleton {
    /**
     * 唯一单例
     */
    INSTANCE;

    /**
     * 添加单例方法
     */

    public void method() {
        System.out.println("Singleton method called...");
    }
}
