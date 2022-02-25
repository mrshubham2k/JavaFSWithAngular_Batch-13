package SynchronizationExample;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class File{
    synchronized void readFile() throws IOException {
        FileReader fr=new FileReader("C:/Users/shubh/OneDrive/Desktop/TestSynchonization.txt");   //Creation of File Reader object
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }

    synchronized  void writeFile() throws IOException {
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            FileWriter output = new FileWriter("C:/Users/shubh/OneDrive/Desktop/TestSynchonization.txt");
            output.write("\n");
            output.write(data);

            output.close();
    }
}

public class SynchronizationQ extends Thread{
    public static void main(String[] args) throws IOException {
        File rd = new File();
        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Enter the text you want to write in the file");
                try {
                    rd.writeFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    rd.readFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
    }

