import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayList extends Thread {

    static CopyOnWriteArrayList<String> alobj=new CopyOnWriteArrayList<>();
    public void run()
    {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Adding element to arraylist");
            e.printStackTrace();

        }
        alobj.add("101");

    }

    public static void main(String [] args)
    {
        alobj.add("7");
        alobj.add("8");
        alobj.add("9");
        ConcurrentArrayList conl=new ConcurrentArrayList();
        conl.start();
        Iterator<String> it=alobj.iterator();
        while(it.hasNext())
        {

            System.out.println(it.next());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

