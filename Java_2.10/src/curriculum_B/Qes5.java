package curriculum_B;

public class Qes5 {

    public static void main(String[] args) {
        // 外側のループ（1〜9）：掛けられる数（行）
        for (int i = 1; i <= 9; i++) {
            // 内側のループ（1〜20）：掛ける数（列）
            for (int j = 1; j <= 20; j++) {
                // 掛け算の式と結果を整形して出力（例：01 * 02 = 002）
                // 数値部分は2桁・3桁でゼロ埋めしてそろえる
                System.out.printf("%02d * %02d = %03d", j, i, j * i);

                // 最後の列以外には区切り文字「 || 」を表示
                if (j != 20) {
                    System.out.print(" || ");
                }
            }
            // 各行の出力後に改行
            System.out.println();
        }
    }
}