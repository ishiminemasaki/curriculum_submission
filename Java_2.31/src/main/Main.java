package main;

import person.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

        // フィールドを直接出力
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println();

        // メソッドを使って自己紹介出力
        person1.print();
        System.out.println();

        // 合計人数を出力
        System.out.println("合計" + Person.count + "人です");
    }
}
