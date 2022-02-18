import java.util.ArrayList;
import java.util.List;

public class Assignment1Q3 {
        public static void main(String s[ ]){
            List<String> list=new ArrayList<String>( );
            list.add("one");
//            list.add(2);  Incompatible type error
            System.out.println(list.get(0).length());
    }
}


