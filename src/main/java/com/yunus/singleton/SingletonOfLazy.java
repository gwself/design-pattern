package com.yunus.singleton;

/**
 * Created by yunus on 2017/8/15.
 * 懒汉模式
 */
public class SingletonOfLazy {

    private static SingletonOfLazy singleton;

    private SingletonOfLazy(){

    }

    public static SingletonOfLazy getIntance(){
        if(singleton == null){
            singleton = new SingletonOfLazy();
        }
        return singleton;
    }

}
