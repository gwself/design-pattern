package com.yunus.creation.factory.simple;

/**
 * @author gaoyunfeng
 */
public class FanFactory implements IFanFactory {

    public IFan createFan(FanType type) {
        switch (type) {
            case TableFan:
                return new TableFan();
            case CeilingFan:
                return new CeilingFan();
            case ExhaustFan:
                return new ExhaustFan();
            default:
                return new TableFan();
        }
    }

}
