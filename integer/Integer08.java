package integer;

/*运行结果
101
1001
123

String int Integer 之间互相转换
 
*/

public class Integer08 {
	public static void main(String[] args) {
		//String --> int
		String s1 = "100";
		int i1 = Integer.parseInt(s1);
		System.out.println(i1 + 1);
		
		//int --> String
		String s2 = i1 + "";
		System.out.println(s2 + 1);
		
		//int --> Integer
		//自动装箱
		Integer x = 1000;
		
		//Integer --> int
		//自动拆箱
		int y = x;
		
		//String --> Integer
		Integer i = Integer.valueOf("123");
		
		//Integer --> String
		String s = String.valueOf(i);
		System.out.println(s);
	}

}
