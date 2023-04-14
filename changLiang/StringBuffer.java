package changLiang;

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

