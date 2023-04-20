package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/*运行结果
文件不存在
hello?

深入try..catch
1. catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
2. catch可以写多个。建议catch的时候，精确的一个一个处理，这样有利于程序的调试。
3. catch写多个的时候，从上到下，必须遵守从小到大。
4. JDK8的新特性
   catch里面可以这样写：FileNotFoundException | ArithmeticException | NullPointerException e

在以后的开发中，处理编译时异常，应该上报还是捕捉？ 
   如果希望调用者来处理，选择throws上报。
   其他情况使用捕捉的方式。
*/
public class Exception07 {
	//public static void main(String[] args) throws Exception,FileNotFoundException,NullPointerException{
	public static void main(String[] args) {
		try {
			//创建输入流
			FileInputStream fis = new FileInputStream("F:\\spac\\1.txt");
			//读文件
			fis.read();
			
		} catch(FileNotFoundException e) {   //多态：Exception e = new FileNotFoundException();
			System.out.println("文件不存在");	
		} catch(IOException e) {
			System.out.println("读文件报错了");
		}
		
		System.out.println("hello?");
	}
}
