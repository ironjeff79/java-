package changLiang;

/*
关于java JDK中内置的一个类: java.lang.String
    1. String表示字符串类型，属于引用数据类型，不属于基本数据类型。
    2. 在java中随便使用双引号括起来的都是String对象。例如"abc" "def" "HelloWorld"
    3. java中规定，双引号括起来的字符串，是不可变的。
    4. 在JDK当中双引号括起来的字符串，例如"abc"都是直接存储在"方法区"的"字符串常量池"当中的。（为何?因为字符串在实际的开发中使用太频繁，为了执行效率）
    5. !!!注意：JDK新版本中"字符串常量池"被移动到"堆内存"中了
*/
public class String01{
    public static void main(String[] args){
        int i = 0; //i变量中保存的是100这个值
        String s = "ABC"; //s变量中保存的是字符串对象在“字符串常量池”当中的内存地址。不是"ABC",而是0x1111。
        
        //这两行代码表示底层创建了3个字符串对象，都在字符串常量池当中
        String s1 = "abcdef";
        String s2 = "abcdef" + "xy";
      
        //分析：这是使用new的方式创建的字符串对象。这个代码中的"xy"是从哪里来的？凡是双引号括起来的，都在字符串常量池中有一份。
        //注意!! new对象的时候，一定在堆内存中开辟空间
        String s3 = new String("xy");
        
        //"Hello"是存储在方法区的字符串常量中 所以这个"Hello"不会新建（因为这个对象已经存在了）
        String s4 = "Hello";
        String s5 = "Hello";
        //双等号比较的是变量中保存的内存地址。
        System.out.println(s1 == s2);
        
        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);
        
        //通过这个案例的学习可以知道，字符串对象之间的比较不能用双等号，应该调用String类的equals方法。
        //String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals
        System.out.println(x.equals(y)); //true
        
        String k = new String("testString");
        //"testString"这个字符串后面可以加"."  因为"testString"是一个String字符串对象。只要是对象都能调用方法。
        System.out.println("testString".equals(k));  //建议使用这种方式，因为这个可以避免空指针异常。
        System.out.println(k.equals("testString"));  //存在空指针异常的风险。
       
    }
}
