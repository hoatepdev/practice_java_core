package TestInterface;

public class KeThuaInterface2 implements ViDuInterface, ViDuInterface2{

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }


    @Override
    public void setThuong(int cccd, double doanhThu) {

    }
}
