package integer;
/*运行结果
int的最大值： 2147483647
int的最小值： -2147483648
byte的最大值： 127
 
*/
/*
 在JDK1.5之后，支持自动拆箱和自动装箱。 
*/
public class Integer04 {
	public static void main(String[] args) {
		//通过访问包装类的常量，来获取最大值和最小值。
		System.out.println("int的最大值： " + Integer.MAX_VALUE);
		System.out.println("int的最小值： " + Integer.MIN_VALUE);
		System.out.println("byte的最大值： " + Byte.MAX_VALUE);
		
		//自动装箱 int类型 -自动转换为-> Integer
		Integer x = 100;
		
		//自动拆箱 Integer -自动转换为-> int
		Integer y = x;
	}

}
