package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // 文字列型に変換された年齢と身長
        String ageStr = "24";
        String heightStr = "168.5";

        // 年齢は整数型に直接変換可能
        int age = Integer.parseInt(ageStr);

        // 身長は小数点ありなので、まず double に変換 → int にキャスト（小数点切り捨て）
        double heightDouble = Double.parseDouble(heightStr);
        int height = (int) heightDouble;

        // 出力
        System.out.println(age);
        System.out.println(height);
        
	}

}
