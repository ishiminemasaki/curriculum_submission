package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import logic.Prefecture;
import logic.PrefectureLogic;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrefectureLogic logic = new PrefectureLogic();

        // 数字入力
        System.out.println("番号をカンマ区切りで入力してください：");
        String[] inputNumbers = scanner.nextLine().split(",");
        int[] indices = Arrays.stream(inputNumbers)
                              .map(String::trim)
                              .mapToInt(Integer::parseInt)
                              .toArray();

        // 昇順・降順入力
        System.out.println("昇順なら asc、降順なら desc を入力してください：");
        String order = scanner.nextLine().trim().toLowerCase();
        boolean ascending = order.equals("asc");

        // 選択された都道府県リスト取得
        List<Prefecture> selected = logic.getPrefectures(indices);

        // ソート
        logic.sortByArea(selected, ascending);

        // 結果出力
        for (Prefecture p : selected) {
            p.printInfo();
        }

        scanner.close();
    }
}
