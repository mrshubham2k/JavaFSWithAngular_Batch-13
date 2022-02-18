import java.util.TreeSet;

class UserDetails implements Comparable<UserDetails>{
    private int id;
    private String name;

    public UserDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' ;
    }

    @Override
    public int compareTo(UserDetails o) {
        if(this.getId()-o.getId()<0){
            return -1;
        }
        else if(this.getId()-o.getId()>0){
            return 1;
        }
        else {
            return this.getName().compareTo(o.getName());
        }
    }
//
//    @Override
//    public int compareTo(UserDetails o) {
//        if(this.getId()-o.getId()<0){
//            return -1;
//        }
//        else if(this.getId()-o.getId()>0){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }


}

public class SortUserDetails {
    public static void main(String[] args) {
        TreeSet<UserDetails> user= new TreeSet<>();
        user.add(new UserDetails(102,"Rajesh"));
        user.add(new UserDetails(101,"Raj"));
        user.add(new UserDetails(101,"Animesh"));
        user.add(new UserDetails(103,"Saket"));
        user.add(new UserDetails(104,"Dhruv"));

        System.out.println(user);
    }


}
