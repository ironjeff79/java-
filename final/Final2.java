package finalkeyword;
//运行结果 80.0
/*实例变量如果没有手动赋值的话，系统会赋默认值。

final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值。
这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。
*/
public class Final2 {
	public static void main(String[] args) {
		User u = new User(80);
		System.out.println(u.weight);
		
	}

}


class User{
	//实例变量
	//实例变量在什么时候赋值（初始化）？
	//构造方法执行的过程中赋值。（new的时候赋值）
	 final int age = 18 ;
	 final double height = 1.8;
	 
	 final double weight ;
	 public User(int d) {
		 this.weight = d;
	 }
}