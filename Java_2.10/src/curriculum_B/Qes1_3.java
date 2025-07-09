package curriculum_B;

import java.util.Random;  // Randomクラスのインポート（じゃんけんの手をランダムに決定するため）
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
            scanner.close();
            return;
        }
        // 入力文字列が10文字より長い場合
        else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
            scanner.close();
            return;
        }
        // 入力文字列に半角英数字以外の文字が含まれている場合
        else if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("半角英数字のみで名前を入力してください");
            scanner.close();
            return;
        }
        // 正常な入力（1〜10文字の半角英数字）の場合
        else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }

        // Randomオブジェクトの作成（じゃんけんの手をランダムに生成する準備）
        Random random = new Random();

        // じゃんけんの手を表す文字列配列（0:グー, 1:チョキ, 2:パー）
        String[] hands = {"グー", "チョキ", "パー"};

        // 勝利判定用のフラグ
        boolean isWin = false;

        // 勝つまでにかかった回数を記録する変数
        int count = 0;

        // 自分がじゃんけんに勝つまで繰り返す
        while (!isWin) {
            count++; // 試行回数をカウント

            // 自分と相手の手を0〜2の乱数で決定（0:グー, 1:チョキ, 2:パー）
            int myHand = random.nextInt(3);
            int enemyHand = random.nextInt(3);

            // 自分と相手の手を表示
            System.out.println(username + "の手は「" + hands[myHand] + "」");
            System.out.println("相手の手は「" + hands[enemyHand] + "」");

            // あいこの場合
            if (myHand == enemyHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            }
            // 自分が勝つ場合（グーvsチョキ、チョキvsパー、パーvsグー）
            else if ((myHand == 0 && enemyHand == 1) || 
                     (myHand == 1 && enemyHand == 2) || 
                     (myHand == 2 && enemyHand == 0)) {
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                isWin = true; // 勝ったのでループを抜ける
            }
            // 自分が負けた場合
            else {
                System.out.println("俺の勝ち！");

                // 相手の手によって異なるメッセージを表示
                switch (enemyHand) {
                    case 0: // 相手の手がグー（→自分はチョキ）
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                        break;
                    case 1: // 相手の手がチョキ（→自分はパー）
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ");
                        break;
                    case 2: // 相手の手がパー（→自分はグー）
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです");
                        break;
                }
            }
        }

        // 勝利までにかかった合計回数を表示
        System.out.println("勝つまでにかかった合計回数は" + count + "回です");

        // Scannerを閉じる（リソースの解放）
        scanner.close();
    }
}