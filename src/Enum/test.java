package Enum;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.tb.ordinal());

        // tao list ds sv
        ArrayList<SV> ds = new ArrayList<>();

        // tao ra doi tuong sv
        SV sv1 = new SV(123, "hoa 1", 8.5);
        SV sv2 = new SV(124, "hoa 2", 5.5);
        SV sv3 = new SV(125, "hoa 3", 6.5);
        // add vao ds
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);

        // duyet mang
        for (SV sv : ds) {
            System.out.println(sv);
        }
    }
}
