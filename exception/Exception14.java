package exception;

/*运行结果 1 
重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少。
父类不抛异常，子类重写可以抛出RuntimeException

总结异常中的关键字：
异常捕捉：
   try
   catch
   finally

throws 在方法声明位置上使用，表示上报异常信息给调用者
throw 手动抛出异常

 
*/
class Animal{
	public void doSome() {

	}
	
	public void doOther() throws Exception {
		
	}
}

class cat extends Animal{
	public void doSome() {
		
	}
	public void doOther() throws NullPointerException {
		
	}
	
	
}

public class Exception14 {
	public static void main(String[] args) {
		System.out.println("1");
	}
}
