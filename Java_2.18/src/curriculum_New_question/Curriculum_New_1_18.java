package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

    public static void main(String[] args) {
        // 文字列と整数を受け取りメッセージを表示
        printMessage("JavaSE", 11); // Hello JavaSE 11

        // 整数を受け取り乗算
        multiplyAndPrint(4, 5); // 20 が出力されます

        // 小数を受け取り加算（オーバーロード）
        multiplyAndPrint(2.5, 3.5); // 6.0 が出力されます

        // ランダムな整数を生成して配列を受け取る
        int[] resultArray = generateRandomNumbers(5);

        // 平均値を計算して出力する
        double average = calculateAverage(resultArray);
        System.out.println(average);

        // 平均値が50以上かを判定して出力する
        boolean isAbove50 = isAverageAbove50(average);
        System.out.println(isAbove50);
    }

    // 文字列型と整数型を引数に取り、"Hello JavaSE 11" を出力するメソッド
    public static void printMessage(String text, int version) {
        System.out.println("Hello " + text + " " + version);
    }

    // 整数を2つ受け取り、乗算して出力するメソッド
    public static void multiplyAndPrint(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    // 小数を2つ受け取り、加算して出力するメソッド（オーバーロード）
    public static void multiplyAndPrint(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }

    // 指定された回数分、1～100のランダムな整数を生成して出力し、その配列を返す
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            int randomNum;
            do {
                randomNum = rand.nextInt(101); // 0～100の乱数を生成
            } while (randomNum == 0); // 0は許容しない

            numbers[i] = randomNum;
            System.out.println(randomNum);
        }

        return numbers;
    }

    // 平均値を計算して返す
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // 平均値が50以上かを判定するメソッド
    public static boolean isAverageAbove50(double average) {
        return average >= 50;
    }
}
