import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lection_28_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử:");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int random = rd.nextInt(101);
            list1.add(random);
        }

        System.out.println(list1);
    }
}
