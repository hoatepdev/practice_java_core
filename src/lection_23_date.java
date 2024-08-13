import java.util.Calendar;
import java.util.Scanner;

public class lection_23_date {
    public static void main(String[] args) {
        System.out.println("Nhập ngày sinh");
        int d = new Scanner(System.in).nextInt();
        System.out.println("Nhập tháng sinh");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập năm sinh");
        int y = new Scanner(System.in).nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(y, m - 1, d);

        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

        System.out.println("Tuổi của bạn là: " + age);
    }
}
