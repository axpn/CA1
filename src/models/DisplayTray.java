package models;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;


public class DisplayTray {
    private String trayId; // 展示托盘标识符
    private String materialColor; // 镶嵌材料颜色
    private double width; // 宽度
    private double depth; // 深度
    private Hashtable<String, DisplayTray> trays; // 存放展示托盘

    public DisplayTray(String trayId, String materialColor, double width, double depth) {
        this.trayId = trayId;
        this.materialColor = materialColor;
        this.width = width;
        this.depth = depth;
        this.trays = new Hashtable<>();
    }
    // 添加展示托盘
    public void addDisplayTray(DisplayTray tray) {
    }
    //删除展示托盘
    public void deleteDisplayTray(){}
    //展示所有托盘
    public void showDisplayTray(){}
    // 获取展示托盘
    public DisplayTray getDisplayTray(String trayId) {
        return trays.get(trayId);
    }

    // 获取所有展示托盘
    public Hashtable<String, DisplayTray> getTrays() {
        return trays;
    }

}