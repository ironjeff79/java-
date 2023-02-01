package baojizhi;
/*运行结果 
baojizhi.Person@9861c0即将被销毁！
baojizhi.Person@4b1ac49f即将被销毁！
*/
/* finalize()方法
 这个方法是protected修饰的，在Object类中这个方法的源代码是
   protected void finalize() throws Throwable{}
   
   GC:负责调用finalize()方法
   
    1 finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。
    
    2 这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用这个方法。
      和equals toString()方法不同，finalize()只需要重写，重写完自动会有程序来调用。
      
    3 finalize()方法的执行时机：
      当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize()方法
    
    4 finalize()方法实际上是SUN公司为java程序员准备的一个时机，垃圾销毁时机。
      如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize()方法当中。
    5 静态代码块的作用是什么？
      static{
        ...
      }
      静态代码块在类加载时刻执行，并且只执行一次。
      这是一个SUN准备的类加载时机。
      
      finalize()方法同样也是SUN为程序员准备的一个时机。
      这个时机是垃圾回收时机。
    
    6 提示：
      java中的垃圾回收器不是轻易启动的，垃圾太少或者时间没到，种种条件下，有可能启动，也有可能不启动。  
*/
public class Finalize {
	public static void main(String[] args) {
		//创建对象
		Person p = new Person();
		//怎么把Person对象变成垃圾？
		p = null;
		
		//多造点垃圾
		/*
		for(int i = 0; i < 1000000000; i++){
		   Person p = new Person();
		   p = null;
		}   
		*/
		
		//有一段代码可以建议垃圾回收器启动
		Person p1 = new Person();
		p1 = null;
		System.gc(); //建议启动垃圾回收器 （只是建议，可能不启动。）
	  
	}

}
//项目开发中有这样的业务需求：所有对象在JVM中被释放的时候，请记录一下释放时间！
//记录对象被释放的时间点，这个负责记录的代码写到哪里？写到finalize()方法里。


class Person{
	//重写finalize()方法
	//Person类型的对象被垃圾回收器回收的时候，垃圾回收器负责调用：p.finalize();
	protected void finalize() throws Throwable{
		//this代表当前对象
		System.out.println(this + "即将被销毁！");
	}
}



