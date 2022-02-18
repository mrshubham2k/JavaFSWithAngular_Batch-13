
enum Month {

    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April"),
    MAY("MAY"),
    JUNE("JUNE"),
    JULY("JULY"),
    AUG("AUGUST"),
    SEPT("SEPTEMBER"),
    OCT("OCTOBER"),
    NOV("NOVEMBER"),
    DEC("DECEMBER");
    private String name;

    private Month(String value) {
        this.name = value;
    }

    public String getName(){
        return this.name;
    }
}
public class TestEnum {
    public static void main(String[] args) {
        System.out.println("Using values() to get enum array");
        Month month = Month.APR;
        for(Month name : month.values()){
            System.out.println(name.getName());
        }
        System.out.println("");
        System.out.println("Using ordinal() to get index of enums");
        for(Month name : month.values()){
            System.out.println(name.getName()+" index is "+name.ordinal()+1);
        }

        System.out.println("");
        System.out.println("Using valueOf()");
        System.out.println(month.valueOf("OCT"));
    }
}


