public class StringQ2 {

    public static void printCharByChar(String str){
        for(int i=0;i<=str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = new String("Shubham");
        try{
            printCharByChar(str);
        }catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
