package integer;
/*运行结果
1000
223
4.140000000000001
3.0
11
1a
10
100
100
100 
 */
/* 总结一下之前所学的经典异常？
   空指针异常 NullPointerException
   类型转换异常 ClassCastException
   数组下标越界异常 ArrayIndexOutOfBoundsException
   数字格式化异常 NumberFormatException
   
   Integer类当中有哪些常用的方法？
   static int parseInt(String s) 静态方法 类名调用
 
*/

public class Integer07 {
	public static void main(String[] args) {
		//手动装箱
		Integer x = new Integer(1000);
		
		//手动拆箱
		int y = x.intValue();
		System.out.println(y);
		
		Integer a = new Integer("123");
		//编译的时候没有问题，一切符合java语法，运行时会不会出现问题？
		//不是一个“数字”可以包装成Integer吗？不能。运行时出现异常。
		//java.lang.NumberFormatException
		//Integer b = new Integer("中文");   Exception in thread "main" java.lang.NumberFormatException: For input string: "中文"
		
		//java.lang.ArrayIndexOutOfBoundsException
		//int[] arr = {};
		//System.out.println(arr[1000]);		
		
		//重点方法
		/*static int parseInt(String s)
		静态方法，传参String，返回int
		网页上文本框中输入的100实际上是“100”字符串
		后台数据库中要求存储100数字，此时java程序需要将“100”转换成100数字
		*/
		int retValue = Integer.parseInt("123");  //String -转换-> int
		System.out.println(retValue + 100);
		
		//照葫芦画瓢
		double retValue2 = Double.parseDouble("3.14");
		System.out.println(retValue2 + 1);  //4.140000000000001 (精度问题)
		
		float retValue3 = Float.parseFloat("1.0");
		System.out.println(retValue3 + 2);
		
		//----------------以下内容作为了解，不需要掌握-----------------------
		//static String toBinaryString(int i)
		//静态的 将十进制转换成二进制字符串
		String binaryString = Integer.toBinaryString(3);
		System.out.println(binaryString);
		
		
		//static String toHexString(int i)
		//静态的 将十进制转换成十六进制字符串
		String hexString = Integer.toHexString(26);
		System.out.println(hexString);
		
		//static String toOctalString(int i)
		//静态的 将十进制转换成八进制字符串
		String octalString = Integer.toOctalString(8);
		System.out.println(octalString);
		
		//valueOf方法作为了解
		/*static Integer valueOf(int i)
		静态的: int --> Integer
		  static Integer valueOf(String s)
		静态的：int --> Integer
		*/	
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf("100");
		System.out.println(i1);
		System.out.println(i2);
		
		int i = 100;
		String s = i + "";
		System.out.println(s);
		
 
	}

}
 