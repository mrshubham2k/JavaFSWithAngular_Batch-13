import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
        static final String MYFILEPATH= "C:/Users/shubh/OneDrive/Desktop/TestFile.txt";

        public static byte[] readFrFile(String fpath,int position,int size) throws IOException{


            RandomAccessFile ramFile=new RandomAccessFile(fpath,"r");
            ramFile.seek(position);
            byte [] bytes=new byte[size];
            ramFile.read(bytes);
            ramFile.close();
            return bytes;

        }
        public static void writeFile(String fpath,String text,int position) throws IOException{


            RandomAccessFile ramFilew=new RandomAccessFile(fpath,"rw");
            ramFilew.seek(position);
            ramFilew.write(text.getBytes());
            ramFilew.close();


        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub

            try {
                String s1=new String(readFrFile(MYFILEPATH, 5, 150));
                System.out.println(s1);
                writeFile(MYFILEPATH, "Hello this data is supposed to write to the file",148);
                System.out.println(s1);
                System.out.println("the data written...");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }

    }



