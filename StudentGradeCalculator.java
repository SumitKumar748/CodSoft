import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tWELCOME TO STUDENT GRADE CALCULATOR");
        int m,s,e,h,ss;
        double tm,ap;

        System.out.println("ENTER YOUR MARKS YOU GET IN THE FOLLOWING SUBJECT");
        System.out.print("MATHS :     ");
        m=sc.nextInt();
        System.out.print("SCIENCE :     ");
        s=sc.nextInt();
        System.out.print("SOCIAL STUDIES :     ");
        ss=sc.nextInt();
        System.out.print("ENGLISH :     ");
        e=sc.nextInt();
        System.out.print("HINDI :     ");
        h=sc.nextInt();
        tm=m+s+ss+e+h;
        ap=(tm/500)*100;
        System.out.println("Total marks scored:   "+ tm);
        System.out.println("Average Percentage:   "+ap);
        if(ap>=91)
            System.out.println("Your Grade is :      A1");
        else if(ap<=90 && ap>=81  )
            System.out.println("Your Grade is :     A2");
        else if( ap<=80 && ap>=71 )
            System.out.println("Your Grade is :     B1");
        else if( ap<=70 && ap>=61)
            System.out.println("Your Grade is :     B2");
        else if( ap<=60 && ap>=51 )
            System.out.println("Your Grade is :     C1");
        else if( ap<=50 && ap>=41 )
            System.out.println("Your Grade is :     C2");
        else if( ap<=40 && ap>=33 )
            System.out.println("Your Grade is :     D");
        else if( ap<33 )
            System.out.println("Your Grade is :     F");
    }
}
