package logic;

public class MessagePrinter {
	// フィールド
    private String name;
    private double length;
    private int speed;

    // セッター（thisを使用）
    public void setName(String name) {
        this.name = name; // thisでフィールドと引数を区別
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }
}
