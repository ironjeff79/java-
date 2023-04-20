package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*运行结果
java.io.FileNotFoundException: F:\spae\1.txt (系统找不到指定的路径。)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at javajinjie/exception.Exception09.m2(Exception09.java:44)
	at javajinjie/exception.Exception09.m1(Exception09.java:41)
	at javajinjie/exception.Exception09.main(Exception09.java:21)
111
*/
/*
异常对象有两个重要的方法：
    获取异常简单的描述信息：
       String msg = exception.getMessage();
    打印异常追踪的堆栈信息：
       exception.printStackTrace(); 

我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序？
    异常信息追踪信息，从上往下一行一行看，SUN写的代码就不用看了。（看包名）主要的问题是出现在自己编写的代码上。

   
*/
public class Exception09 {
	public static void main(String[] args) {
		try {
			m1();
		}catch (FileNotFoundException e) {
			//打印异常堆栈追踪信息!!
			//在实际的开发中，建议使用这个。养成良好习惯。
			e.printStackTrace();
			/*java.io.FileNotFoundException: F:\spae\1.txt (系统找不到指定的路径。)
	          at java.base/java.io.FileInputStream.open0(Native Method)
	          at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	          at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	          at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	          at javajinjie/exception.Exception09.m2(Exception09.java:44)
	          at javajinjie/exception.Exception09.m1(Exception09.java:41)
	          at javajinjie/exception.Exception09.main(Exception09.java:21) 
			 */
		}
		//这里程序不耽误执行，很健壮。（服务器不会因为遇到异常而宕机）
		System.out.println("111");
	}
	
	private static void m1() throws FileNotFoundException{
		m2();
	}
	private static void m2() throws FileNotFoundException{
		new FileInputStream("F:\\spae\\1.txt");
	}
}
