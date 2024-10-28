public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Методы");
        System.out.println("______________Задание 1_____________");
        int year1 = 2024;
        checkYear(year1);
        System.out.println("____________________________________");

        System.out.println("______________Задание 2_____________");
        int clientOS1 = 0;
        int clientDeviceYear  = 2010;
        task2(clientOS1, clientDeviceYear);
        System.out.println("____________________________________");

        System.out.println("______________Задание 3_____________");
        int deliveryDistance = distance(20);
        System.out.println("Потребуется дней: " + deliveryDistance);
        System.out.println("____________________________________");
    }
    public static void checkYear(int year1) {
        if ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0)) {
            System.out.println(year1 + " год является високосным");
        } else {
            System.out.println(year1 + " год не является високосным");
        }
    }
    public static void task2(int clientOS1, int clientDeviceYear){
        if (clientOS1 == 0 && clientDeviceYear  < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear  >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear  >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int distance(int deliveryDistance){
        int day = 1;
        int day2 = 2;
        int day3 = 3;
        if (deliveryDistance <= 20){
            return day;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return day2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return day3;
        }
        else {
            return 0;
        }
    }
}

