package shuZu;
/*运行结果
使用时请输入程序参数，参数中包括用户名和密码信息，例如：zhangsan 123

模拟一个系统，假设这个系统要使用，必须输入用户名和密码。  
*/

public class Array06 {
	//用户名和密码输入到String[] args数组当中
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("使用时请输入程序参数，参数中包括用户名和密码信息，例如：zhangsan 123");
			return;
		}
		
		//执行到此处说明确实提供了用户名和密码
		//接下来需要判断正确
		//取出
		String username = args[0];
		String password = args[1];
		
		//假设用户名是admin，密码是123的时候表示登录成功。
		//判断两个字符串是否相等，需要使用equals方法。
		
		//if(username.equals("admin") && password.equals("123")){
		//采用以下编码风格，即使username和password都是null，也不会出现空指针异常
		if("admin".equals(username) && "123".equals(password)) {	
			System.out.println("登录成功，欢迎【" +  username + "】回来 ");
		}else {
			System.out.println("对不起，登录失败");
		}
	}

}
