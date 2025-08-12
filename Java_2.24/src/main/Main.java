package main;

import logic.MessagePrinter;

public class Main {
    public static void main(String[] args) {
    	
        // MessagePrinterのインスタンス生成
    	MessagePrinter lion = new MessagePrinter();

        // セッターで値を設定
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // ゲッターで値を取得して出力
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
