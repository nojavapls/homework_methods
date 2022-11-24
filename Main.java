import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        checkYear(i);
    }

    public static void checkYear(int a) {

        if (a % 4 == 0 && a%100 != 0)
            System.out.println(a + " год является високосным");
        else
            System.out.println(a + " год не является високосным");
    }
}