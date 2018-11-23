package com.yunus.creation.factory.method;

/**
 * @author gaoyunfeng
 */
public class CeilingFanFactory implements IFanFactory {

    public IFan createFan() {
        return new CeilingFan();
    }

}
