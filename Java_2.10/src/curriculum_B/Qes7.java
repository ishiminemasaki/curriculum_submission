package curriculum_B;

import java.util.Scanner; // Scannerクラスのインポート（コンソールからの入力を受け取るため）

public class Qes7 {

    public static void main(String[] args) {
        // Scannerオブジェクトの作成（ユーザー入力を受け取る準備）
        Scanner scanner = new Scanner(System.in);

        // 各教科名を格納する配列
        String[] subjects = {"英語", "数学", "理科", "社会"};

        int students;

        // 生徒の人数が2人以上になるまで繰り返す処理
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            students = scanner.nextInt();
        } while (students < 2);

        // 生徒ごとの点数を格納する2次元配列（行：生徒、列：教科）
        double[][] scores = new double[students][subjects.length];

        // 各生徒の各教科の点数を入力する処理
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects.length; j++) {
                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
                scores[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();

        // 各生徒の平均点を計算して表示する処理
        for (int i = 0; i < students; i++) {
            double sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            double avg = sum / subjects.length;
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), avg);
        }

        System.out.println();

        // 各教科の平均点と全体平均点を計算するための変数
        double totalSum = 0;

        // 各教科の平均点を計算して表示する処理
        for (int j = 0; j < subjects.length; j++) {
            double subjectSum = 0;
            for (int i = 0; i < students; i++) {
                subjectSum += scores[i][j];
            }
            double subjectAvg = subjectSum / students;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAvg);
            totalSum += subjectSum;
        }

        // 全体の平均点を計算して表示する処理
        double overallAvg = totalSum / (students * subjects.length);
        System.out.printf("全体の平均点は%.2f点です。\n", overallAvg);

        // Scannerのクローズ（リソースの解放）
        scanner.close();
    }
}
