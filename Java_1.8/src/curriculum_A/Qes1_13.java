package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // 一度宣言した変数に再代入
        String name = "鈴木一郎";
        int age = 24;
        double height = 168.5; // cm
        double weight = 64.2;  // kg
        String favoriteFood = "オムライス";

        // 自己紹介の出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの計算と出力（小数第1位まで表示）
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.printf("BMIは%.1fです\n", bmi);

	}

}
