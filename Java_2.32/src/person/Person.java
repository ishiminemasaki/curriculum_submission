package person;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private static int count = 0;

    // コンストラクタ
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        // インスタンス生成ごとにカウント
        count++;
    }

    // BMIを計算するメソッド
    public double bmi() {
        return this.weight / this.height / this.height;
    }

    // 個人情報を出力するメソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
    }

    // クラスメソッド：合計人数を出力
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}
