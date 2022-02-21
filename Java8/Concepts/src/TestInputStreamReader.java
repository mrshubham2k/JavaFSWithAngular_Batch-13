import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {

    public static void main(String[] args) {
        //FileInputStreamReader reads the data from file
        // InputStreamReader data in bytes into data in character
        char [] streams= new char[200];


        try {
            FileInputStream f1 = new FileInputStream("C:/Users/shubh/OneDrive/Desktop/TestFile.txt");
            InputStreamReader isr=new InputStreamReader(f1);

            isr.read(streams);
            System.out.println("The characters from the files are");
            System.out.println(streams);

            isr.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some lines");
        try {
            String lines=br.readLine();
            if(lines.length()<=0)
            {
                System.err.println("Enter the text..");
            }
            else {
                System.out.println("You entered!!  " + lines);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}

