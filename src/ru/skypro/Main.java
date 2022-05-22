package ru.skypro;

public class Main {

    public static int highYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным ");
        }
        return 0;
    }
    public static int clientDevice(int os, int year) {

        int ios = 0;
        int android = 1;

        if (ios > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке ");
        }
        if (android < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        return 0;
    }
    public static int days(int deliveryDistance) {
        int delivery = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + delivery);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + (delivery + 1));
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + (delivery + 2));
        }
        return 0;
    }
    public static void duplicates(String sorted) {
        for (int i = 0; i < sorted.length() - 1; i++) {
            if (sorted.charAt(i) == sorted.charAt(i + 1)) {
                System.out.println("Дубль найден " + sorted.charAt(i));
                break;
            }
            if (i == sorted.length()-2) {
                System.out.println("Дублей нет");
                break;
            }
        }
    }
    public static void main(String[] args) {
        duplicates("agjllkk");
        highYear(2024);
        clientDevice(1, 2015);
        days(20);
    }
}








