package logic;

import java.util.Random;

public class Player extends Character {
    // コンストラクタ（ランダム値を生成してスーパークラスへ渡す）
    public Player(String name) {
        super(
            name,
            randomStatus(), // HP
            randomStatus(), // MP
            randomStatus(), // 攻撃力
            randomStatus(), // 素早さ
            randomStatus()  // 防御力
        );
    }

    // ランダム値生成メソッド
    private static int randomStatus() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1; // 1〜1000の乱数
    }
}