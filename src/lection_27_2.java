import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lection_27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();

        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = rd.nextInt(101);
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arrN));


        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int tmp = arrN[i];
            arrN[i] = arrN[j];
            arrN[j] = tmp;
        }
        System.out.println("Mảng sau khi reverse: " + Arrays.toString(arrN));

        Arrays.sort(arrN);
        System.out.println("Mảng sau khi sort: " + Arrays.toString(arrN));

        int sum = 0;
        for (int i : arrN) {
            sum += i;
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);

        System.out.print("Nhập số cần tìm trong mảng: ");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arrN[i] == num) {
                System.out.print("Tìm thấy ở vị trí: " + i);
                break;
            } else if(i == n -1) {
                System.out.println("Không tìm thấy!");
            }
        }

    }
}
