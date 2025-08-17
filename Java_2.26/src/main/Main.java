package main;

import java.util.Scanner;

import logic.Player;

public class Main {
    public static void main(String[] args) {
        // コンソール入力を受け付けるScanner
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Playerクラス（サブクラス）のインスタンスを作成
        Player player = new Player(name);

        // 出力処理
        System.out.println("こんにちは 「" + player.getName() + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAttack());
        System.out.println("素早さ：" + player.getSpeed());
        System.out.println("防御力：" + player.getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");

        scanner.close();
    }
}