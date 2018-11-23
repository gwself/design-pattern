package com.yunus.structural.adapter;

/**
 * 支持VGA接口的显示器
 * @author lanxum
 */
public class VgaDisplay implements IVga {

    public void openVga() {
        System.out.println("Opening..VGA Display...");
    }

}
