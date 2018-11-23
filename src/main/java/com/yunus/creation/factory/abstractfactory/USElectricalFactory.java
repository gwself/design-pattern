package com.yunus.creation.factory.abstractfactory;
/**
 * @author gaoyunfeng
 */
public class USElectricalFactory  implements IElectricalFactory {

	public IFan createFan() {
		return new USFan();
	}

	public ITubeLight createTubeLight() {
		return new USTubeLight();
	}

}