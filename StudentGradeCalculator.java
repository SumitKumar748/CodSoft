import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\tWELCOME TO STUDENT GRADE CALCULATOR");
        int m,s,e,h,ss;
        float tm,ap,avgp;

        System.out.println("ENTER YOUR MARKS YOU SCORED IN THE FOLLOWING SUBJECT");
        System.out.print("MATHS :               ");
        m=sc.nextInt();
        System.out.print("SCIENCE :             ");
        s=sc.nextInt();
        System.out.print("SOCIAL STUDIES :      ");
        ss=sc.nextInt();
        System.out.print("ENGLISH :             ");
        e=sc.nextInt();
        System.out.print("HINDI :               ");
        h=sc.nextInt();
        tm=m+s+ss+e+h;
        ap=(tm/500)*100;
        avgp=ap;
        System.out.println("Total marks scored:         "+ tm);
        System.out.println("Average Percentage:         "+ ap+"%");
        if(avgp>=91.0)
            System.out.println("Your Grade is :             A1");
        else if(avgp<=90.0 && ap>=81.0  )
            System.out.println("Your Grade is :             A2");
        else if( avgp<=80.0 && ap>=71.0 )
            System.out.println("Your Grade is :             B1");
        else if( avgp<=70.0 && ap>=61.0)
            System.out.println("Your Grade is :             B2");
        else if( avgp<=60.0 && ap>=51.0 )
            System.out.println("Your Grade is :             C1");
        else if( avgp<=50.0 && ap>=41.0 )
            System.out.println("Your Grade is :             C2");
        else if( avgp<=40.0 && ap>=33.0 )
            System.out.println("Your Grade is :             D");
        else if ( avgp<33.0 )
            System.out.println("Your Grade is :             F");

    }
}
