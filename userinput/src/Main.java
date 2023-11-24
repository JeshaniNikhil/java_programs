import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // int input
        Scanner sc= new Scanner(System.in);
        System.out.println("enter roll no");
        int roll=sc.nextInt();
        System.out.println("roll no is "+roll);
        // string input
        System.out.println("enter name:");
        String name=sc.next();
        System.out.println("name is:"+name);
        //word (token)input
        System.out.println("enter div:");
        String div=sc.next();
        System.out.println("div is :"+div);
        // float input
        System.out.println("enter your percentage:");
        float per=sc.nextFloat();
        System.out.println("your percentage is:"+per);
    }
}