import java.time.LocalDate;

public class Main {

    public static String checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }

    public static String appVersion(int numberOs, int yearRelease) {
        if (numberOs == 0) {
            int currentYear = LocalDate.now().getYear();
            if (yearRelease < currentYear) {
                return "Установите облегченную версию приложения для IOS";
            } else {
                return "Установите обычную версию приложения для IOS";
            }
        } else {
            int currentYear = LocalDate.now().getYear();
            if (yearRelease < currentYear) {
                return "Установите облегченную версию приложения для Android";
            } else {
                return "Установите обычную версию приложения для Android";
            }
        }

    }

    public static String deliveryBankCard(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return "Потребуется дней: " + 0;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return "Потребуется дней: " + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return "Потребуется дней: " + 2;
        } else {
            return "Доставки нет ";
        }
    }

    public static void main(String[] args) {
        int year = 2000;
        System.out.println(checkYear(year));
        int os = 1;
        int yearRelease = 2024;
        System.out.println(appVersion(os, yearRelease));
        int deliveryDistance = 95;
        System.out.println(deliveryBankCard(deliveryDistance));
    }
}

