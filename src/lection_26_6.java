import java.util.Locale;
import java.util.Scanner;

public class lection_26_6 {
    // Nhập vào 1 chuỗi, tối ưu chuỗi theo quy tắc:
    // * Không có khoảng trắng dư thừa
    // * Các ký tự cách nhau 1 khoảng trắng
    // * Ký tự đầu tiên phải được viết hoa
    // "   gA LAI    laP  triNh    "

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String str = new Scanner(System.in).nextLine();
        StringBuilder result = new StringBuilder();

        String[] arrStr = str.trim().split("\\s+");
        for (int i = 0; i < arrStr.length; i++) {
            result.append((arrStr[i].substring(0, 1).toUpperCase() + arrStr[i].substring(1).toLowerCase()) + (i == arrStr.length - 1 ? "" :" "));
        }

        System.out.println("result: " + result);
    }
}
