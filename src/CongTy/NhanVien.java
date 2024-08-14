package CongTy;

public abstract     class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850;

    // constructor alt ins

    public NhanVien(String que, String ten, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    public abstract double tinhLuong();
}
