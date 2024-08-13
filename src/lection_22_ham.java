import java.util.Scanner;

public class lection_22_ham {
    public static void main(String[] args) {
        System.out.println("Nhập số a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số b:");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Mời nhập vào phép tính: (+, -, *, /)");
        String operation = new Scanner(System.in).nextLine();


        switch (operation) {
            case "+":
                System.out.println(addition(a, b));
                break;

            case "-":
                System.out.println(subtraction(a, b));
                break;
            case "*":
                System.out.println(multiplication(a, b));
                break;
            case "/":
                System.out.println(division(a, b));
                break;

            default:
                break;
        }
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }

}

