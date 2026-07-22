package wrapper;
class ThisKeyword{
    int x ;
    int y ;

    void setValues(int x , int y)
    {
       this.x = x ;
       this.y = y ;
    }
    void displayValues()
    {
        System.out.println("=================================  ");
        System.out.println("        Printing Numbers           ");
        System.out.println("=================================  ");
        System.out.println("First Number :- " + x);
        System.out.println("Second  Number :- " + y);
        System.out.println();
    }
}

public class ThisKeywordDemo {
    public static void main (String args [])
    {
        ThisKeyword k1 = new ThisKeyword();
        k1.setValues(50 , 100);
        k1.displayValues();

    }
}
