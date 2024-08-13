public class lection_26_2 {

    // String: "tôi chăm học vkl nhưng mà tôi vẫn ngu"
    // Đếm xem có bao nhiêu từ tôi trong câu trên

    public static void main(String[] args) {
        String str = "tôi chăm học vkl nhưng mà tôi vẫn ngu";
        String[] arrStr = str.split(" ");
        int count = 0;
        for (String word : arrStr) {
            if(word.equals("tôi")) {
                count++;
            }
        }
        System.out.println("Có " + count + " từ tôi");
    }

}
