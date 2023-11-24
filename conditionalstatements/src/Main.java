import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      //condtional statemens
      //if
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
      if(age>18)
      {
          System.out.println("you are valid for license");
      }
      // if-else
        if (age>18)
        {
            System.out.println("you are valid for license(if-else");
        }
        else
        {
            System.out.println("you are not valid for license");
        }
        //if-elseif ladder
        System.out.println("enter marks:");
        int marks=sc.nextInt();
        if(marks>90)
        {
            System.out.println("first class");
        } else if (marks>80) {
            System.out.println("second class");
        } else if (marks>40) {
            System.out.println("pass class");
        } else{
            System.out.println("fail");
        }
        //nested if-else
        if(marks>40)
        {
            if(marks>90)
            {
                System.out.println("first class");
            } else if (marks>80) {
                System.out.println("second class");
            } else if (marks>40) {
                System.out.println("pass class");
            }
        }
        else
        {
            System.out.println("fail");
        }
        //switch case
        char c='g';
        switch (c)
        {
            case 'r':
                System.out.println("red");
                break;
            case 'g':
                System.out.println("green");
                break;
            case 'b':
                System.out.println("blue");
                break;
            default:
                System.out.println("not valid");

        }

    }
}