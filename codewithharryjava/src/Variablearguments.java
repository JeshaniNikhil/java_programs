public class Variablearguments {
public static int sum(int r,int...arr)
{
int result=r;
for (int a:arr){
result +=a;
}
return result;
}
public static void main(String[] args) {
    System.out.println(sum(10,20,30,40,50));
}
}
