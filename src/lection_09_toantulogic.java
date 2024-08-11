public class lection_09_toantulogic {
    public static void main(String[] args) {
        int i = 15;
        System.out.println(i > 0 && i < 10);
        System.out.println(i < 5 || i >= 15);
        System.out.println(!(i == 15));

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
