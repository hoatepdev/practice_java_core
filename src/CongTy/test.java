package CongTy;

public class test {
    public static void main(String[] args) {
//        NhanVien nv1 = NhanVien("Nhan vien 1", "TNguyen", 123456);
//        double luongNv1 = nv1.tinhLuong();
//        System.out.println(luongNv1);

        NhanVienHanhChinh nv2 = new NhanVienHanhChinh("Nhan vien 2", "TBinh", 999999);
        double luongNv2 = nv2.tinhLuong();
        System.out.println(luongNv2);

        NhanVienDiCa nv3 = new NhanVienDiCa("Nhan vien 2", "TBinh", 999999, 1);
        double luongNv3 = nv3.tinhLuong();
        System.out.println(luongNv3);
    }
}
