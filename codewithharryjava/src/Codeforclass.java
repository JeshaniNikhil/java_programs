class Emp
{
    int id;
    String name;
    public void PrintDetails()
    {
        System.out.println("my id is:"+id);
        System.out.println("my name is:"+name);
    }
}
public class Codeforclass {
    public static void main(String[] args) {
Emp nikhil =new Emp();
Emp abc =new Emp();
nikhil.id=10;
abc.id=20;
nikhil.name="abcd";
abc.name="biuiyvy";
       nikhil.PrintDetails();
       abc.PrintDetails();
    }
}
