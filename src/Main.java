public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
        public static void task1(){

        int a = 27897;
        byte b = 67;
        short c = 569;
        long d = 987678965549L;
        double f =-159;
        float g = 27.12f;
        float i = 2.786f;

        System.out.println( a );
        System.out.println( b );
        System.out.println( c );
        System.out.println( d );
        System.out.println( f );
        System.out.println( g );
        System.out.println( i );
    }
    public static void task2(){

        short Leaflets = 480;
        byte aClassroom = 23;
        byte bClassroom = 27;
        byte cClassroom = 30;
        int students = aClassroom + bClassroom + cClassroom ;
        int onTheStudent = Leaflets / students;
        System.out.println("На каждого ученика рассчитано " + onTheStudent + " листов бумаги");
    }
    public static void task3(){

        byte bottlesTwoMinutes = 16;
        byte justAMinute = 16/2;

        byte twentyMinutes = 20;
        short minutesPerDay = 1440;
        short minutesThreeDays = 4320;
        int   minutseMonthOfApril = 43200;

        int inTwentyMinutes = justAMinute * twentyMinutes;
        int inPerDay = justAMinute * minutesPerDay;
        int inThreeDayss = justAMinute * minutesThreeDays;
        int forTheMonthOfApril = justAMinute * minutseMonthOfApril;

        System.out.println("За 20 минут, машина производит " + inTwentyMinutes + " Штук бутылок");
        System.out.println("За один день, машина производит " + inPerDay + " Штук бутылок");
        System.out.println("За три дня, машина производит " + inThreeDayss + " Штук бутылок");
        System.out.println("За Апрель месяц, машина производит " + forTheMonthOfApril + " Штук бутылок");

    }
    public static void task4(){

        byte cansOfPaint = 120;
        int classroom = cansOfPaint / 6;
        int white = 2 * classroom;
        int brown = 4 * classroom;

        System.out.println( "В школе, где " + classroom + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
}
    public static void task5(){
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
    float aKilogramInACocktail = cocktail / 1000f ;

    System.out.println(aKilogramInACocktail + " Кг в спорткоктейле");

}
    public static void task6(){
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
    public static void task7(){
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
}