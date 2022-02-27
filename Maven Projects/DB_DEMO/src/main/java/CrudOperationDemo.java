
import java.sql.*;
import java.util.Scanner;

public class CrudOperationDemo {

    public static void insertValues(int bookId, String bookName, String authorName, String year, double price) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sseth@2000");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into library VALUES ("+bookId+", '"+bookName+"', '"+authorName+"', '"+year+"', "+price+");");
            System.out.println("Record Added in Table!");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void readLibrary() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sseth@2000");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from library;");
            System.out.println("[ ID    Book-Name    Author     Year     Price");
            while(rs.next()) {

                String bookId= rs.getString(1);
                String bookName= rs.getString(2);
                String authorName=rs.getString(3);
                String year=rs.getString(4);
                String price=rs.getString(5);
                System.out.println("[ "+bookId + "     " + bookName + "      " + authorName + "      " + year + "      " + price+"  ]");
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void updateTable(int id, String bookName, String authorName, int year, double price) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sseth@2000");
            Statement st=con.createStatement();
            st.executeUpdate("UPDATE library SET book_name = '"+bookName+"' WHERE book_id = "+id+";");
            st.executeUpdate("UPDATE library SET author = '"+authorName+"' WHERE book_id = "+id+";");
            st.executeUpdate("UPDATE library SET publish_year = '"+year+"' WHERE book_id = "+id+";");
            st.executeUpdate("UPDATE library SET price = '"+price+"' WHERE book_id = "+id+";");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void deleteById(int id) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sseth@2000");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("delete from library where book_id = "+id+";");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose option \nPress 1 to Insert values into Table\nPress 2 to View the Table Content" +
                    "\nPress 3 to udpdate the table\nPress 4 to delete the column \nPress 5 to exit");
            int check=sc.nextInt();
            switch(check) {
                case 1: {
                    System.out.println("Enter the number of entries: ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++) {
                        System.out.println("Enter the book id:");
                        int bookId = sc.nextInt();
                        System.out.println("Enter the book name:");
                        String bookName = sc.next();
                        System.out.println("Enter the author name:");
                        String authorName = sc.next();
                        System.out.println("Enter the book publish year:");
                        String year = sc.next();
                        System.out.println("Enter the price:");
                        int price = sc.nextInt();
                        insertValues(bookId, bookName,authorName , year, price);
                    }
                    break;
                }
                case 2:
                {
                    readLibrary();
                    break;
                }
                case 3:
                {
                    readLibrary();
                    System.out.println("Enter the id of which you want to Update");
                    int bookId=sc.nextInt();
                    System.out.println("Enter Book Name");
                    String bookName=sc.next();
                    System.out.println("Enter Book Author");
                    String authorName=sc.next();
                    System.out.println("Enter year of publish");
                    int year=sc.nextInt();
                    System.out.println("Enter price");
                    double price=sc.nextInt();
                    updateTable(bookId,bookName,authorName,year,price);
                    System.out.println("After Updation");
                    readLibrary();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the id of which you want to delete");
                    int bookId=sc.nextInt();
                    deleteById(bookId);
                    System.out.println("After Deletion");
                    readLibrary();
                    break;
                }
                default: System.exit(0);
            }
        }
    }
}