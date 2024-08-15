package TinhDaHinh;

public abstract class NhanSu {
    // thuộc tính
    private String ten;
    private String cccd;
    private String que;

    // contructor
    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }
    public NhanSu(String ten, String cccd) {
            this.ten = ten;
            this.cccd = cccd;
    }
    public NhanSu() {}


    // phương thức
    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCccd() {
        return cccd;
    }
    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
}
