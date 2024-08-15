package Enum;

public enum XepLoai {
    gioi ("Xếp loại giỏi"),
    kha ("Xếp loại khá"),
    tb ("Xếp loại tb"),
    yeu ("Xếp loại yếu");

    private String msg;

    XepLoai(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
