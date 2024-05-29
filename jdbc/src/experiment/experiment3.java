package experiment;
/*
public class experiment3 {
    public static void main(String args[ ]) {
        ChinaPeople chinaPeople=new ChinaPeople( );
        AmericanPeople americanPeople=new AmericanPeople( );
        BeijingPeople beijingPeople=new BeijingPeople( );
        chinaPeople.speakHello( );
        americanPeople.speakHello( );
        beijingPeople.speakHello( );
        chinaPeople.averageHeight( );
        americanPeople.averageHeight( );
        beijingPeople.averageHeight( );
        chinaPeople.averageWeight( );
        americanPeople.averageWeight( );
        beijingPeople.averageWeight( );
        chinaPeople.chinaGongfu( );
        americanPeople.americanBoxing( );
        beijingPeople.beijingOpera( ) ;
        beijingPeople.chinaGongfu( );
    }
}

class People {
    protected double weight,height;
    public void speakHello( ) {
        System.out.println("yayawawa");
    }
    public void averageHeight() {
        height=173;
        System.out.println("average height:"+height);
    }
    public void averageWeight( ) {
        weight=70;
        System.out.println("average weight:"+weight);
    }
}
class ChinaPeople extends People {
    //【代码1】 重写public void speakHello( )方法，要求输出类似“你好，吃饭了吗” 这样的汉语信息
    @Override
    public void speakHello() {
        System.out.println("你好，吃饭了吗");
    }

    //【代码2】 重写public void averageHeight( )方法，要求输出类似 “中国人的平均身高：168.78厘米”这样的汉语信息
    @Override
    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高：" + height + "厘米");
    }

    // 【代码3】  重写public void averageWeight( )方法，要求输出类似“中国人的平均体重：65公斤”这样的汉语信息
    @Override
    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重：" + weight + "公斤");
    }

    // 【代码4】 输出中国武术的信息，如“坐如钟，站如松，睡如弓”等
    public void chinaGongfu() {
        System.out.println("坐如钟，站如松，睡如弓");
    }
}

    class AmericanPeople  extends People {
        //【代码5】 重写public void speakHello()方法，要求输出类似“How do you do”这样的英语信息
        @Override
        public void speakHello() {
            System.out.println("How do you do");
        }

        // 【代码6】重写public void averageHeight( )方法
        @Override
        public void averageHeight() {
            height = 180;
            System.out.println("American's average height：" + height + "cm");
        }

        // 【代码7】重写public void averageWeight( )方法
        @Override
        public void averageWeight() {
            weight = 80;
            System.out.println("American's average weight：" + weight + "kg");
        }

        // 【代码8】 输出拳击的信息，如“直拳”、“钩拳”等
        public void americanBoxing() {
            System.out.println("直拳、钩拳");
        }
    }
    class BeijingPeople extends ChinaPeople {
   //【代码9】 重写public void speakHello( )方法，要求输出类似“您好”这样的汉语信息
        @Override
        public void speakHello() {
            System.out.println("您好");
        }
   //【代码10】 重写public void averageHeight( )方法
        @Override
        public void averageHeight() {
            height=120;
            System.out.println("北京人的平均身高："+height+"厘米");
        }
    //【代码11】  重写public void averageWeight( )方法
        @Override
        public void averageWeight() {
            weight=50;
            System.out.println("北京人的平均体重："+weight+"公斤");
        }

    //【代码12】 输出京剧的信息
        public void beijingOpera() {
            System.out.println("不如评剧");
        }
    }


*/