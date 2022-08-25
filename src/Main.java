import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task1

        int year = LocalDate.now().getYear();
        leapYear(year);

        // task2

        int fhoneOs = 0;
        int deviceYear = LocalDate.now().getYear();
        clientDeviceVersion (fhoneOs, deviceYear);

        // task3

        int deliveryDistance = 95;
        int waitDays = 0;
        waitDays = daysOfDelivery(deliveryDistance);
        System.out.println("Потребуется дней: " + waitDays);

    }

    public static void leapYear(int lYear) {
        if (lYear % 4 == 0 && lYear % 100 != 0 || lYear % 400 == 0) {
            System.out.println(lYear + " - високосный год");
        } else {
            System.out.println(lYear + " - не високосный год");
        }
    }

    public static void clientDeviceVersion (int os, int year) {
        if (os == 0) {
            if (year > 2015) {
                System.out.println("Установите новую версию приложения для OS по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для OS по ссылке");
            }
        } else {
            if (year > 2015) {
                System.out.println("Установите новую версию приложения для ANDROIND по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для ANDROIND по ссылке");
            }
        }
    }

    public static int daysOfDelivery (int distance) {
        int deliveryDays = 1;
        if (distance > 20) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        if (distance > 100) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}