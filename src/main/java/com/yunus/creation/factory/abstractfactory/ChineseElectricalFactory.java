package com.yunus.creation.factory.abstractfactory;

/**
 * @author gaoyunfeng
 */
public class ChineseElectricalFactory implements IElectricalFactory {

    /**
     * @return
     */
    public IFan createFan() {
        return new ChineseFan();
    }

    /**
     * @return
     */
    public ITubeLight createTubeLight() {
        return new ChineseTubeLight();
    }

}
