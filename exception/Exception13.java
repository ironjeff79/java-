package exception;
/*运行结果
exception.MyException: 用户名不能为空
	at javajinjie/exception.Exception13.main(Exception13.java:7)
用户名不能为空 
 */
public class Exception13 {
	public static void main(String[] args) {
		
		//创建异常对象（只new了异常对象，并没有手动抛出）
		MyException e = new MyException("用户名不能为空");
		
		//打印异常堆栈信息
		e.printStackTrace();
		
		//获取异常简单描述信息
		System.out.println(e.getMessage());
	}

}
