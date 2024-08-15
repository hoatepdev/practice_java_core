package oopSXClass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        // taoj list
        ArrayList<SanPham> ds = new ArrayList<>();
SanPham s1 = new SanPham(1, "Samsung", 1050);
SanPham s2 = new SanPham(2, "Apple", 2300);
SanPham s3 = new SanPham(3, "Huawei", 400);

// Add san pham vao list
        ds.add(s1);
        ds.add(s2);
        ds.add(s3);
        // Xem ds
        for (SanPham d : ds) {
            System.out.println(d);
        }
        System.out.println("sort: ");
        // sap xep
        Collections.sort(ds);
        for (SanPham d : ds) {
            System.out.println(d);
        }
    }
}
