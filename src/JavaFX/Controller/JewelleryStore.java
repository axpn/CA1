package JavaFX.Controller;

import models.DisplayCase;
import models.DisplayTray;
import models.Jewellery;

public class JewelleryStore {

    //展示所有库存
    public void showInventory() {
        for (int i = 0; i < cases.size(); i++) {
            DisplayCase displayCase = cases.get(i);
            System.out.println("Display Case " + (i + 1) + ":");
            for (int j = 0; j < displayCase.getDisplayTray().size(); j++) {
                Tray tray = displayCase.getTrays().get(j);
                System.out.println("\tTray " + (j + 1) + ":");
                for (Jewellery jewellery : DisplayTray.getJewellery()) {
                    System.out.println("\t\t" + jewelryItem);
                }
            }
        }
    }

    // 清空所有数据
    public void clearStore() {

    }

    // 保存和加载系统数据
    public void saveData(String filename) {
        // TODO: 实现数据持久化保存
    }

    public void loadData(String filename) {
        // TODO: 实现数据加载
    }
}

