import java.util.Scanner;

public class lection_12_toantu3ngoi {
    public static void main(String[] args) {
//        System.out.print("Nhập số: ");
//        int num = new Scanner(System.in).nextInt();
//        String result = num % 2 == 0 ? "chẵn" : "lẻ";
//        System.out.println("Số " + num + " là số " + result );
        System.out.println("Nhập điểm: ");
        double point = new Scanner(System.in).nextDouble();
        String result = point >= 8 ? "Giỏi" : (point < 8 && point >= 6.5) ? "Khá" : (point < 6.5 && point > 5) ? "Trung bình" : "Yếu";
        System.out.println("Hạng: " + result);
    }
}
