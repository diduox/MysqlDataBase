package homework;

import java.util.Objects;

public class ComplexTest {
    public static void main(String[] args) {
        Complex complex1 = new Complex(5,0);
        Complex complex2 = new Complex(7, 2);
        complex1.printInfo();
        complex2.printInfo();
        Complex complex3 = complex1.add(complex2);
        complex3.printInfo();
        complex3 = new Complex(5,0);
        if(complex3.equals(complex1)){
            System.out.println("两数相等");
        }
    }
}

class Complex{
    double real;
    double image;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    void printInfo(){
        if(this.image != 0)System.out.println(this.real + "+" + this.image + "i");
        else System.out.println(this.real);
    }

    Complex add(Complex a){
        Complex tmp = new Complex(a.getReal() + this.getReal(),a.getImage() + this.getImage());
        return tmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() 返回运行类型
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.image, image) == 0;
    }

}