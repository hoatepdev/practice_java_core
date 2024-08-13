import java.util.Arrays;
import java.util.Scanner;

public class lection_27_1 {
    public static void main(String[] args) {
//        System.out.print("Nhập vào số phần tử tối đa của mảng: ");
//        int n = new Scanner(System.in).nextInt();
//
//        int[] M = new int[n];
//        // Nhập dữ liệu cho từng phần tử
//        for(int i=0; i<n; i++) {
//            System.out.print("M[" + i + "] = ");
//            M[i] = new Scanner(System.in).nextInt();
//        }
//        // xem mảng
//
//        System.out.print("Mảng M được tạo là: " + Arrays.toString(M));

        int[] M = {8, 9, 10, 11, 12, 13, 14};
        for(int i=0, j=M.length-1; i<j; i++, j--) {
            int tmp = M[i];
            M[i] = M[j];
            M[j] = tmp;
        }
        System.out.println("Mảng đảo ngược là: " + Arrays.toString(M));
    }
}
