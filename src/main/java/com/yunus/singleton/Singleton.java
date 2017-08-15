package com.yunus.singleton;

/**
 * Created by yunus on 2017/8/15.
 * 单例模式
 *  1.饿汉模式
 *  2.懒汉模式
 */
public class Singleton {
    // 饿汉模式
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

}


