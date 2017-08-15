package com.yunus.fatory;

/**
 * Created by yunus on 2017/8/15.
 * 最简单的工厂模式
 */
public class Factory {

    public static Factory getInstance(){
        return new Factory();
    }

}
