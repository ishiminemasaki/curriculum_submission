package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessagePrinter {
    private String greeting;
    private String taste;
    private String category;
    private String currentTime;

    // コンストラクタ
    public MessagePrinter() {
        this.greeting = "こんにちは！ここは日本です！";
        this.taste = "この寿司はうまい";
        this.category = "寿司は和食です";

        // 現在日時の取得と整形
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.currentTime = "今の現在日時は" + now.format(formatter) + "です";
    }

    // メッセージ出力
    public void printMessages() {
        System.out.println(this.greeting);
        System.out.println(this.taste);
        System.out.println(this.category);
        System.out.println(this.currentTime);
    }
}