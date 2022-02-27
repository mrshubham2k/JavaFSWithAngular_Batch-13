


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class Demo4 {
//
//    public boolean saveEmployeeDetails(int id, String name, String address, double price) {
//        try{
//            Class.forName("org.postgres.Driver");
//            Connection con= DriverManager.getConnection("jdbc:postgres://localhost:5432/demodb","postgres","root");
//            Statement st=con.createStatement();
//            st.executeUpdate("insert into employee VALUES ("+id+", '"+name+"', '"+address+"', "+price+");");
//            st.close();
//            con.close();
//            return true;
//        }catch(Exception cnfe){
//            cnfe.printStackTrace();
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Demo4 object = new Demo4();
//        if(object.saveEmployeeDetails(1,"Shubham","Varanasi",980000))
//            System.out.println("Record inserted");
//    }
//}