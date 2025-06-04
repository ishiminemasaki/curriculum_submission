package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』の情報を変数に代入
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";

        // フォーマットに従って出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        
        // BMI 計算： 身長(cm)をmに変換してから計算
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        // BMI 出力（小数第2位まで表示したい場合）
        System.out.printf("BMIは%.2fです\n", bmi);

	}

}
