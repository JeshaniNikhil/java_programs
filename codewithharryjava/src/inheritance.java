class Base
{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base
{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Derived dobj=new Derived();
        dobj.setX(10);
        System.out.println(dobj.getX());
        dobj.setY(20);
        System.out.println(dobj.getY());
    }
}
