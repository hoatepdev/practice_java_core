import java.util.Arrays;
import java.util.Scanner;

public class lection_11_ifelse {
    public static void main(String[] args) {
//        System.out.println("Nhập số bất kì: ");
//        double num = new Scanner(System.in).nextDouble();
//if(num > 5) {
//    System.out.println("Số lớn hơn 5");
//} else if(num == 5) {
//    System.out.println("Số bằng 5");
//} else {
//    System.out.println("Số nhỏ hơn 5");
//}

//        // Bài 05: Tìm 2 so khi biết tổng và hiệu của nó
//        System.out.println("Nhập vào tổng 2 số: ");
//        double sum = new Scanner(System.in).nextInt();
//        System.out.println("Nhập vào hiệu 2 số: ");
//        double difference = new Scanner(System.in).nextInt();
//        double a = difference / 2;
//        double b = sum - a;
//        System.out.println("a:" + a);
//        System.out.println("b:" + b);

//        // Bài 06: Tính BMI khi biết chiều cao và cân nặng
//        System.out.print("Nhập chiều cao: ");
//        double h = new Scanner(System.in).nextDouble();
//        System.out.println("Nhập cân nặng: ");
//        double w = new Scanner(System.in).nextDouble();
//        double bmi = w / Math.pow(h, 2);
//
//        if(bmi < 15) {
//            System.out.println("Thân hình quá gầy");
//        } else if(bmi >= 15 && bmi < 16) {
//            System.out.println("Thân hình gầy");
//        } else if(bmi >= 16 && bmi < 18.5) {
//            System.out.println("Thân hình hơi gầy");
//        } else if(bmi >= 18.5 && bmi < 25) {
//            System.out.println("Thân hình bình thường");
//        } else if(bmi >= 25 && bmi < 30) {
//            System.out.println("Thân® hình hơi béo");
//        } else if(bmi >= 30 && bmi < 35) {
//            System.out.println("Thân hình béo");
//        } else {
//            System.out.println("Thân hình quá béo");
//        }
//        // Bài 07: nhập tháng trả số ngày trong tháng
//        System.out.println("Nhập tháng: ");
//        int month = new Scanner(System.in).nextInt();
//
//        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            System.out.println("Tháng " + month + " có 31 ngày");
//        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("Tháng " + month + "có 30 ngày");
//        } else {
//            System.out.println("Nhập năm: ");
//            int year = new Scanner(System.in).nextInt();
//       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//           System.out.println("Tháng 2 có 29 ngày");
//       } else {
//           System.out.println("Tháng 2 có 28 ngày");
//       }
//        }
        // Bài 9: Giải phương trình bậc 2 ax^2 + bx + c = 0;
        System.out.println("Nhập a:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhập b:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Nhập c:");
        double c = new Scanner(System.in).nextDouble();

        double denta = Math.pow(b, 2) - 4 * a * c;

        if(denta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (denta == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + -b / (2*a));
        } else {
            System.out.println("Phương trình có 2 nghiệm: " +  (-b + Math.sqrt(denta)) / (2*a) + " và " + (-b - Math.sqrt(denta)) / (2*a));
        }
    }
}
