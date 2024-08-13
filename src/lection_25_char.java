public class lection_25_char {
    public static void main(String[] args) {
//        System.out.println(Character.compare('a', 'A'));
//
//        char ch1 = '1';
//        char ch2 = 'a';
//        char ch3 = 'A';
//        char ch4 = ' ';
//
//        System.out.println(Character.isDigit(ch1));
//        System.out.println(Character.isLetter(ch2));
//        System.out.println(Character.isUpperCase(ch3));
//        System.out.println(Character.isWhitespace(ch4));


        // Bài 19: Cho String str1 = "English = 78, Science = 83, Math = 68, History = 65"
        // Tính tổng các số trong chuỗi trên
        // tính trung bình

        int sum = 0;
        int count = 0;
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";

        String[] arrStr1 = str1.split(" ");

        for(String str : arrStr1) {
        System.out.println(str);
            try {
                int num = Integer.parseInt(str);
                sum += num;
                count += 1;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Tổng: " + sum);
        System.out.println("Trung bình cộng: " + (double)(sum / count));
    }
}
