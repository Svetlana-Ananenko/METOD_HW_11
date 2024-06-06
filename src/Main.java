public class Main {


    public static void task_1() {
        System.out.println(" \n  Задача №1 ");
    }

    public static void task_2() {
        System.out.println(" \n Задача №2 ");
    }

    public static void task_3() {
        System.out.println(" \n  Задача №3 ");
    }

    /////////////////////////////////////////////////////////////////////////

    public static int notLeapYear(int numberYear) {
        System.out.print("Год НЕ является високосным - " );
        return numberYear;

    }
    public static int leapYear(int numberYear) {
        System.out.print("Год является високосным - " );
        return numberYear;
    }


    /////////////////////////////////////////////////////////////////////////

    public static void releaseYear() {
        System.out.println( "Установите облегченную версию приложения для Android по ссылке" );

    }

    public static void checkSystemTelephone() {
        System.out.println( "\"Установите версию приложения для Android по ссылке\"" );

    }

    public static void releaseYear2 () {
        System.out.println( "\"Установите облегченную версию приложения для iOS по ссылке\"" );

    }

    public static void chekSystemTelephone2() {
        System.out.println( "\"Установите версию приложения для iOS по ссылке\"" );

    }

    //////////////////////////////////////////////////////////////////////////

    public static int requiredTime(int day) {
        System.out.printf( "Для доставки потребуется: %s день %n", day  );
        return day;
    }
    public static int requiredTime2(int day) {
        System.out.printf( "Для доставки потребуется: %s дня %n", day  );
        return day;
    }

    public static void requiredTime3() {
        System.out.println( "Доставка не осущетсвляется" );

    }



    /////////////////////////////////////////////////////////////////////////



    public static void main(String[] args){
        task_1();
        int year = 2021;
        int leapYear = year % 4;
        int year2 = year;
        int leapYear2 = year2 % 400;

        int year3 = year;
        int leapYearNot = year % 100;

        boolean leapYearOn = (year % 4 == 0) && (year % 100 != 0);

        if (year % 4 == 0 || year2 % 400 == 0) {
            System.out.println(leapYear(year));


        } else if (leapYearNot == 0) {
            System.out.println(notLeapYear(year));
        } else {
            System.out.println( notLeapYear(year));
        }

        task_2();
        int clientOS2 = 1;
        int clientDeviceYear = 2015;

        switch (clientOS2) {
            case 0:
                if (clientDeviceYear <= 2015 ) {
                    releaseYear2();
                    break; }
                else  {
                    chekSystemTelephone2();
                    break; }
            case 1:
                if (clientDeviceYear <= 2015 ) {
                    releaseYear();

                    break; }
                else {
                    checkSystemTelephone();

                    break; }
        }



        task_3();

        int deliveryDistance = 95;
        int term = 1;


        boolean EstimatedDeliveryTime = (deliveryDistance >= 0) && (deliveryDistance < 20);
        if (EstimatedDeliveryTime) {

            requiredTime (term);

        } else if  (deliveryDistance >= 20 && (deliveryDistance < 60)) {

            requiredTime2 (term+=1);

        } else if  (deliveryDistance >= 60 && (deliveryDistance < 100)) {

            requiredTime2 (term+=2);

        } else  {

            requiredTime3 ();
        }






    }
}