package curriculum_B;

import java.util.Scanner; // Scannerクラスのインポート（コンソールからの入力を受け取るため）

public class Qes1_3 {

    public static void main(String[] args) {
        // Scannerオブジェクトの作成（ユーザー入力を受け取る準備）
        Scanner scanner = new Scanner(System.in);

        // ユーザーが入力した文字列を1行分取得
        String username = scanner.nextLine();

        // 入力がnullまたは空文字列だった場合（未入力）
        if (username == null || username.length() == 0) {
            System.out.println("名前を入力してください");
        }
        // 入力文字列が10文字より長い場合
        else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        }
        // 入力文字列に半角英数字以外の文字が含まれている場合
        else if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("半角英数字のみで名前を入力してください");
        }
        // 正常な入力（1〜10文字の半角英数字）の場合
        else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }

        // Scannerを閉じる（リソースの解放）
        scanner.close();
    }
}