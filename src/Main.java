public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();

    }

    public static void task1() {

        int a = 27897;
        byte b = 67;
        short c = 569;
        long d = 987678965549L;
        double f = -159;
        float g = 27.12f;
        float i = 2.786f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(i);
    }

    public static void task2() {

        short Leaflets = 480;
        byte aClassroom = 23;
        byte bClassroom = 27;
        byte cClassroom = 30;
        int students = aClassroom + bClassroom + cClassroom;
        int onTheStudent = Leaflets / students;
        System.out.println("На каждого ученика рассчитано " + onTheStudent + " листов бумаги");
    }

    public static void task3() {

        byte bottlesTwoMinutes = 16;
        byte justAMinute = 16 / 2;

        byte twentyMinutes = 20;
        short minutesPerDay = 1440;
        short minutesThreeDays = 4320;
        int minutseMonthOfApril = 43200;

        int inTwentyMinutes = justAMinute * twentyMinutes;
        int inPerDay = justAMinute * minutesPerDay;
        int inThreeDayss = justAMinute * minutesThreeDays;
        int forTheMonthOfApril = justAMinute * minutseMonthOfApril;

        System.out.println("За 20 минут, машина производит " + inTwentyMinutes + " Штук бутылок");
        System.out.println("За один день, машина производит " + inPerDay + " Штук бутылок");
        System.out.println("За три дня, машина производит " + inThreeDayss + " Штук бутылок");
        System.out.println("За Апрель месяц, машина производит " + forTheMonthOfApril + " Штук бутылок");

    }

    public static void task4() {

        byte cansOfPaint = 120;
        int classroom = cansOfPaint / 6;
        int white = 2 * classroom;
        int brown = 4 * classroom;

        System.out.println("В школе, где " + classroom + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }

    public static void task5() {
        byte bananas = 5;
        byte bananaGram = 80;
        short milk = 2;
        byte milk100MlGram = 105;
        byte iceCreamBriquette = 2;
        short iceCreamBriquettegram = 2 * 100;
        byte eggs = 4;
        byte eggGram = 70;

        int cocktail = ((bananas * bananaGram) + (milk * milk100MlGram) + (iceCreamBriquette + iceCreamBriquettegram) +
                (eggs * eggGram));


        System.out.println(cocktail + " грамм в спорткоктейле");

        short oneKilogram = 1000;
        float aKilogramInACocktail = cocktail / 1000f;

        System.out.println(aKilogramInACocktail + " Кг в спорткоктейле");

    }

    public static void task6() {
        short sevenKilogram = 7000;
        short TheFirstOption = 250;
        short TheSecondOption = 500;
        int twoHundreDandFiftyGram = sevenKilogram / TheFirstOption;
        int fiveHundredRublesGram = sevenKilogram / TheSecondOption;
        int averageNumberOfDays = twoHundreDandFiftyGram + fiveHundredRublesGram / 2;

        System.out.println("Если по 250гр " + twoHundreDandFiftyGram + " дней");
        System.out.println("Если по 500гр " + fiveHundredRublesGram + "дней");
        System.out.println("В среднем " + averageNumberOfDays + " дней");
    }

    public static void task7() {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double masha1 = 67760 * 0.1;
        double denis1 = 83690 * 0.1;
        double kristina1 = 76230 * 0.1;

        System.out.println("Маша теперь получает " + (masha + masha1) + " рублей. Годовой доход вырос на " + masha1 + " рублей ");
        System.out.println("Денис теперь получает " + (denis + denis1) + " рублей. Годовой доход вырос на " + denis1 + " рублей ");
        System.out.println("Кристина теперь получает " + (kristina + kristina1) + " рублей. Годовой доход вырос на " + kristina1 + " рублей ");
    }

    public static void task8() {

        System.out.println("ДЗ номер 5");
        System.out.println("Здача 1-3");

        int age = 24;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

    }

    public static void task9() {
        System.out.println("Задача 2-3");
        int Degrees = 17;
        if (Degrees >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task10() {
        System.out.println("Задача 3-3");

        int KMH = 74;
        if (KMH >= 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task11() {
        System.out.println("Задача 4-7");
        int age = 47;
        boolean ItSTimeToSleep = age <= 2;
        if (ItSTimeToSleep) {
            System.out.println(" Если возраст человека равен " + age + " годам, пора спать ");
        }

        boolean needToGoToKindergarten = age >= 2 && age <= 7;
        if (needToGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age + " лет, нужно ходить в детский сад");
        }

        boolean needTogoToSchool = age >= 7 && age <= 18;
        if (needTogoToSchool) {
            System.out.println("Если возраст человека равен " + age + " лет,нужно ходить в школу");
        }
        boolean thatSHisPlaceAtTheUniversity = age >= 18 && age <= 24;
        if (thatSHisPlaceAtTheUniversity) {
            System.out.println("Если возраст человека равен " + age + " лет, нужно ходить в университет");
        }

        boolean itSTimeToGoToWork = age >= 24 && age <= 60;
        if (itSTimeToGoToWork) {
            System.out.println("Если возраст человека равен " + age + " лет, пора ходить на работу");
        }
        boolean itSTimeToRetire = age >= 60;
        if (itSTimeToRetire) {
            System.out.println("Если возраст человека равен " + age + " лет и более,пора на пенсию");
        }

    }


    public static void task12() {

        System.out.println("Задача 5-7");

        int age = 13;
        boolean youCanNotRideOnTheRides = age <= 5;

        if (youCanNotRideOnTheRides) {
            System.out.println("Если возраст равен " + age + " нельзя кататься на аттракционе");
        }

        boolean heCanOnlyRideWithAnAdult = age >= 5 && age <= 14;

        if (heCanOnlyRideWithAnAdult) {
            System.out.println("Если возраст равен " + age + " он может кататься только в сопровождении взрослых");
        }

        boolean heCanRideWithoutAnAdultAccompanyingHim = age >= 14;

        if (heCanRideWithoutAnAdultAccompanyingHim) {
            System.out.println("Если возраст равен " + age + " он может кататься");
        }

    }


    public static void task13() {

        System.out.println("Здача 6-7");

        byte capacityOfOneTrainCar = 102;
        byte seating = 60;
        int human = 79;

        boolean thereAreNoSeatsInTheCar = capacityOfOneTrainCar <= human;

        if (thereAreNoSeatsInTheCar) {
            System.out.println("нету мест в вагоне");
        } else {
            System.out.println("есть места в вагоне ");
        }


        boolean sitting = human <= seating && human <= capacityOfOneTrainCar;

        if ( sitting ){
            System.out.println("есть сидячии места");}

        boolean standingPlaces = human >= seating && human <=capacityOfOneTrainCar;

        if (standingPlaces) {
            System.out.println("только стоячии места");
        }

    }
    public static void task14(){

        System.out.println("Задача 7-7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean oneMoreThanThree = one >= two;
        if (oneMoreThanThree) {
            System.out.println(one + " больше чем " + two);}
            else {
                System.out.println(one + " меньше чем " + two);}

            boolean twoOneMoreThanThree = two >= three;

            if (twoOneMoreThanThree){
                System.out.println( two + " больше чем " + three);}
            else {
                System.out.println( two + " меньше чем " + three);}

                boolean threeOneMoreThanThree = three >= two;
                if (threeOneMoreThanThree){
                    System.out.println("значит большее число из трех " + three );}
                 else {
                    System.out.println("значит большее число из трех " + two);

            }
        }

    }
