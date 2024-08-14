package QuanLyDiem;

public class testDiem {
    public static void main(String[] args) {
        KhoaToan toan1 = new KhoaToan("hoa", "5555");
        KhoaAnh anh1 = new KhoaAnh("hoa1", "55556");

        toan1.tinhTrungBinh();
        anh1.tinhTrungBinh();
    }
}
