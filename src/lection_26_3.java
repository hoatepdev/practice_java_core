import java.util.Scanner;

public class lection_26_3 {
    // viết chương trình tác chữ và số
    // VD: abc123 thành abc và 123
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi:");
        String str = new Scanner(System.in).nextLine();

        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                chuoi.append(c);
            } else if (Character.isLetter(c)) {
                so.append(c);
            }
        }

        System.out.println("chuoi: " + chuoi);
        System.out.println("so: " + so  );
    }
}
