package com.yunus.creation.factory.method;
/**
 * @author gaoyunfeng
 */
public class TableFanFactory implements IFanFactory {

	public IFan createFan() {
		return new TableFan();
	}

}
