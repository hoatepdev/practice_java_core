import java.util.Scanner;

public class lection_10_scanner {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập mật khẩu cấp 1: ");
//        String mk1 = sc.nextLine();
//        System.out.println("Mật khẩu cấp 1 của bạn là: " + mk1);
//
//        // nhập số nguyên
//        System.out.println("Nhập mật khẩu cấp 2: ");
//        int mk2 = sc.nextInt();
//        System.out.println("Mật khẩu cấp 2 của bạn là: " + mk2);
//
//        // nhập số thực
//        // nhập số nguyên
//        System.out.println("Nhập mật khẩu cấp 3: ");
//        float mk3 = new Scanner(System.in).nextFloat();
//        System.out.println("Mật khẩu cấp 3 của bạn là: " + mk3);

        System.out.println("Nhập bán kính đường tròn: ");
        double r = new Scanner(System.in).nextDouble();
        double c = 2 * Math.PI * r;
        double s = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi hình tròn là: " + c);
        System.out.println("Diện tích hình tròn là: " + s);
    }
}
