package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // 元の値を代入
        String name = "鈴木一郎";
        int age = 24;
        double height = 168.5; // cm
        double weight = 64.2;  // kg
        String favoriteFood = "オムライス";

        // 年齢・身長・体重を和算で自己代入（自分自身に加算）
        age += age;             // 24 + 24 = 48
        height += height;       // 168.5 + 168.5 = 337.0
        weight += weight;       // 64.2 + 64.2 = 128.4

        // 自己紹介の出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの計算と出力（小数第2位まで表示）
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        
        System.out.printf("BMIは%.2fです\n", bmi);  // → 11.31 になる

	}

}
