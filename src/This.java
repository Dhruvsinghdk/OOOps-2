

class Js{
    private  int x;
    public Js(int x){
//        System.out.println("constructore");
        this.x = x;
    }
    void show(){
        System.out.println(x);
    }
}


public class This {
    public static void main(String[] args) {
        Js n = new Js(10);
        n.show();
    }
}
