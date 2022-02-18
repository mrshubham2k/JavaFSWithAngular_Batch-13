

import java.util.*;

public class TestListCollection {
    static  void ArrayListMethod(){
        List<Object> list1 = new ArrayList<>();
        list1.add("Manisha");
        list1.add(1);
        list1.add(10.2);

        System.out.println("Using Object as a Datatype"+list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Shubham");
        list2.add("Manisha");
        list2.add("Anonymous");

        for(String element: list2){
            System.out.println(element);
        }

    }

    static  void LinkedListMethod(){
        List<String> list = new LinkedList<>();
        list.add("Manisha");
        list.add("Daksh");
        list.add("Harshada");
        System.out.println("=============================Linked list ===========================");
        for(String s : list){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
//        ArrayListMethod();
//        LinkedListMethod();
        Deque<String> obj1 = new ArrayDeque<>();

        obj1.add("Manisha");
        obj1.add("Daksh");
        obj1.add("Harshada");
        obj1.add("Harsha");
        obj1.addFirst("1029");
        obj1.addLast("JAI");

        System.out.println(obj1);
        obj1.removeFirst();
        obj1.removeLast();
        System.out.println("after removal of elements");

        Iterator<String> itr = obj1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
