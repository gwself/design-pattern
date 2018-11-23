package com.yunus.creation.factory.method;

/**
 * @author gaoyunfeng
 */
public class ExhaustFanFactory implements IFanFactory {

    public IFan createFan() {
        return new ExhaustFan();
    }

}
