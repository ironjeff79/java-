package exception;
/*
用户业务类，处理用户相关的业务：例如登录，注册等功能 
*/

public class UserService {
	public void register(String username, String password) throws IllegalArgsException {
		//引用等于null的这个判断最好放在所有条件的最前面
		//在分享一个经验 username == null 不如写成 null == username 
		//防止误输入一个等于号 把null赋给username
		if(null == username || username.length() < 6 || username.length() > 14) {
			throw new IllegalArgsException("请输入在[6-14]之间的用户名");
		}
		System.out.println("注册成功，欢迎 ["+username+"]");
	}

}
