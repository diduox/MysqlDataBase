/*package experiment;

public class experiment2 {
    public static void main(String args[]){
        B b1=new B(10,20);
        b1.f();
        B b2=new B();
        b2.f();
        //1.调用B的有参构造器
        //x=10 y=20 z=300
        //2.x=10 y=20 z=300
        //3.调用B的无参构造器
        //x=100 y=200 z=800
        //4.x=100 y=200 z=800
    }

}
class A{
    int x,y;
    A(){
        x=100;
        y=200;
    }
    A(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class B extends A{
    int z;
    B(int x,int y){
        super(x,y);
        z=300;
    }
    B(){
        z=800;
    }
    public void f(){
        System.out.printf("x=%d,y=%d,z=%d\n",x,y,z);
    }
}
*/