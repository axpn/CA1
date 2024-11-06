package models;

import java.util.ArrayList;
import java.util.List;

public class JewelleryStore {
    private List<DisplayCase> cases;

    public JewelleryStore() {
        this.cases = new ArrayList<>();
    }

    // 添加展示柜
    public void addDisplayCabinet(DisplayCase cabinet) {
        cases.add(cabinet);
    }

    // 获取所有展示柜
    public List<DisplayCase> getCabinets() {
        return cases;
    }

    // 清空所有数据
    public void clearStore() {
        cases.clear();
    }

    // 保存和加载系统数据
    public void saveData(String filename) {
        // TODO: 实现数据持久化保存
    }

    public void loadData(String filename) {
        // TODO: 实现数据加载
    }
}

