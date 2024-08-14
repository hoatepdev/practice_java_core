import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lection_28_2 {
    // Viết chương trình trả lời kết quả của phép tính:
    // quest: {"2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12 % 2 ="}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> quest = new ArrayList<>(List.of("2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12 % 2 ="));

        ArrayList<Float> answer = new ArrayList<>(List.of(14f, 50f, 4f, 0f));

        for (int i = 0; i < quest.size(); i++) {
            System.out.println("Q" + (i + 1) + ": " + quest.get(i));
            System.out.print("Đáp án là: ");
            Float input = sc.nextFloat();

            if(input.equals(answer.get(i))) {
                System.out.println("Bạn đã trả lời đúng");
            } else {
                System.out.println("Sai rồi, đáp án là: " + answer.get(i));
            }
        }

    }
}
