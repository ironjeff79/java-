package exception;

import java.io.IOException;

/* 运行结果 注册成功，欢迎 [jeffery]
编写程序模拟用户注册：
1. 程序开始执行时，提示用户输入“用户名”和“密码”信息
2. 输入信息之后，后台Java程序模拟用户注册
3. 注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
 
*/
public class ExceptionHomeWork01 {
	public static void main(String[] args) {
		//创建UserService对象
		UserService userService = new UserService();
		//
		try {
			userService.register("jeffery","123");
	    } catch(IllegalArgsException e) {
	    	System.out.println(e.getMessage());
	    }
    }
}