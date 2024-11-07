package models;

import java.util.LinkedList;

public class Containment {
    private String type; // 材料类型（例如金、白金、钻石、祖母绿、银等）
    private String description; // 描述（例如宝石的切割/形状/颜色的自由文本）
    private double weight;//重量(例如5克拉)
    private double quality; // 质量（如金的纯度、钻石的透明度等）
    private LinkedList<Containment> containments; // 珠宝的材料/组件

    public Containment(String type, String description, double weight, double quality) {
        this.type = type;
        this.description = description;
        this.weight = weight;
        this.quality = quality;
        this.containments = new LinkedList<>();
    }

    //判断相等
    public boolean isEqual(Containment other) {
        return this.type.equals(other.type);
    }

    @Override
    public String toString() {
        return "Containment{material='" + type + "', description:" + description + ", weight=" + weight + ", quality=" + quality + "}";
    }

    // 添加材料/组件
    public void addContainment(Containment containment) {

        containments.add(containment);
    }

    //删除材料/组件
    public void deleteContainment(Containment containment) {
        containments.delete(containment);
    }

    //展示珠宝信息
    public void showContainment() {
        for (Containment c : containments) {
            System.out.println(c);
        }
    }

//    获取所有材料/组件
//    public LinkedList<Containment> getContainments() {
//        return containments;
//    }
//    public String getType() {
//        return type;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public double getWeight(){return weight;}
//    public double getQuality() {
//        return quality;
//    }
}
