import java.io.Console;

public class TestConsoleClass {

    public static void main(String[] args) {
        Console c1=null;
        try {
            c1=System.console();
            if(c1!=null)
            {

                String s1=c1.readLine();
                System.out.println(s1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }

}
