package main;

import person.Person;

public class Main {
    public static void main(String[] args) {
        // Personインスタンスを作成
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        person1.print();

        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        person2.print();

        // 合計人数を出力
        Person.printCount();
    }
}
