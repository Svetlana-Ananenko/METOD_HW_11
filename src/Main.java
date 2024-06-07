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
    public static int isLeapYear(int year) {
        boolean leapYearOn = (year % 4 == 0) && (year % 100 != 0);
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.print(year + " - високосный год ");
        } else if (year % 100 == 0) {
            System.out.print(year + " - не високосный год ");
        } else {
            System.out.print(year + " - не високосный год ");
        }
        return year;
    }

    /////////////////////////////////////////////////////////////////////////
    public static int isReleaseYearValid(int year, int os) {
        switch (os) {
            case 0:
                if (year <= 2015) {
                    System.out.print("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                } else {
                    System.out.print("Установите версию приложения для iOS по ссылке");
                    break;
                }
            case 1:
                if (year <= 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                } else {
                    System.out.print("Установите версию приложения для Android по ссылке");
                    break;
                }
        }
        return year;
    }

    //////////////////////////////////////////////////////////////////////////
    public static int calculateDeliveryDays(int distance, int day) {
        boolean EstimatedDeliveryTime = (distance >= 0) && (distance < 20);
        if (EstimatedDeliveryTime) {
            System.out.printf("Потребуется дней: %s %n", day);
        } else if (distance >= 20 && (distance < 60)) {
            System.out.printf("Потребуется дней: %s %n", day += 1);
        } else if (distance >= 60 && (distance < 100)) {
            System.out.printf("Потребуется дней: %s %n", day += 2);
        } else {
            System.out.println("Доставка не осущетсвляется");
        }

        return day;
    }
    /////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        taskOne();
        int year = 2024;
        isLeapYear(year);


        taskTwo();
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        isReleaseYearValid(clientDeviceYear, clientOS2);


        taskThree();
        int deliveryDistance = 95;
        int term = 1;
        calculateDeliveryDays(deliveryDistance, term);

    }
}