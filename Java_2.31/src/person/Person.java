package person;

public class Person {
    public String name;   // 名前
    public int age;       // 年齢
    public double height; // 身長（m）
    public double weight; // 体重（kg）

    public static int count = 0; // 人数カウント

    // コンストラクタ
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        count++;
    }

    // BMIを返すメソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    // 自己紹介を出力するメソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        double bmiValue = this.bmi();
        double bmiCut = (int)bmiValue;
        System.out.printf("BMIは%.1fです%n", bmiCut);
    }
}
