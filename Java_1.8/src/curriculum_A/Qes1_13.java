package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // 元の値を代入
        String name = "鈴木一郎";
        int age = 24;
        double height = 168.5; // cm
        double weight = 64.2;  // kg
        String favoriteFood = "オムライス";

        // 数値を文字列に型変換
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);

        // 文字列として連結して出力
        System.out.println(ageStr + heightStr + weightStr);
        
	}

}
