package exception;
/*运行结果
空指针异常
java.lang.NullPointerException: 空指针异常
	at javajinjie/exception.Exception08.main(Exception08.java:14)
Hello World
 */

/*
异常对象有两个重要的方法：
    获取异常简单的描述信息：
       String msg = exception.getMessage();
    打印异常追踪的堆栈信息：
       exception.printStackTrace(); 
 
*/
public class Exception08 {
	public static void main(String[] args) {
		//这里只是new了异常对象，但是没有将异常抛出。JVM会认为这是一个普通的Java对象。
		NullPointerException e = new NullPointerException("空指针异常");
	    //获取异常简单描述信息：这个信息实际上就是构造方法上面String参数。 
		System.out.println(e.getMessage());  //空指针异常
		
		//打印异常堆栈信息
		//Java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的。
		e.printStackTrace();
		
		System.out.println("Hello World");
	}

}
