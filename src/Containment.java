public class Containment {
    private String material; // 材料名称（例如金、白金、钻石、祖母绿、银等）
    private String description; // 描述（例如宝石的切割/形状/颜色的自由文本）
    private double quantity; // 数量/重量(例如3颗钻石每颗5克拉)
    private double quality; // 质量（如金的纯度、钻石的透明度等）

    public Containment(String name, String description, double quantity, double quality) {
        this.material = name;
        this.description = description;
        this.quantity = quantity;
        this.quality = quality;
    }

    public String getName() {
        return material;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getQuality() {
        return quality;
    }
}
