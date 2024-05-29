package homework;

public class test {
    public static void main(String[] args) {
    boolean boo = false;
    
    }
}
//4.类方法和类变量属于整个类，可以通过类名调用，也可以通过对象名调用。
//5.基本类型传值是直接将值传到栈中，调用结束栈就会销毁，而引用类型传值是针对地址进行修改，调用结束后修改仍然保留。
//6.D
//7.C




class A{
    private float a;
    static float b;

    void setA(float a){
        this.a = a;
    }
    void setB(float b){
        this.b = b;
    }
    float getA(){
        return a;
    }
    float getB(){
        return b;
    }
    void inputA(){
        System.out.println(a);
    }
    static void inputB(){
        System.out.println(b);
    }
}

class C{

    public void demo() {
    }
}
