package oopSXClass;

public class SanPham implements Comparable<SanPham>{
    // thuoc tinh
    private int ma;
    private String ten;
    private double gia;

    //constructor
    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    // get set
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    // toString
    @Override
    public String toString() {
        return "San Pham [ma=" + ma + ", ten=" + ten + ", gia=" + gia + "]";
    }

    // phuong thuc
    @Override
    public int compareTo(SanPham o) {
        if(this.gia < o.gia) return -1;
        if(this.gia > o.gia) return 1;
        return 0;
    }
}
