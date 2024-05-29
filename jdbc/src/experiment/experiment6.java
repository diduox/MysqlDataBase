package experiment;

public class experiment6 {
        public static void main (String args[ ]){
            People people=new People( );
            for(int i=0;i<128;i++) {
                try
                {
                    people.printLetter((char)i);
                }
                catch(NoLowerLetter e)
                {
                    e.print();
                }
            }
            for(int i=0;i<128;i++) {
                try
                {
                    people.printDigit((char)i);
                }
                catch(NoDigit e)
                {
                    e.print( );
                }
            }
        }
    }

//【代码1】 类声明，声明一个Exception的子类NoLowerLetter
class NoLowerLetter extends Exception {
    public void print()  {
        System.out.printf("%c",'#');
    }
}
//【代码2】 类声明，声明一个Exception的子类NoDigit
class NoDigit extends Exception {
    public void print()  {
        System.out.printf("%c",'*');
    }
}
class People  {
    void  printLetter(char c) throws NoLowerLetter {
        if(c<'a'||c>'z') {
            NoLowerLetter noLowerLetter= new NoLowerLetter(); // 【代码3】 创建NoLowerLetter类型对象
           //【代码4】  抛出noLowerLetter
            throw noLowerLetter;
        }
        else {
            System.out.print(c);
        }
    }
    void  printDigit(char c) throws NoDigit {
        if(c<'1'||c>'9') {
            NoDigit noDigit= new NoDigit(); // 【代码5】 创建NoDigit()类型对象
            throw  noDigit;                 // 【代码6】 抛出noDigit
        }
        else {
            System.out.print(c);
        }
    }
}
