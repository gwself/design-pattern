package com.yunus.structural.adapter;


/**
 * VGA2HDMI适配器
 *
 * @author lanxum
 */
public class Vga2HdmiAdapter implements IHdmi {

    private IVga vgaDisplay;

    public Vga2HdmiAdapter(IVga vgaDisplay) {
        this.vgaDisplay = vgaDisplay;
    }

    public void openHdmi() {
        // 适配逻辑
        this.vgaDisplay.openVga();
        System.out.println("Opening HDMI device");
    }

}
