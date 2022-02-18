import java.util.*;


public class ListManager {



    public List<String> getArrayList(String[] arr){
        List<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        Collections.sort(list);

        return list;
    }

    public static List<String> removeElements(List<String> list1, List<String> list2){
        list1.removeAll(list2);
        return list1;
    }

    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("Abhishek");
//        list1.add("Sushil");
//        list1.add("Shashank");
//        list1.add("Rajnish");
//        list1.add("Ranjan");
//        list1.add("Aniket");
//        list1.add("Tondon");
//        List<String> list2 = new ArrayList<>();
//        list2.add("Sushil");
//        list2.add("Ranjan");
//        list2.add("Tondon");
//        System.out.println(removeElements(list1,list2));

        String[] arr = new String[7];
        arr[0] = "Tondon";
        arr[1] = "Sushil";
        arr[2] = "Ranjan";
        arr[3] = "Abhishek";
        arr[4] = "Rajnish";
        arr[5] = "Tondon";
        arr[6] = "Abhishek";

        ListManager l1= new ListManager();
//        System.out.println(l1.getArrayList(arr));




    }
}
