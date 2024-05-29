/*
package experiment;

public class experiment1 {
    public static void main(String args[]){
        B b=new B();
        //1.调用A的构造器A
        //2.调用B的构造器B
        //3.y = 21
        //4.y = 31,x = 10
        //5.y = 32
        b.g();
        b.f();
        b.g();
    }

}
class A{
    private int x=10;
    protected int y=20;
    public A(){
        System.out.println("A");
    }
    void f(){
        y=y+x;
        System.out.printf("x=%d,y=%d\n",x,y);
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
    void g(){
        y=y+1;
        System.out.printf("y=%d\n",y);
    }
}
*/