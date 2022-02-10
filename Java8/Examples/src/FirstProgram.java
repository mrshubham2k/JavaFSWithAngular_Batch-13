import java.net.StandardSocketOptions;

//OOPS-->


class Mobile{
    String color;
    String brand;
    long modelNo;


    Mobile(String color, String brand, long modelNo){
        this.color = color;
        this.brand = brand;
        this.modelNo = modelNo;
    }

    public void call(){
        System.out.println("Calling ......");
    }

    public void playMusic(){
        System.out.println("playing music");
    }
}


public class FirstProgram {

    public static void main(String[] args) {

        Mobile obj0 = new Mobile("Black","Apple",10000123);
        System.out.println(obj0.brand);
        System.out.println(obj0.modelNo);
        obj0.call();

    }

}
