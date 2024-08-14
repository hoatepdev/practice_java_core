package TruongDaiHoc;

public class SinhVien {
    // Thuộc tính
    private String hoTen;
    private double diem;
    private double diemToan;
    private double diemVan;

//
    public SinhVien() {
        hoTen="hoatep";
        diem=6.5;
    }
    // Phuơng thức
    public void hienThiThongTin() {
        System.out.println(hoTen + ": " + diem);
    }


    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public double tinhDiemTrungBinh(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }


    @Override
    public String toString() {
        return "Sinh vien{" + "hoTen=" + hoTen + ", diem=" + diem + '}';
    }

    private boolean checkDiem() {
        return this.diem >= 24;
    }

//    public void
}
