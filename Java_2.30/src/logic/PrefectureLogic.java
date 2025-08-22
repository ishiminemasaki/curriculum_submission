package logic;

import java.util.ArrayList;
import java.util.List;

public class PrefectureLogic {
    // 都道府県データの配列
    private Prefecture[] prefectures = {
        new Prefecture("北海道", "札幌市", 83424),
        new Prefecture("青森県", "青森市", 9646),
        new Prefecture("岩手県", "盛岡市", 15275),
        new Prefecture("宮城県", "仙台市", 7282),
        new Prefecture("秋田県", "秋田市", 11638),
        new Prefecture("山形県", "山形市", 9323),
        new Prefecture("福島県", "福島市", 13784),
        new Prefecture("茨城県", "水戸市", 6097),
        new Prefecture("栃木県", "宇都宮市", 6408),
        new Prefecture("群馬県", "前橋市", 6362),
        new Prefecture("埼玉県", "さいたま市", 3798)
    };

    /**
     * 入力された番号に対応する都道府県を取得してリストで返す
     */
    public List<Prefecture> getPrefectures(int[] indices) {
        List<Prefecture> list = new ArrayList<>();
        for (int idx : indices) {
            if (idx >= 0 && idx < prefectures.length) {
                list.add(prefectures[idx]);
            }
        }
        return list;
    }

    /**
     * 指定された並び順でソート
     * @param list ソート対象
     * @param ascending trueなら昇順、falseなら降順
     */
    public void sortByArea(List<Prefecture> list, boolean ascending) {
        list.sort((p1, p2) -> {
            if (ascending) {
                return Double.compare(p1.getArea(), p2.getArea());
            } else {
                return Double.compare(p2.getArea(), p1.getArea());
            }
        });
    }
}
