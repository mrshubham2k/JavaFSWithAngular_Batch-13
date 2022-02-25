
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class concurrQueue implements Runnable{

    private ConcurrentLinkedQueue<String> conlinkqueue=new ConcurrentLinkedQueue<String>();

    public String dequeItem()
    {

        if(!conlinkqueue.isEmpty())
        {
            System.out.println("Queue size" + conlinkqueue.size());
            return conlinkqueue.remove();
        }
        else {
            return null;
        }
    }
    private void enqueitem(String item)
    {
        System.out.println("Enque the item in the queue " +item);
        conlinkqueue.add(item);
    }

    public int getQueuSize()
    {

        if(!conlinkqueue.isEmpty()) {
            return conlinkqueue.size();
        }
        else {
            return 0;
        }
    }
    @Override
    public void run() {

        for(int i=0;i<10;i++)
        {
            enqueitem("String" + i);
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}

class client implements Runnable {
    private concurrQueue crq;

    public client(concurrQueue cq)
    {
        this.crq=cq;
        System.out.println(cq.getQueuSize());

    }


    @Override
    public void run() {
        // TODO Auto-generated method stub
        boolean stopcondition = (crq.getQueuSize()==0);
        while(!stopcondition)
        {
            for(int i=0;i<crq.getQueuSize();i++)
            {
                System.out.println("Client wants to deque item" + crq.dequeItem());

                try {
                    Thread.sleep(1300);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                stopcondition = crq.getQueuSize()==0;
            }
            System.out.println("Client Process exiting...");
        }
    }

}

public class TestConcurrentQueue  implements Executor{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Executor exe=new TestConcurrentQueue();
        concurrQueue cq=new concurrQueue();
        exe.execute(cq);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        client ncq = new client(cq);
        exe.execute(ncq);
    }

    @Override
    public void execute(Runnable r) {
        // TODO Auto-generated method stub
        new Thread(r).start();
    }

}
