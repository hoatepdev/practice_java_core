import TruongDaiHoc.SinhVien;

public class lection_30_1 {
    public static void main(String[] args) {
        // khởi tạo class TruongDaiHoc.SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.hienThiThongTin();

        sv2.hienThiThongTin();

        System.out.println(sv2.getHoTen());

        System.out.println(sv2.tinhDiemTrungBinh(5, 2));

        System.out.println(sv2);
    }
}
