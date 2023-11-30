public class string {
    public static void main(String[] args) {
        String name=new String("Anonymous");
         System.out.printf(name);
         int len=name.length();
        System.out.println();
    System.out.println(len);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nonTrimedString="    abcd    ";
        System.out.println(nonTrimedString);
        System.out.println(nonTrimedString.trim());
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('y','r'));
        System.out.println(name.charAt(2));
        System.out.println(name.startsWith("Ano"));
        System.out.println(name.endsWith("ish"));
        System.out.println(name.indexOf("n"));
        System.out.println(name.indexOf("n",2));
        System.out.println(name.lastIndexOf("n"));
        System.out.println(name.equals("Anonymous"));
        System.out.println(name.equalsIgnoreCase("anonymous"));
    }
}
