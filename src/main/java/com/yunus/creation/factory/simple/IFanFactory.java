package com.yunus.creation.factory.simple;

/**
 * @author gaoyunfeng
 */
public interface IFanFactory {
    /**
     * 创建实例
     *
     * @param type 产品类型
     * @return
     */
    IFan createFan(FanType type);
}
