package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import logic.Logic;

public class Main {
    public static void main(String[] args) {
        // 学名を登録しておく
        Map<String, String> scientificNames = new HashMap<>();
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        // インコは未登録 → 「不明」とする

        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();

        // 入力を「,」で区切る
        String[] animals = input.split(",");

        for (String animalData : animals) {
            // 「:」で区切る → [0]=名前, [1]=体長, [2]=速度
            String[] parts = animalData.split(":");
            String name = parts[0];
            double length = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            // 学名を取得（なければ「不明」）
            String scientificName = scientificNames.getOrDefault(name, "不明");

            // Logicインスタンスを作成
            Logic animal = new Logic(name, length, speed, scientificName);

            // 情報を出力
            animal.printInfo();
        }

        scanner.close();
    }
}
