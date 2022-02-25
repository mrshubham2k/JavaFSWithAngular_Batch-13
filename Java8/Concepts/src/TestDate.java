import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {

        Date d1, d2, d3, d4, d5, d6;
        Date obj1 = new Date();
        System.out.println(obj1);
        System.out.println(obj1.getTime());


//        How to convert date into simple form
        DateFormat date1 = new SimpleDateFormat();
        System.out.println("Date in simple format"+(date1.format(obj1)));



        d1 = new Date(2014,6, 14);
        d2 = new Date(2014, 4, 14);
        d3= new Date(2014, 6,30);
        d4 = new Date(2014,6,30);
        d5= new Date(2015, 1, 1);
        d6= new Date (2014, 12, 31);

        System.out.println("the result for before method: "+d1. before (d2));
        System.out.println("the result for equals method: "+d3.equals(d4));
        System.out.println("the result for after method: "+d5.after (d6));
        System.out.println("using compareTo method: "+d2.compareTo(d1));
        System.out.println("using compareTo method: "+d3.compareTo (d4));
        System.out.println("using compareTo method: "+d5.compareTo (d6));
        System.out.println("using getTime method");
        System.out.println("the time passed since "+d6+" is "+d5.getTime());
    }


}
