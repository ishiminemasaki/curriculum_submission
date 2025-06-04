package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // 元の値を代入
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

        // BMI計算
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        
        System.out.printf("BMIは%.2fです\n", bmi);

        // 年齢が25歳以上かどうか出力
        System.out.println(age >= 25);

	}

}
