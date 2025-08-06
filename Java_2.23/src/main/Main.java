package main;

import logic.MessagePrinter;

public class Main {
    public static void main(String[] args) {
        // MessagePrinterのインスタンスを作成し、出力
        MessagePrinter printer = new MessagePrinter();
        printer.printMessages();
    }
}