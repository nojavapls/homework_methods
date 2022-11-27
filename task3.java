public class task3 {
    public static void main(String[] args) {
        int deliveryDistance = 30000;
//            checkDistance(deliveryDistance);
        deliveryDistance = checkDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDistance);
    }

    public static int checkDistance(int distance) {
        int delivery = 1;
        if (distance < 20)
            return delivery;
        else if (distance > 20 && distance < 60)
            return delivery++;
        else
        {
            while (distance > 20) {
                distance -= 40;
                delivery++;
            }
            return delivery;
            }
        }
    }
