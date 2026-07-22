package loops;

public class EvenNumbers {
    public static void main (String args []){

//        for ( int i = 2; i<=100 ; i++){
//            if( i%2 == 0)
//                System.out.println("EvenNumbers :- " + i);
//
//        }

        System.out.println("Numbers Divisible By 3 ");
        System.out.println("========================");
        for ( int i = 1; i<=100; i++){
            if ( i%3==0)

                System.out.println(i);
        }
    }
}
