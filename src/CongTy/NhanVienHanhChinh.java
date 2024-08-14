package CongTy;

public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh(String que, String ten, int cccd) {
        super(ten,que, cccd);
    }

    @Override
    public double tinhLuong() {
        return 0;
    }


}
