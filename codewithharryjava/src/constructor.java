class contest{
    public contest()
    {
        System.out.println("i am default Constructor");
    }
    public contest(String name)
    {
        System.out.println("i am parametrized constructor");
        System.out.println("name is:"+name);
    }
}
public class constructor {
    public static void main(String[] args) {
        contest obj1=new contest();
        contest obj2=new contest("abcd");
    }
}
