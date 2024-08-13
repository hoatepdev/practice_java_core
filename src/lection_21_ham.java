public class lection_21_ham {
    public static void main(String[] args) {
        String result1 = TinhPTBac2(1, 2, 3);
        String result2 = TinhPTBac2(1, 2, 1);
        String result3 = TinhPTBac2(1, 2, -3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static String TinhPTBac2(int a, int b, int c) {
        if(a == 0) {
            if(b == 0 && c == 0) {
                return "Phương trình vô số nghiệm";
            }
            else if(b == 0) {
                return "Phương trình vô nghiệm";
            } return "Phương trình có nghiệm " + (-c/b);
        } else {
            double denta = Math.pow(b, 2) - 4 * a * c;

            if(denta < 0) {
                return "Phương trình vô nghiệm";
            } else if (denta == 0) {
                return "Phương trình có 1 nghiệm: " + -b / (2*a);
            } else {
                return "Phương trình có 2 nghiệm: " +  (-b + Math.sqrt(denta)) / (2*a) + " và " + (-b - Math.sqrt(denta)) / (2*a);
            }
        }
    }
}
