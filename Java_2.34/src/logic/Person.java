package logic;

// 人を表すクラス
public class Person {
    private String firstName;  // 名
    private String lastName;   // 姓
    private int age;           // 年齢
    private double height;     // 身長
    private double weight;     // 体重

    // コンストラクタ
    public Person(String lastName, String firstName, int age, double height, double weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // フルネームを返すメソッド
    public String fullName() {
        return this.lastName + this.firstName;
    }

    // Carを購入するメソッド
    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + "が購入しました");
    }

    // Bicycleを購入するメソッド
    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + "が購入しました");
    }
}
