class Employee2{
    int salary;
    String  name2;
    public int getSalary()
    {
        return salary;
    }
    public String getname(){
        return name2;
    }
    public void setname(String name){
        name2=name;
    }
}
public class classdef1 {
    public static void main(String[] args) {
Employee2 obj1=new Employee2();
obj1.salary=25000;
        System.out.println(obj1.getSalary());
obj1.setname("abcd");
        System.out.println(obj1.getname());
    }
}
