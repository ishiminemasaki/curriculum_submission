package logic;

// 乗り物の基底クラス
public class Vehicle {
    // 所有者の名前を保持するフィールド
    private String owner;

    // 所有者を取得するgetter
    public String getOwner() {
        return owner;
    }

    // 所有者を設定するsetter
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
