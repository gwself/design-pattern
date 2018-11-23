package com.yunus.creation.factory.method;
/**
 * @author gaoyunfeng
 */
public class PropellerFanFactory implements IFanFactory {

	public IFan createFan() {
		return new PropellerFan();
	}

}
