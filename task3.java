public class task3 {
    public static void main(String[] args) {
        int deliveryDistance = 100;
//            checkDistance(deliveryDistance);
        deliveryDistance = checkDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDistance);
    }

    public static int checkDistance(int a) {
        int b = 1;
        if (a < 20)
            return b;
        else if (a > 20 && a < 60)
            return b++;
        else
            return b += 2;
    }
}
