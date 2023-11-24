public class Main {
    public static void main(String[] args) {
        int[]marks={95,97,92};
        try {
            System.out.println(marks[5]);
        }catch (Exception exception) {
            System.out.println("array index out of bound");
        }
        System.out.println("hello");
    }
}