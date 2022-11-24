import java.time.LocalDate;

public class task2 {
    public static void main(String[] args) {
        int clientDeviceYear = 2015;
        String operationSystem = "IOS";
        checkYear(clientDeviceYear, operationSystem);
    }

    public static void checkYear(int a, String b) {
        int currentYear = LocalDate.now().getYear();
        if (a == currentYear)
            System.out.println("приложение будет работать корректно.");
        else if (a < currentYear) {
            if (b == "IOS")
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}
