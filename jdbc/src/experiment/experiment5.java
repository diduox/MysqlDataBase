package experiment;
/**
 * 5. 编写程序实现以下逻辑。
 * ① 接口Animal具有一个抽象方法cry。
 * ② 类Dog实现Animal接口，并实现cry方法。
 * ③ 类Cat实现Animal接口并实现cry方法。
 * 编写测试类，分别实现接口实现多态，利用方法的Animal接口参数实现多态。
 */

public class experiment5 {
    public static void main(String[] args) {
    Animal animal1 = new Cat();
    animal1.cry();
    Animal animal2 = new Dog();
    animal2.cry();
    }
}

interface Animal{
    public void cry();
}

class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("狗叫");
    }
}
class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("猫叫");
    }
}
