
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Country{
    private String country;
    private int population;

    public Country(String country, int number) {
        this.country = country;
        this.population = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int number) {
        this.population = number;
    }
}

public class TestSerializable {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        Country c1=new Country("India",93849849);
        try {
            FileOutputStream fout=new FileOutputStream("country.txt");
            ObjectOutputStream obj=new ObjectOutputStream(fout);
            obj.writeObject(c1);
            obj.flush();
            obj.close();
            System.out.println("suceesfully serialized..");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

