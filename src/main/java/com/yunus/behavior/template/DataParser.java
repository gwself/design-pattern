package com.yunus.behavior.template;

abstract class DataParser {

    /**
     * 模板方法， final子类不能重载
     */
    public final void process() {
        readData();
        processData();
        writeData();
    }

    /**
     * 由子类实现的抽象方法
     */
    abstract void readData();

    /**
     * 由子类实现的抽象方法
     */
    abstract void processData();

    /**
     * 所有子类都相同的实现
     */
    public void writeData() {
        System.out.println("Ouput generated, writing to CSV");
    }
}
