package changLiang;
/*运行结果
hello world!
abc
bc
我是中国人
中国人
HelloWorld!
 
*/
/*
关于String类中的构造方法
    1. String s = new String("");
    2. String s = " ";  最常用
    3. String s = new String(char数组);
    4. String s = new String(char数组,起始下标,长度);
    5. String s = new String(byte数组);
    6. String s = new String(byte数组,起始下标,长度);
*/

public class String03{
    public static void main(String[] args){
        //创建字符串对象最常用的一种方式
        String s1 = "hello world!";
        //s1这个变量中保存的是一个内存地址。按说应该输出一个地址
        //但是输出的是一个字符串，说明String类已经重写了toString()方法。
        System.out.println(s1); 
       
        //这里只掌握常用的构造方法
        byte[] bytes = {97,98,99}; //97是a,98是b,99是c
        String s2 = new String(bytes); 
        //输出一个引用的时候，会自动调用toString()方法，默认Object的话，会自动输出对象的内存地址。
        //通过输出结果我们得出一个结论：String类已经重写了toString()方法
        //输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身。
        System.out.println(s2); //abc
        
        //String(字节数组,数组元素下标的起始位置,长度)
        //将byte数组中的一部分转换成字符串。
        String s3 = new String(bytes,1,2);
        System.out.println(s3); //bc 
        
        //将char数组全部转换成字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);
        //将char数组的一部分转换成字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);
        
        String s6 = new String("HelloWorld!");
        System.out.println(s6);
    }
}
