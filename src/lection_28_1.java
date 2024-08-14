import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lection_28_1 {
    public static void main(String[] args) {
        // 1. Khai báo array list
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(5);
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));


        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);

        System.out.println("size của list1: " + list3.size());
        System.out.println("giá trị tại vị trí 1 là: " + list3.get(1));

        list3.add(8);
        list3.add(9);
        list3.add(10);
        list3.add(11);
        System.out.println("list3 sau khi thêm: " + list3);

        list3.remove(2);
        System.out.println("list3 sau khi xóa: " + list3);

        ArrayList<Integer>  list4 = new ArrayList<>(List.of(12, 2, 43, 24, 15, 96));
        list4.remove(Integer.valueOf(3));
        System.out.println("list4 sau khi xóa: " + list4);
        System.out.println("list4 có chứa 24 không? " + list4.contains(24));
        Collections.sort(list4);
        System.out.println("list4 sau khi sắp xếp: " + list4);
        System.out.println("Tìm vị trí của 43: " + list4.indexOf(43));

        for (int n: list4) {
            System.out.print(n + " ");
        }

        for (int i = 0; i< list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }
}
