import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class Jewellery {

        private String description; // 珠宝描述
        private String type; // 类型（戒指、项链等）
        private String targetGender; // 目标性别（男性、女性等）
        private String imageUrl; // 图像 URL
        private double Price; // 零售价
        private LinkedList<Containment> containments; // 珠宝的材料/组件

        public Jewellery(String description, String type, String targetGender, String imageUrl, double retailPrice) {
            this.description = description;
            this.type = type;
            this.targetGender = targetGender;
            this.imageUrl = imageUrl;
            this.Price = Price;
            this.containments = new LinkedList<>();
        }

        // 添加材料/组件
       public void addContainment(Containment containment){
            containments.add(containment);
       }

        // 获取所有材料/组件
        public List<Containment> getContainments() {
            return containments;
        }

        public String getDescription() {
            return description;
        }

        public double getRetailPrice() {
            return Price;
        }

        public String getType() {
            return type;
        }

}
