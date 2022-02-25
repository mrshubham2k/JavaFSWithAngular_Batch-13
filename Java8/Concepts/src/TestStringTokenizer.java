import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        StringTokenizer class in Java is used to break a string into tokens
//        for exaple-let string = "Hello world its me"
//        so token1=hello, token2=world, token3=its, token4=me(this is how it seperated

//        constructors of stringtokenizer
//        1-StringTokenizer(String),
//        2-StringTokenizer(String,delimiter(String)), delimiter is what you want to remove from the string
//        3-StringTokenizer(String,delimiter(String),return delimiter(boolean))
//        (if return delimiter-true then delimiters are considered as part of string else if false then not)

//      count the number of token- countToken() function is used

//        for iteration hasElement()/hasToken() and nextElement()/nextToken() is used!

//        System.out.println("Enter the string");
//        StringTokenizer st = new StringTokenizer(sc.nextLine());
//        System.out.println(st.countTokens());

        StringTokenizer st1 = new StringTokenizer("Hello : my : name : is : shubham",":",false);
        StringTokenizer st2 = new StringTokenizer("Hello : my : name : is : shubham",":",true);
        System.out.println("To count the number of token in the stringTokenizer" + st1.countTokens());
        System.out.println("When delimiter return type is false");
        while(st1.hasMoreElements()){
            System.out.print(st1.nextElement()+" ");
        }
        System.out.println("");
        System.out.println("When delimiter return type is true");
        while(st2.hasMoreElements()){
            System.out.print(st2.nextElement()+" ");
        }


    }




}
