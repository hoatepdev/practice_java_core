import java.util.Scanner;

public class lection_17_continuebreak {

    public static boolean checkSoNguyenTo (int num) {
        if(num <= 1) return false;
         for (int i = 2; i <= num /2; i++) {
             if(num % i == 0) return false;
         }
         return true;
    }
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            System.out.println("Nhập số lớn hơn 0");
            int num = new Scanner(System.in).nextInt();
            if (checkSoNguyenTo(num)) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println(num + " không là số nguyên tố");

            }

            System.out.println("Bạn có muốn tiếp tục?");
            System.out.println("Nhấn 1 để tiếp tục, nhấn 2 để thoát");
            int isContinue = (new Scanner(System.in)).nextInt();

            if(isContinue == 1) {

            } else if (isContinue == 2) {
                flag = false;
            } else {
                System.out.println("Không hợp lệ");
            }
        }
    }
}

