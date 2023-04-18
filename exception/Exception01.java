package exception;
/* 运行结果 除数不能为0
   什么是异常，异常机制有什么用？
   以下程序执行过程中发生了不正常的情况，被称为异常
   java语言提供了异常处理方法，把异常信息打印输出到控制台，供程序员参考。
   
*/
public class Exception01 {
	public static void main(String[] args) {
		/*
		int a = 10;
		int b = 0;
		//实际上JVM在执行到此处的时候，会new异常对象：new ArithmeticException("/ by zero");
		  并且JVM将new的异常对象抛出，打印输出信息到控制台。
		int c = a / b;
		System.out.println(a + "/" + b + "=" + c);
		
		//此处运行也会创建一个ArithmeticException类型的对象
		System.out.println(100 / 0);
		*/
		
		//观察到异常信息之后，对程序进行修改
		int a = 10;
		int b = 0;
		if(b == 0) {
			System.out.println("除数不能为0");
			return;
		}
		
		int c = a / b;
		System.out.println(a + "/" + b + "=" + c);
	}

}
