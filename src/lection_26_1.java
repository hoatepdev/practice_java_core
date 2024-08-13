import java.util.Scanner;
// Bài 20: Viết chương trình kiểm tra tính hợp lệ của mật khẩu
// * Mật khẩu hợp lệ chứa tối thiểu 6 ký tự và tối đa 16 ký tự
// * Chứa ít nhất 1 chữ cái (chữ cái thường hoặc hoa đều được)
// * chứa ít nhất 1 số
// Yêu cầu người dùng nhập lại mật khẩu
// Sai quá 5 lần thì thoát chương trình
public class lection_26_1 {
    public static void main(String[] args) {
        boolean flagInvalid = true;
        boolean flagWrongPw = true;
        int countWrongPassword = 0;

        String password = "";
        while (flagInvalid) {
            System.out.println("Nhập mật khẩu: ");
            String pw = new Scanner(System.in).nextLine();
            boolean isValidPassword = isValidPassword(pw);

            System.out.println("Mật khẩu " + (isValidPassword ? "" : "không ") + "hợp lệ!");
            if(isValidPassword) {
                flagInvalid = false;
                password = pw;
            }
        }

        while(flagWrongPw && countWrongPassword < 5) {
            System.out.println("Nhập lại mật khẩu: ");
            String pw = new Scanner(System.in).nextLine();

            System.out.println("Mật khẩu " + (pw.equals(password) ? "" : "không ") + "đúng!");
            if(pw.equals(password)) {
                flagWrongPw =  false;
            } else {
                countWrongPassword++;
            }
        }
    }

    public static boolean isValidPassword(String password) {
        if(password.length() <6 || password.length() > 16) {
            return false;
        }

        boolean flagHasDigit = false;
        for(char ch : password.toCharArray()) {
            if(Character.isDigit(ch)) {
                flagHasDigit = true;
                break;
            }
        }
        if(!flagHasDigit) {
            return false;
        }

        boolean flagHasLetter = false;
        for(char ch : password.toCharArray()) {
            if(Character.isLetter(ch)) {
                flagHasLetter = true;
                break;
            }
        }
        if(!flagHasLetter) {
            return false;
        }


        return true;
    }

}
