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
        int currentYear = LocalDate.now().getYear();
        String os;
        String version;
        if (numberOs == 0) {
            os = "IOS";
        } else {
            os = "Android";
        }
        if (yearRelease == currentYear) {
            version = "обычную";
        } else {
            version = "облегченную";
        }
        return "Установите " + version + " версию приложения для " + os + " по ссылке";
    }

    public static String deliveryBankCard(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return "Потребуется дней: " + 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return "Потребуется дней: " + 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return "Потребуется дней: " + 3;
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
        int deliveryDistance = 60;
        System.out.println(deliveryBankCard(deliveryDistance));
    }
}