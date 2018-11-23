package com.yunus.creation.singleton.v3;

/**
 * @Author: gaoyunfeng
 * @date: 2018/11/23
 * 静态内部类持有
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
