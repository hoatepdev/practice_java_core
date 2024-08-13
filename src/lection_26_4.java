public class lection_26_4 {
    // Viết chương trình lọc string từ dường dẫn D:/personal/hoatepdev/remix.mp4
    // 1. Tách tên file bao gồm cả đuôi
    // 2. Tách mỗi tên file
    public static void main(String[] args) {
        String path = "D:/personal/hoatepdev/remix.mp4";
        int lastIndexString = path.lastIndexOf("/");
        String fileName = path.substring(lastIndexString + 1);
        System.out.println("fileName: " + fileName);

        int lastIndex = fileName.lastIndexOf(".");
        String onlyName = fileName.substring(0, lastIndex);
        System.out.println("onlyName: " + onlyName);
    }
}
