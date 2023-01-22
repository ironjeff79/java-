package abstractword;
//运行结果30
/*接口
 1 接口也是一种引用数据类型
 2 接口是完全抽象或者说是特殊的抽象类
 3 接口的定义？
  [修饰符列表] interface 接口名{} 
 4 接口支持多继承，一个接口可以继承多个接口。
 5 接口中只包含两部分内容，一部分是：常量。 一部分是：抽象方法。 接口中没有其他内容。只有以上两部分。 
 6 接口中所有元素都是public修饰的。（都是公开的）
 7 接口中的抽象方法定义是public abstract修饰符可以省略。 
 
 接口的基础语法
   类和类之间叫做继承，类和接口之间叫做实现。
   继承使用extends关键字完成
   实现使用implements关键字完成 
   
   
   当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖，重写）。
*/
public class Jiekou {
	public static void main(String[] args) {
		//父类型的引用指向子类型的对象
		myMath mm =new MyMathImpl();
		//调用接口里面的方法（面向接口）
		int result = mm.sum(10,20);
		System.out.println(result);
	}

}


interface A{
}
interface B{
}
interface C extends A,B{
}

//数学接口
interface myMath{
	double PI = 3.1415926; 
	int sum(int a,int b);
	
}

//编写一个类（非抽象类）
class MyMathImpl implements myMath {
	//实现/重写接口中的方法
	public int sum(int a,int b) {
		return a + b; 
		
	}
	
	
}