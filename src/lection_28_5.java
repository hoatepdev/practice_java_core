import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lection_28_5 {
    // Cho list {1, 9, 3, 14, 5, 27, 8}
    // Viết chương trình tìm ra số lớn thứ 2 và số bé thứ 2

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 9, 3, 14, 5, 27, 8));
        ArrayList<Integer> copyList = new ArrayList<>(list);

        Collections.sort(copyList);
        System.out.println("Số lơn thứ 2 là: " + copyList.get(copyList.size() - 2));
        System.out.println("Số bé thứ 2 là: " + copyList.get(1));

        System.out.println("Vị trí trong mảng là: " + list.get(copyList.size() - 2) + " và " + list.get(1));;
    }
}
