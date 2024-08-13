import java.util.Scanner;

public class lection_26_5 {
    // Số hoàn hảo
    // Viết chương trình kiểm tra số nhập có phải là số hoàn hảo không.
    // VD: madam, radar

    public static boolean validPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = sc.nextLine();
        System.out.println("str: " + str);
        System.out.println(str + (validPalindrome(str) ? " " : " không ") + "là chuỗi Palindrome");
    }
}
