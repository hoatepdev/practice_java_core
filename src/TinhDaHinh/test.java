package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new TruongPhong("nguyen van a", "555444", "Tbinh");

        System.out.println(ns1.tinhLuong(20));
        System.out.println("Thông tin: " + ns1.getTen()  + " - " + ns1.getCccd());
        ns1 = new PhoPhong(ns1.getTen(), ns1.getCccd());
        System.out.println(ns1.tinhLuong(20));
        System.out.println("Thông tin: " + ns1.getTen()  + " - " + ns1.getCccd());

    }
}
