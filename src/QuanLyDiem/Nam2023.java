package QuanLyDiem;

public abstract class Nam2023 {
            // thuộc tính

    protected String ten;
    protected String que;
    protected String cccd;


    public Nam2023 (String ten, String que) {
        this.ten = ten;
        this.cccd = cccd;
    }

//    public void TinhTrungBinh(){
//        System.out.println("Đây là phương trình bậc 2");
//    }

    public abstract void tinhTrungBinh();
}
