package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義してください。
	
    // Q2：フィールドに動物の数の変数を定義してください。
	
    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。


    // 動物の名前と種類
    private String name;
    private String type;

    // 動物の数
    private static int animalCount = 0;

    // 名前を受け取り、「種類」は「犬」に固定
    public Dog(String name) {
        this.name = name;
        this.type = "犬";
        animalCount++;
    }

    // 名前を取得
    public String getName() {
        return name;
    }

    // 種類を取得
    public String getType() {
        return type;
    }

    // 動物の数を取得
    public static int getAnimalCount() {
        return animalCount;
    }
}