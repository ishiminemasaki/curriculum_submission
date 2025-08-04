package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
    public static void main(String[] args) {
	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください


        // コンストラクタを使ってanimalCountを初期化
        Dog myDog = new Dog("ポチ", 10);

        // 動物の名前を出力
        System.out.println(myDog.getName());
        
        // 動物の種類を出力
        System.out.println(myDog.getType());
        
        // 動物の数を出力
        System.out.println(Dog.getAnimalCount());

        // 現在の日時を取得して指定形式でフォーマット
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDateTime = now.format(formatter);

        // 日時を出力
        System.out.println(formattedDateTime);
    }
}