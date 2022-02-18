package com.myCollection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {


    public static void main(String args[]){
        List<Integer> obj1 = new ArrayList<>();
        List<Integer> obj2 = new ArrayList<>();

        obj1.add(12);
        obj1.add(35);
        obj1.add(95);
        obj1.add(45);
        obj1.add(66);
        obj1.add(48);
        obj1.add(81);

        System.out.println("Before Adding at Particular index "+obj1);
//        Add at particular index!

        obj1.add(0,1000);
        System.out.println("After adding at Particular(0th) index "+obj1);

//        remove element using index
        obj1.remove(3);
        System.out.println("Removal at index 3 happened "+obj1);

//        remove element using element itself
//        obj1.remove(66);
//        System.out.println("Removal of element 66"+obj1);

//        Adding all the element from list1 to list2
        obj2.addAll(obj1);
        System.out.println("Adding all the elements of list1 into list2 " + obj2);
        obj2.removeAll(obj1);

//        Adding elements from list1 to list2 but from particular index
        obj2.addAll(0, obj1 );
        System.out.println("Adding elements from list1 to list2 but from particular index number " + obj2);






    }


}
