public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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




}