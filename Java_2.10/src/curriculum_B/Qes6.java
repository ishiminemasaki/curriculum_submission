package curriculum_B;

import java.util.Random;  // ランダムな値を生成するためにRandomクラスをインポート
import java.util.Scanner; // コンソールからの入力を受け取るためにScannerクラスをインポート

public class Qes6 {

    public static void main(String[] args) {
        // Scannerオブジェクトを作成（ユーザー入力を受け取る準備）
        Scanner scanner = new Scanner(System.in);

        // ユーザーに「、」区切りで商品名を入力してもらう
        String input = scanner.nextLine();

        // 入力された文字列を「、」で分割して配列に格納
        String[] items = input.split("、");

        // Randomクラスのインスタンスを生成（ランダム値の生成に使用）
        Random rand = new Random();

        // 拡張for文を使用して、配列内の各商品を1つずつ処理
        for (String item : items) {
            // 0〜11までのランダムな在庫数を生成
            int stock = rand.nextInt(12);

            // switch式を使用して商品ごとに出力内容を切り替える
            String message = 
                switch (item) {
                    // 商品名が「パソコン」の場合の出力
                    case "パソコン" -> "パソコンの残り台数は" + stock + "台です";

                    // 商品名が「冷蔵庫」の場合の出力
                    case "冷蔵庫" -> "冷蔵庫の残り台数は" + stock + "台です";

                    // 商品名が「扇風機」の場合の出力
                    case "扇風機" -> "扇風機の残り台数は" + stock + "台です";

                    // 商品名が「洗濯機」の場合の出力
                    case "洗濯機" -> "洗濯機の残り台数は" + stock + "台です";

                    // 商品名が「加湿器」の場合の出力
                    case "加湿器" -> "加湿器の残り台数は" + stock + "台です";

                    // 商品名が「テレビ」または「ディスプレイ」の場合の出力
                    case "テレビ", "ディスプレイ" -> {
                        // 11からランダム値を引いた数を在庫数とする
                        int adjusted = 11 - stock;
                        // 「テレビ」や「ディスプレイ」の残り台数を出力
                        yield item + "の残り台数は" + adjusted + "台です";
                    }

                    // 上記以外の値が入力された場合の出力
                    default -> "『" + item + "』は指定の商品ではありません";
                };

            // メッセージを出力
            System.out.println(message);
        }

        // Scannerを閉じる（リソースの解放）
        scanner.close();
    }
}
