package abstractword;
/*运行结果 1
 接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？
   对于计算机来说，一个机箱有多个接口，分别接鼠标键盘等等 
   
重点：******一个类可以同时实现多个结接口。

   这种机制弥补了java中的哪个缺陷？
     java中类和类只支持单继承，实际上单继承是为了简单而出现的，现实世界中存在多继承，java中的接口弥补了单继承带来的缺陷。
   
  之前有一个结论：无论向上还是向下转型，两种类型之间必须要有继承关系，没有继承关系编译器会报错。（这句话不适用在接口方面）
     最终实际上和之前一样，需要加：instanceof运算符进行判断。
 */
public class jiekou2 {
	public static void main(String[] args) {
		X a = new D();
		Y b = new D();
		Z c = new D();
		Y b2 = (Y)a;
		b2.m2();
		M m = new E();
		//经过测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
		// 但是运行时可能会出现ClassCastException异常。编译没有问题，运行有问题。
		//K k = (K)m;
		if(m instanceof K) {
			K k = (K)m;
		}	
	}

}

interface K{
	
}
interface M{
	
}
class E implements M{
	
}


//----------------------------------------------------------------------------------------------------
interface X{
	void m1();	
}

interface Y{
	void m2();
}
interface Z{
	void m3();
}

//实现多个接口，其实就类似于多继承
class D implements X,Y,Z{
	//实现A接口的m1()
	public void m1() {
	}
	//实现B接口的m2()
	public void m2() {
		System.out.println("1");
	}
	//实现C接口的m3()
	public void m3() {
	}

}