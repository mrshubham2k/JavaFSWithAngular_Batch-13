import java.io.FileInputStream;
import java.io.ObjectInputStream;



        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.io.ObjectInputStream;

public class TestDeserializable {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("country.txt"));
            Country c1=(Country) in.readObject();
            System.out.println(c1.getCountry() + c1.getPopulation());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

