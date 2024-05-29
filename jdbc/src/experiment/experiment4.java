package experiment;
/**
 * 4、 编写程序实现以下逻辑。
 * ① 抽象类Animal具有一个抽象方法cry。
 * ② 类Dog继承Animal，并实现cry方法。
 * ③ 类Cat继承Animal并实现cry方法。
 * 编写测试类，分别实现抽象类实现多态，利用方法的Animal参数实现多态。
 */
/*
public class experiment4 {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        animal1.cry();
        Animal animal2 = new Dog();
        animal2.cry();
    }
}

abstract class Animal{
    abstract public void cry();
}

class Dog extends Animal{
    public void cry(){
        System.out.println("狗叫");
    }
}
class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("猫叫");
    }
}
*/