package main;

import logic.Bicycle;
import logic.Car;
import logic.Person;

public class Main {
    public static void main(String[] args) {
        // Personインスタンスを2人分作成
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);

        // 車と自転車のインスタンスを作成
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // person1が車を購入
        person1.buy(car);
        // person2が自転車を購入
        person2.buy(bicycle);

        // 所有者を確認
        System.out.println(car.getOwner());
        System.out.println(bicycle.getOwner());
    }
}
