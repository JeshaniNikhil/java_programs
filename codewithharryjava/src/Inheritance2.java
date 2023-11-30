class base1
{
    public void cow()
    {
        System.out.println("Cow..");
    }
}
class derived1 extends base1 {
    public void dog()
    {
        System.out.println("Dog..");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        base1 bobj =new base1();
        bobj.cow();
        //bobj.dog(); derived class method can not be inherited by base class object
        derived1 dobj=new derived1();
        dobj.cow();
        dobj.dog();
    }
}