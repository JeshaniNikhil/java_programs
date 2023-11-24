public class Main {
    public static void main(String[] args) {
        //primitive
        /*
        byte -1
        short -2
        int -4 1 2 3
        long -8
        float -4  12.2
        double-8
        char -2 a b c d
        boolean-1 true false
         */
        byte age=30;
        int phone=1234567890;
        long phone2=1234567890;
        float pi=3.14F;
        char letter='@';
        boolean is_adult=true;
        //non primitive
        String name="apu";
        String name2="aman";
        //length
        System.out.println(name.length());
        //concat
        System.out.println(name+" and "+name2);
        //charat
        System.out.println(name.charAt(1));
        //replace
        String name3=name.replace('a','b');
        System.out.println(name3);
        String name4="Aman and Appu";
        System.out.println(name4.substring(0,4));
    }
}