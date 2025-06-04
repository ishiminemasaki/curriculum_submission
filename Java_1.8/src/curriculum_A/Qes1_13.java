package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		byte byteVar = 10;           // バイト型
        short shortVar = 100;        // 短整数型
        int intVar = 1000;           // 整数型
        long longVar = 10000L;       // 長整数型
        float floatVar = 9.5f;       // 単精度浮動小数点数型
        double doubleVar = 10.5;     // 倍精度浮動小数点数型
        char charVar = 'a';          // 文字型
        String stringVar = "ハロー";  // 文字列型
        boolean booleanVar = true;   // ブーリアン型

        // 11110 11110
        int sum1 = byteVar + shortVar + intVar + (int)longVar;
        System.out.println(sum1 + " " + sum1);

        // 20 20
        int sum2 = byteVar * 2;
        System.out.println(sum2 + " " + sum2);

        // a ハロー true a ハロー true
        System.out.println(charVar + " " + stringVar + " " + booleanVar + " " + charVar + " " + stringVar + " " + booleanVar);

        // 11130 11130 数字を全て足す
        int sum3 = byteVar + shortVar + intVar + (int)longVar + (int)floatVar + (int)doubleVar;
        System.out.println(sum3 + " " + sum3 + " 数字を全て足す");

        // 10000000000 10000000000 小数点以外の数字を全てかける
        long product = byteVar * shortVar * intVar * longVar;
        System.out.println(product + " " + product + " 小数点以外の数字を全てかける");

        // 0.105 0.105 10.5割る100をする
        double divideResult = doubleVar / 100;
        System.out.println(divideResult + " " + divideResult + " 10.5割る100をする");

        // -90 -90 10引く100をする
        int subResult = byteVar - shortVar;
        System.out.println(subResult + " " + subResult + " 10引く100をする");

	}

}
