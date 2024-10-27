public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Методы");
        System.out.println("______________Задание 1_____________");
        int year1 = 2024;
        task1(year1);
        System.out.println("____________________________________");
        System.out.println("______________Задание 2_____________");
        int clientOS1 = 0;
        int clientDeviceYear  = 2010;
        task2(clientOS1, clientDeviceYear);
        System.out.println("____________________________________");
        System.out.println("______________Задание 3_____________");
        int deliveryDistance = 95;
        int day = 1;
        int day2 = 2;
        int day3 = 3;
        task3(deliveryDistance,day,day2,day3);
        System.out.println("____________________________________");
    }
    public static void task1(int year1) {
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
    public static void task3(int deliveryDistance, int day, int day2, int day3){
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + day2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + day3);
        }
        else {
            System.out.println("Доставки нет");
        }
    }
}

