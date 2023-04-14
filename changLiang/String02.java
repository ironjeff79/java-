package changLiang;
/*
分析以下程序，一共创建了几个对象
*/

public class String02{
	public static void main(String[] args){
    /*一共3个对象：
    方法区字符串常量池中有1个"halo"
    堆内存当中有两个String对象
    */
    String s1 = new String("halo");
    String s2 = new String("halo");
    }
}
