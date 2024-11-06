package models;

import java.util.LinkedList;
import java.util.List;

public class DisplayTray {
    private String id; // 展示托盘标识符
    private String materialColor; // 镶嵌材料颜色
    private double width; // 宽度
    private double depth; // 深度
    private LinkedList<Jewellery> jewellery; // 存放珠宝物品，改为链表

    public DisplayTray(String id, String materialColor, double width, double depth) {
        this.id = id;
        this.materialColor = materialColor;
        this.width = width;
        this.depth = depth;
        this.jewellery = new LinkedList<>();  // 使用 LinkedList 存储珠宝物品
    }

    // 添加珠宝物品
    public void addJewellery(Jewellery jewellery) {
        this.jewellery.add(jewellery);  // 使用链表的 add 方法
    }

    // 获取所有珠宝物品
    public List<Jewellery> getJewellery() {
        return jewellery;
    }

    public String getId() {
        return id;
    }
}