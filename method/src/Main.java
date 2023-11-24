public class Main {
    public static void printjava(){
        System.out.println("hello java");
    }
    public static void printname(String name){
        System.out.println(name);
    }
    public static void sum(int a,int b){
        int c=a+b;
        System.out.println("sum:"+c);
    }
    public static void main(String[] args) {
        printjava();
        printname("hi");
        sum(1,5);
    }
}