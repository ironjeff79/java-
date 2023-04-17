package changLiang;
/*运行结果
ab3.14true100一
helloworld
*/
/*
在实际开发中，如果需要进行字符串的频繁拼接，会有什么问题？
    因为java中的字符串是不可变的，每一次拼接都会产生新的字符串。
    这样会占用大量的方法区内存，造成内存空间的浪费。
    String s = "abc";
    s += "hello";
    就以上两行代码，就导致在方法区字符串常量池当中创建了3个对象。"abc""hello"和"abchello"

如果需要进行大量字符串的拼接操作，建议使用JDK中自带的：
 
 1.1 java.lang.StringBuffer
    底层实际上是一个byte[] 数组，往StringBuffer中放字符串，实际上是放到byte数组当中了。 StringBuffer初始化容量是16。
    
    ***注意 如果是JDK8底层是char数组，JDK8之后才是byte数组
 1.2 如何优化stringBuffer的性能？
       关键点：给一个合适的初始化容量 可以提高程序的执行效率
       在创建stringBuffer的时候尽可能给定一个初始化容量
       最好减少底层数组的扩容次数
  
  !!!  面试题 String为什么是不可变的？
       源代码中，String类中有一个byte[]数组，这个byte[]数组采用了final修饰，因为数组一旦创建长度不可变。
       并且被final修饰的引用，一旦指向某个对象之后，不可再指向其他对象，所以String是不可变的。
       
       StringBuilder/StringBuffer为什么是可变的呢？
       源代码中，StringBuilder/StringBuffer内部实际上是一个byte[]数组，这个byte[]数组没有被final修饰。
       StringBuilder/StringBuffer的初始化容量是16，当存满之后会进行扩容，底层调用了数组拷贝的方法。
       System.arraycopy(); 是这样扩容的。
       所以StringBuilder/StringBuffer适合于使用字符串的频繁拼接操作。
       
       String s = "abc";
       s变量是可以指向其他对象的。
       字符串不可变不是说变量不可变。说的是"abc"这个对象不可变。是双引号里面的字符串对象一旦创建不可变。
*/

public class StringBuffer{
    public static void main(String[] args){
        //创建一个初始化容量为16个byte[] 的数组。（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();
        //拼接字符串，以后拼接字符串统一调用append()方法。
        stringBuffer.append("a"); //调的是父类的追加方法 
        stringBuffer.append("b");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);
        stringBuffer.append("一");
        System.out.println(stringBuffer);
        //指定初始化容量的stringBuffer对象（字符串缓冲区对象）
        stringBuffer sb = new stringBuffer(100); 
        sb.append("hello");
        sb.append("world");
        System.out.println(sb.toString());
    }
}

