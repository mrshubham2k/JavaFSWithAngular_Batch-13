import java.util.Scanner;

class CheckGrade{
    int score;

    CheckGrade(int score){
        this.score = score;
    }

    public void check()
    {
        if(score<=100 && score>90)
            System.out.println("A");

        else if(score<=90 && score>80)
            System.out.println("B");

        else if(score<=80 && score>70)
            System.out.println("C");

        else
            System.out.println("Average");
    }
}

public class GradesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score:");
        int score = sc.nextInt();
        CheckGrade obj1 = new CheckGrade(score);
        obj1.check();
    }
}
