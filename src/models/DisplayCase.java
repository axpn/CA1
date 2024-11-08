package models;

import java.util.Hashtable;


public class DisplayCase {
    private String caseId; // 唯一标识符
    private String type; // 类型：壁挂式或独立式
    private String lighting; // 是否有照明
    private Hashtable<String,DisplayCase> cases;

    public DisplayCase(String caseId, String type, String lighting) {
        this.caseId = caseId;
        this.type = type;
        this.lighting = lighting;
        this.cases = new Hashtable<>();
    }
    // 添加展示柜
    public void addDisplayCase(DisplayCase cases) {
    }
    //删除展示柜
    public void deleteDisplayCase(){}
    //展示所有展示柜
    public void showDisplayCase(){}




    // 获取展示柜的 ID
    public String getId() {
        return caseId;
    }
}
