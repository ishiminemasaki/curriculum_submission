package logic;

public class Logic {
    private String name;          // 動物名
    private double length;        // 体長（m）
    private int speed;            // 速度（km/h）
    private String scientificName;// 学名

    // コンストラクタ
    public Logic(String name, double length, int speed, String scientificName) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    // 情報を出力するメソッド
    public void printInfo() {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName);
        System.out.println();
    }
}