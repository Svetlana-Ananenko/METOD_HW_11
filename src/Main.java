public class Main {


    public static void taskOne() {
        System.out.println(" \n  Задача №1 ");
    }

    public static void taskTwo() {
        System.out.println(" \n Задача №2 ");
    }

    public static void taskThree() {
        System.out.println(" \n  Задача №3 ");
    }

    /////////////////////////////////////////////////////////////////////////

    public static void notLeapYear() {
        System.out.print(" - Год НЕ является високосным ");
    }

    public static void isLeapYear() {
        System.out.println(" - Год является високосным ");


    }


    /////////////////////////////////////////////////////////////////////////

    public static void checkReleaseYear() {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");

    }


    public static void checkSystemTelephone() {
        System.out.print("Установите версию приложения для Android по ссылке");

    }

    public static void checkReleaseYear2() {
        System.out.print("Установите облегченную версию приложения для iOS по ссылке");

    }

    public static void checkSystemTelephone2() {
        System.out.print("Установите версию приложения для iOS по ссылке");

    }

    //////////////////////////////////////////////////////////////////////////

    public static int calculateDeliveryDays(int day) {
        System.out.printf("Для доставки потребуется дней: %s %n", day);
        return day;
    }


    public static int calculateDeliveryDays2(int day) {
        System.out.printf("Для доставки потребуется дней: %s %n", day += 1);
        return day;
    }

    public static int calculateDeliveryDays3(int day) {
        System.out.printf("Для доставки потребуется дней: %s %n", day += 2);
        return day;
    }

    public static void calculateDeliveryDays4() {
        System.out.println("Доставка не осущетсвляется");

    }


    /////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        taskOne();
        int year = 2024;
        int leapYearNot = year % 100;
        boolean leapYearOn = (year % 4 == 0) && (year % 100 != 0);
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.print(year);
            isLeapYear();
        } else if (leapYearNot == 0) {
            System.out.print(year);
            notLeapYear();
        } else {
            System.out.print(year);
            notLeapYear();
        }


        taskTwo();
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        switch (clientOS2) {
            case 0:
                if (clientDeviceYear <= 2015) {
                    checkReleaseYear2();
                    break;
                } else {
                    checkSystemTelephone2();
                    break;
                }
            case 1:
                if (clientDeviceYear <= 2015) {
                    checkReleaseYear();
                    break;
                } else {
                    checkSystemTelephone();
                    break;
                }
        }


        taskThree();

        int deliveryDistance = 95;
        int term = 1;
        boolean EstimatedDeliveryTime = (deliveryDistance >= 0) && (deliveryDistance < 20);
        if (EstimatedDeliveryTime) {
            calculateDeliveryDays(term);
        } else if (deliveryDistance >= 20 && (deliveryDistance < 60)) {
            calculateDeliveryDays2(term);
        } else if (deliveryDistance >= 60 && (deliveryDistance < 100)) {
            calculateDeliveryDays3(term);
        } else {
            calculateDeliveryDays4();
        }
    }
}