import java.util.Scanner;

public class lection_14_while {
    public static void main(String[] args) {
        System.out.print("Nhập số từ 0 đến 99: ");
        int num = new Scanner(System.in).nextInt();

        while(num < 0 || num > 99) {
            System.out.println("Vui lòng nhập số từ 0 đến 99");
            num = new Scanner(System.in).nextInt();
        }

        System.out.println("Số bạn nhập là: " + num);
    }
}
