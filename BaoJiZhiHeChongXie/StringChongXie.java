package baojizhi;
/*运行结果
false
true
java进阶
java进阶 
 */
/*java语言当中的字符串String有没有重写toString和equals方法？ 
  
  1 String类已经重写了equals方法，比较两个字符串不能使用==，必须使用equals 
  2 String类已经重写了toString方法。
  
  结论：
    java中基本数据类型比较是否相等，使用==。
    java中所有的引用数据类型统一使用equals方法来判断是否相等。
  
*/
public class StringChongXie {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "abc";
		
		//实际上String也是一个类，不属于基本数据类型
		//既然String是一个类，那么一定存在构造方法
		String s3 = new String("Test1");
		String s4 = new String("Test1");
		System.out.println(s3 == s4);	
		System.out.println(s3.equals(s4));
		
		String x = new String("java进阶");
		//如果String没有重写toString()方法，输出结果应该是@十六进制的地址
		System.out.println(x.toString());
		System.out.println(x);
	}

}
