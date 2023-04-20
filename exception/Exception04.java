package exception;
/*运行结果 无
   
  以下代码报错的原因是什么？
     因为doSome()方法声明位置上使用了throws ClassNotFoundException
     而ClassNotFoundException是编译时异常。必须编写代码时处理，否则编译器报错。
     
*/
public class Exception04 {
	public static void main(String[] args) {
		//main方法中调用doSome()方法
		//因为方法声明位置上有：throws ClassNotFoundException
		//在调用doSome()方法时必须对这种异常进行预先的处理。如果不处理，编译器报错。
		//编译器报错信息：Unhandled exception type ClassNotFoundException
		//doSome();
		
	}
	
	/*doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
	  这个代码表示doSome()方法在执行过程中，有可能出现ClassNotFoundException异常。叫做类没找到异常。
	  这个异常直接父类是Exception，所以ClassNotFoundException属于编译时异常。
	*/
	public static void doSome() throws ClassNotFoundException{
		System.out.println("doSome!!!");		
	}

}
