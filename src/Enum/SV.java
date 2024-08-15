package Enum;

public class SV {
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;

    // contructor
    SV(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai = getLoai();
    }

    // method get loai
    public XepLoai getLoai() {
        if(this.dtb >= 8) {
            loai = XepLoai.gioi;
        } else if(this.dtb >= 6.5) {
            loai = XepLoai.kha;
        } else if(this.dtb >= 5) {
            loai = XepLoai.tb;
        } else {
            loai = XepLoai.yeu;
        }
        return loai;
    }

    // toString

    @Override
    public String toString() {
        return ma + "\t" + ten + "\t" + dtb + "\t" + this.loai.getMsg();
    }
}
