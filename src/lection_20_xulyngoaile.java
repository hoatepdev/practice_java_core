public class lection_20_xulyngoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("c là: " + c);
        } catch (ArithmeticException ex) {
            System.out.println("Lỗi toán học");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Lỗi");
            ex.printStackTrace();
        } finally {
            System.out.println("Chạy vào finally");
        }

        System.out.println("Chạy đoạn code sau");
    }
}
