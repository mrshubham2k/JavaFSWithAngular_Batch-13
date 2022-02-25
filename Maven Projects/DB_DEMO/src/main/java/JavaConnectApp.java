import java.sql.*;
import java.util.Scanner;

public class JavaConnectApp {
    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sseth@2000");
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the choice " );
            System.out.println("Create table:1");
            System.out.println("Read table:2");
            System.out.println("Update table:3");
            System.out.println("Delete tabel:4");
            int choice = sc.nextInt();
            st=con.createStatement();
//            String create = "CREATE TABLE library (book_id INT PRIMARY KEY, " +
//                    "book_name VARCHAR(255) NOT NULL, author VARCHAR(255), " +
//                    "publish_year VARCHAR(255),price INT NOT NULL)";
//
//            st.execute(create);


            switch(choice){
                case 1:{

                        String add1 = "INSERT INTO library(book_id,book_name,author,publish_year,price)" +
                                "Values(1,'The Hunger Games','Suzanne Collins','2015',599)";
                        st.execute(add1);

                    String add2 = "INSERT INTO library(book_id,book_name,author,publish_year,price)" +
                            "Values(2,'To Kill a Mockingbird','Harper Lee','2000',499)";
                    st.execute(add2);
                    String add3 = "INSERT INTO library(book_id,book_name,author,publish_year,price)" +
                            "VALUES(3,'Lady Boss','Henrich','2011',849)";
                    st.execute(add3);
                    String add4 = "INSERT INTO library(book_id,book_name,author,publish_year,price)" +
                            "VALUES(4,'The Love of My Life','CB','2020',359)";
                    st.execute(add4);

                    System.out.println("Details Added");
                    break;
                }

                case 2:{
                    String read = "SELECT * FROM library";
                    ResultSet result = st.executeQuery(read);
                    System.out.println("Library Details");
                    while(result.next()){
                        System.out.println("book_id: "+result.getInt(1));
                        System.out.println("book_name: "+result.getString(2));
                        System.out.println("author: "+result.getString(3));
                        System.out.println("publish_year: "+result.getString(4));
                        System.out.println("price: "+result.getInt(5));
                        System.out.println("----------------------------------------------------------------------------");
                    }
                    break;
                }

                case 3:{
//                    String update1 = "UPDATE library SET book_id=7 WHERE (book_id=1)";
                    String update2 = "UPDATE library SET price=999 WHERE (book_id=1)";
//                    st.execute(update1);
                    st.execute(update2);
                    System.out.println("Updated!");
                    break;
                }

                case 4:{
                    String delete = "DELETE FROM library WHERE book_id=1";
                    st.execute(delete);
                    System.out.println("Deleted!");
                    break;
                }

                default:
                    System.out.println("Wrong Choice!");
            }

        } catch (SQLException e) {
            System.out.println("Not Connected");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Not Connected");
            e.printStackTrace();
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
