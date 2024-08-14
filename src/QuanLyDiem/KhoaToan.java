package QuanLyDiem;

public class KhoaToan extends Nam2023 {
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhTrungBinh() {
        System.out.println("Đây à phép tình của Khoa Toán");
    }
}