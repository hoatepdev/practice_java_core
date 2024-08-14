import java.util.HashMap;
import java.util.Scanner;

public class lection_29_1 {
    public static void main(String[] args) {
// Viết chương trình sử dụng dict chứa 10 username và password
        // Chương trình yêu cầu nhập username và password
        // nếu username không có trong dict thì sẽ thông báo không tồn tại
        // nếu user đúng mà password sai thì báo password sai
        // nếu user và password đúng thì thông báo đăng nhập thành công

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> users = new HashMap<>();
        users.put("hoatep1", "123asd");
        users.put("hoatep2", "123asd");
        users.put("hoatep3", "123asd");
        users.put("hoatep4", "123asd");
        users.put("hoatep5", "123asd");
        users.put("hoatep6", "123asd");
        users.put("hoatep7", "123asd");
        users.put("hoatep8", "123asd");
        users.put("hoatep9", "123asd");
        users.put("hoatep10", "123asd");

        System.out.print("Nhập username: ");
        String username = sc.nextLine();

        if(users.containsKey(username)) {
            System.out.print("Nhập password: ");
            String password = sc.nextLine();

            if(users.get(username).equals(password)) {
                System.out.println("Đăng nhập thành công!");
            } else {
                System.out.println("Mật khẩu sai");
            }
        } else {
            System.out.println("Không có user này!");
        }
    }
}
