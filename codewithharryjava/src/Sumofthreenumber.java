import java.util.Scanner;
public class Sumofthreenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //sum of three number
        int a=10,b=20,c=30;
        System.out.println(a+b+c);
        //question 2
        //cgpa
        int sub1=80;
        int sub2=70;
        int sub3=50;
        float cgpa=(float)((sub1+sub2+sub3))/30;
        System.out.println(cgpa);
        //question 3
        System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println("hello "+name+" have a good day");
        //question 4 kilometer to miles
        System.out.println("Enter Kilometer:");
        float km=sc.nextFloat();
        float miles= (float) (km*0.621371);
        System.out.println("miles:"+miles);
        //question 5 int or not
        System.out.println("enter your number:");
        System.out.println(sc.hasNextInt());
    }
}