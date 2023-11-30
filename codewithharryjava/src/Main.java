import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //cbse student marks calculator
        float sci,math,eng,ss,hindi;
        System.out.println("Enter marks of 5 subjects:");
        System.out.println("Enter Marks of Maths:");
        math=sc.nextFloat();
        System.out.println("Enter Marks of science:");
        sci=sc.nextFloat();
        System.out.println("Enter Marks of english:");
        eng=sc.nextFloat();
        System.out.println("Enter Marks of s.s:");
        ss=sc.nextFloat();
        System.out.println("Enter Marks of hindi:");
        hindi=sc.nextFloat();
        float total=math+sci+eng+hindi+ss;
        System.out.println("Total is:"+total);
        System.out.println("Percentage is:"+total/5);
    }
}