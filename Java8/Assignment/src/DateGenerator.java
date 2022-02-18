import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class DateGenerator {
    
    public void getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime locatDate = LocalDateTime.now();
        System.out.println(dtf.format(locatDate));
    }

    public static void main(String[] args) {
        DateGenerator obj = new DateGenerator();
        obj.getDate();
    }
    
    
}
