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

    // コンストラクタ：名前と動物数を引数で受け取り、animalCountに代入
    public Dog(String name, int count) {
        this.name = name;
        this.type = "犬";
        animalCount = count;
    }

    // 名前を取得
    public String getName() {
        return name;
    }

    // 種類を取得
    public String getType() {
        return type;
    }

    // 動物数を取得
    public static int getAnimalCount() {
        return animalCount;
    }
}