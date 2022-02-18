import java.util.*;

public class UniqueCollection {

    public Set<String> getCollection(String[] arr){
        Set<String> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        return set;
    }

    public static void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "Tondon";
        arr[1] = "Sushil";
        arr[2] = "Ranjan";
        arr[3] = "Abhishek";
        arr[4] = "Rajnish";
        arr[5] = "Tondon";
        arr[6] = "Abhishek";
        UniqueCollection obj = new UniqueCollection();
        System.out.println(obj.getCollection(arr));

    }

}
