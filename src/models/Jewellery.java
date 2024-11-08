package models;

import java.util.LinkedList;
import java.util.List;
public class Jewellery {

        private String description; // 珠宝描述
        private String type; // 类型（戒指、项链等）
        private String targetGender; // 目标性别（男性、女性等）
        private String image; // 图像 URL
        private double price; // 零售价
        private LinkedList<Jewellery> jewellery; // 存放珠宝物品，改为链表

        public Jewellery(String description, String type, String targetGender, String image, double price) {
            this.description = description;
            this.type = type;
            this.targetGender = targetGender;
            this.image = image;
            this.price = price;
            this.jewellery = new LinkedList<>();  // 使用 utils.LinkedList 存储珠宝物品
        }
    // 添加珠宝物品
    public void addJewellery(Jewellery jewellery) {
        this.jewellery.add(jewellery);  // 使用addLinkedList方法
    }
    //删除珠宝
    public void deleteJewellery(){
    }
    //展示所有珠宝
    public void showJewellery(){}


//        public String getDescription() {
//            return description;
//        }
//
//        public double getRetailPrice() {
//            return price;
//        }
//
//        public String getType() {
//            return type;
//        }

}