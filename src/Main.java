public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Задача 1
        System.out.println("ЗАДАЧА 1");

        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("-------------------------------");

        // Задача 2
        System.out.println("ЗАДАЧА 2");

        short clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("-------------------------------");

        // Задача 3
        System.out.println("ЗАДАЧА 3");

        short year = 2021;

        if (year < 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("-------------------------------");

        // Задача 4
        System.out.println("ЗАДАЧА 4");

        byte deliveryDistance = 95;
        byte dayNeed = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance >= 20) {
                dayNeed++;
            }
            if (deliveryDistance >= 60) {
                dayNeed++;
            }
            System.out.println("Потребуется дней: " + dayNeed);
        }

        System.out.println("-------------------------------");

        // Задача 5
        System.out.println("ЗАДАЧА 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}