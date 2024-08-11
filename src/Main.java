//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a = 6;
        System.out.println("1. " + (a += 3));
        System.out.println("2. " + (a -= 5));
        System.out.println("3. " + (a * 2));
        System.out.println("4. " + (a % 5));

        int b = 2;
        System.out.println("5. " + (a-=(b+7)));
    }
}