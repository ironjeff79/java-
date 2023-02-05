package baojizhi;
//运行结果 100+200=300
/*匿名内部类：
  1 什么是内部类？
    内部类：在类的内部又定义了一个新的类。被称为内部类。
 
  2 内部类的分类：
    静态内部类：类似于静态变量
    实例内部类：类似于实例变量
    局部内部类：类似于局部变量
  
  3 使用内部类编写的代码可读性很差。能不用尽量不用。    
    
  4 匿名内部类是局部内部类的一种。因为这个类没有名字。
    
  5 学习内部类主要是以后在阅读别人代码的时候，能够理解。
    缺点1 太复杂，太乱，可读性差
    缺点2 类没有名字，以后想重复使用，不能用
      
*/
public class NeiBuLei {
	
	//该类在类的内部，所以称为内部类。
	//由于前面有static，所以称为“静态内部类”
	static class Inner1{
		
	}
	
	//该类在类的内部，所以称为内部类。
	//没有static，所以称为“实例内部类”
	class Inner2{
		
	}
	
	public void doSome() {
		int i = 100;
		//该类在类的内部，所以称为内部类。
		//局部内部类
		class Inner3{
			
		}
	}
	
	public void doOther() {
		new NeiBuLei().new Inner2();
		//doSome()方法中的局部内部类Inner3，在doOther()中不能使用
	}
	public static void main(String[] args) {
		//调用Math中的sum方法
		Math mm = new Math();
		//mm.sum(new ComputeImpl(), 100, 200);
		//使用匿名内部类，表示ComputeImpl这个类没名字了。
		//这里表面看上去好像是接口可以直接new了，实际上后面的{}代表了对接口的实现。
		//不建议使用内部类 因为一个类没有名字，没有办法重复使用，另外代码太乱，可读性太差。
		mm.sum(new Compute(){
			public int sum(int a,int b) {
				return a + b;
			}
		}, 100, 200);
	}

}


//负责计算的接口
interface Compute{
	
	//抽象方法
	int sum (int a,int b);
}

//你自动会在这里编写一个Compute接口的实现类
/*class ComputeImpl implements Compute{
	public int sum(int a,int b) {
		return a+b;
	}
}
*/


//数学类
class Math{
	//数学求和方法
	public void sum(Compute c,int x,int y) {
		int retValue = c.sum(x, y);
		System.out.println(x + "+" + y  + "=" + retValue);
	}	
	
}


