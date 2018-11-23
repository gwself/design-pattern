package com.yunus.creation.factory.abstractfactory;

/**
 * @author gaoyunfeng
 */
public interface IElectricalFactory {
	
	IFan createFan();
	
	ITubeLight createTubeLight();
}
