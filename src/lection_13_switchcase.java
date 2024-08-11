import java.util.Scanner;

public class lection_13_switchcase {
    public static void main(String[] args) {
        System.out.println("Mời bấm số để chọn");
        int num = new Scanner(System.in).nextInt();
        switch (num) {
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
                default:
                    System.out.println("Phím không hợp lệ");
        }
    }
}
