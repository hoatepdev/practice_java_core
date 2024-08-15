package TestInterface;

public class test {
    public static void main(String[] args) {
        KeThuaInterface kt1 = new KeThuaInterface();
        double kq1 = kt1.tinhLuong(20.5, 21);
        System.out.println("Lương: " + kq1);
    }
}
