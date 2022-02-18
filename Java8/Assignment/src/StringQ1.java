public class StringQ1 {
    public static void main(String[] args) {
        StringBuilder sbd1 = new StringBuilder("Shubham");
        StringBuffer sb1 = new StringBuffer(" Seth");
        StringBuffer sb2 = new StringBuffer("Anonymous");

        System.out.println("StringBuilder and StringBuffer concatenation : "+ sbd1.append(sb1));

        System.out.println("Substring of string buffer "+sb2+" is : "+sb2.substring(1,5));

        String s1 = new String("Shubham");
        StringBuilder sbd2 = new StringBuilder("Shubham");
        StringBuffer sb3 = new StringBuffer("Shubham");

        System.out.println("String length : "+ s1.length());

        System.out.println("");

        System.out.println("StringBuilder length : "+ sbd2.length());
        System.out.println("StringBuilder Capacity : "+ sbd2.capacity());

        System.out.println("");

        System.out.println("StringBuffer length : "+ sb3.length());
        System.out.println("StringBuffer Capacity  :"+sb3.capacity());


    }





}
