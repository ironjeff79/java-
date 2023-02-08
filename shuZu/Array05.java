package shuZu;
/*运行结果
 JVM给传递过来的String数组参数，长度是？0
0

  mian方法上面的“String[] args”有什么用？
  分析：谁负责调用main方法（JVM）
  JVM调用main方法的时候，会自动传一个String数组过来。 
  
*/
public class Array05 {
	//这个方法程序员负责写出来，JVM负责调用。JVM调用的时候一定会传一个String数组过来。
	public static void main(String[] args) {
		//JVM默认传递过来的这个数组对象的长度？默认0
		//通过测试得出:args不是null
		System.out.println("JVM给传递过来的String数组参数，长度是？" + args.length);
		
		/*这个数组什么时候里面会有值呢？
		其实这个数组是留给用户的，用户可以在控制台上输入参数，这个参数自动会被转换为"String[] args"
		例如这样运行程序:java Array05 abc def xyz
		那么这个时候JVM会自动将“abc def xyz”通过空格的方式进行分离，分离完成之后，自动放到String[] args数组当中。
		所以main方法上面的String[] args数组主要是用来接收用户输入参数的。
		*/
		//以下这一行代码表示的含义：数组对象创建了，但是数组中没有任何数据。
		String[] strs = new String[0];
		printLength(strs);
		
		
		
	}
	public static void printLength(String[] args) {
		System.out.println(args.length);
	}

}
