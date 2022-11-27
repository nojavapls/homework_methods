import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год для проверки: ");
        int year = sc.nextInt();
        checkYear(year);
    }

    public static void checkYear(int year) {

        if (year % 4 == 0 && (year%100 != 0 || year%400 == 0))
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }
}