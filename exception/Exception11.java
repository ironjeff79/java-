package exception;

/*运行结果
try...
finally...

finally语句 
     放在finally语句块中的代码是一定会执行的。
*/
public class Exception11 {
	public static void main(String[] args) {
		/*
		 try和finally，没有catch可以吗？可以。
		     try不能单独使用。
		     try finally可以联合使用。
		 以下代码的执行顺序：
		     先执行try...
		     再执行finally...
		     最后执行 return (return 语句只要执行方法必然结束)     
		*/
		try {
			System.out.println("try...");
			return;
			//退出JVM 下面的finally语句就不执行了
			//System.exit(0);
			
		}finally {
			System.out.println("finally...");
		}
		//Unreachable code  没有机会执行
		//System.out.println("Hello");
	}
}
