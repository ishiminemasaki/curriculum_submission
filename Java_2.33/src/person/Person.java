package person;

public class Person {
    private static int count = 0; // 人数カウント用のクラスフィールド
    private String firstName;     // 名
    private String lastName;      // 姓
    private int age;              // 年齢
    private double height, weight; // 身長・体重

    // コンストラクタ1（姓 → 名 の順）
    public Person(String lastName, String firstName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;   // lastNameをセット
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++; // 人数をカウント
    }

    // コンストラクタ2（名 → 姓 の順）
    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;   // lastNameをセット
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++; // 人数をカウント
    }

    // フルネームを返すメソッド
    public String fullName() {
        return this.lastName + this.firstName;
    }

    // 出力メソッド
    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    // BMIを計算して返すメソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    // 合計人数を表示するクラスメソッド
    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}
