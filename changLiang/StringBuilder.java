package changLiang;

/*
  使用StringBuilder也可以完成字符串的拼接
  
  StringBuffer和StringBuilder的区别？
  StringBuffer中的方法都有： “synchronized”关键字修饰 表示StringBuffer在多线程环境下运行是安全的
  StringBuilder中的方法都没有： “synchronized”关键字修饰 表示表示StringBuilder在多线程环境下运行是不安全的

*/

public class StringBulider{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(); //初始化容量是16
        sb.append(100);
        sb.append(true);
        sb.append("hello");
        sb.append("Kitty");
        System.out.println(sb);  
    }
}
