package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/*运行结果
java.io.FileNotFoundException: F:\spae\1.txt (系统找不到指定的路径。)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at javajinjie/exception.Exception10.main(Exception10.java:22)
hello
halo
*/
/*关于try..catch中的finally子句：
  1. 在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常。
     finally子句必须和try一起出现，不能单独编写。
     
  2. finally语句通常使用在哪些情况下呢？
     通常在finally语句块中完成资源的释放/关闭。
     因为finally中的代码比较有保障。
     即使try语句块中的代码出现异常，finally中的代码也会正常执行。
  
*/
public class Exception10 {
	public static void main(String[] args) {
		FileInputStream fis = null;  //声明位置放到try外面。这样在finally中才能用。
		try {
			//创建输入流对象
			fis = new FileInputStream("F:\\spae\\1.txt");
			String s = null;
			//这里一定会出现空指针异常
			s.toString();
			
			//流使用完需要关闭，因为流是占用资源的
			//即使以上程序出现异常，流也必须要关闭
			//放在这里流可能关不了
			//fis.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("hello");
			//流的关闭放在这里比较保险。
			//finally中的代码是一定会执行的。即使try中出现了异常
			if(fis != null) {  //避免空指针异常
				try {
					//close()方法有异常，采用捕捉的方式。
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		
		}
		System.out.println("halo");
	}
}
