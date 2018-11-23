package com.yunus.creation.factory.method;

/**
 * @author gaoyunfeng
 * 吊扇
 */
public class CeilingFan implements IFan {

    public void swithOn() {
        System.out.println("The CeilingFan is swithed on ...");
    }

    public void switchOff() {
        System.out.println("The CeilingFan is swithed off ...");
    }
}
