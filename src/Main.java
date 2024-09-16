
class A{
    private int x ,y;
    private void hello(){
        System.out.println("welcome");
    }
    public void set(int a,int b){
        x = a;
        y = b;
    }
    void show(){
        hello();
        System.out.println(x);
        System.out.println(y);
    }
}

public class Main {
   public static void main(String[] args){
       A n  =new A();
   n.set(10,20);
       n.show();

    }
}