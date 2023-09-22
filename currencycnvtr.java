import java.sql.SQLOutput;
import java.util.Scanner;
class currecncycnvtr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input,output,output1;
        System.out.println("Welcome to Currency Converter!");

        System.out.println("1. USD to INR");
        System.out.println("2. USD to EUR");
        System.out.println("3. USD to JPY");
        System.out.println("4. EUR to INR");
        System.out.println("5. EUR to USD");
        System.out.println("6. EUR to JPY");
        System.out.println("7. INR to USD");
        System.out.println("8. INR to EUR");
        System.out.println("9. INR to JPY");

        System.out.print("Select your option:     ");
        input=sc.nextInt();
        System.out.print("Enter the amount:   ");
        output=sc.nextDouble();


        if(input==1 )
        {
            output1=output*83.32;
            System.out.println(input+" USD equals to "+output1+" INR");
        }
        else if(input==2 )
        {
            output1=output*0.94;
            System.out.println(input+" USD equals to "+output1+" EUR");
        }
        else if(input==3 )
        {
            output1=output*147.63;
            System.out.println(input+" USD equals to "+output1+" JPY");
        }
        else if(input==4 )
        {
            output1=output*88.85;
            System.out.println(input+" EUR equals to "+output1+" INR");
        }
        else if(input==5 )
        {
            output1=output*1.07;
            System.out.println(output+" EUR equals to "+output1+" USD");
        }
        else if(input==6 )
        {
            output1=output*157.48;
            System.out.println(output+" EUR equals to "+output1+" JPY");
        }
        else if(input==7 )
        {
            output1=output*0.012;
            System.out.println(output+" INR equals to "+output1+" USD");
        }
        else if(input==8 )
        {
            output1=output*0.011;
            System.out.println(output+" INR equals to "+output1+" EUR");
        }
        else if(input==9 )
        {
            output1=output*1.77;
            System.out.println(output+" INR equals to "+output1+" JPY");
        }
        else
        {
            System.out.println("Not valid option");
        }










    }
}
