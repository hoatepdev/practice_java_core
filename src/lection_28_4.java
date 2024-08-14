import java.util.ArrayList;
import java.util.Scanner;

public class lection_28_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số phần từ của list: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            int j = sc.nextInt();
            list.add(j);
        }

        System.out.println("list: " + list);

        ArrayList<Integer> binhPhuong = new ArrayList<>();
        int count = 0;
        for(int i : list) {
            int r = i * i;
            if (r > 50) count++;
            binhPhuong.add(r);
        }

        System.out.println("binhPhuong" + binhPhuong);
        System.out.println("Có " +  count + " số lớn hơn 50");
    }
}
