package abstractword;
/*运行结果
猫飞起来了
我是一只会飞的猪
我是六眼飞鱼

 */
/*继承和实现都存在的话，代码应该怎么写？
  extends 关键字在前
  implements 关键字在后
 
 接口在开发中的作用，类似于多态在开发中的作用。
 多态：面向抽象编程，不要面向具体编程。降低程序的耦合度。提高程序的扩展力。
 
*/
public class jiekou3 {
	public static void main(String[] args) {
		//创建对象（表面看Animal类没有起作用）
		Flyable f = new Cat(); //多态
		f.fly();
		Flyable f2 = new Pig();
		f2.fly();
		Flyable f3 = new Fish();
		f3.fly();
	}

}

//动物类：父类
class Animal{
	
}

//可飞翔的接口（一对翅膀）
//能插拔的就是接口。内存条查到主板上，他们之间有接口，内存条就可以更换。
//接口通常提取的是行为动作

interface Flyable{
	void fly();
}

//动物类子类 猫
//Flyable是一个接口，通过接口插到猫身上，让猫可以飞
class Cat extends Animal implements Flyable{
	public void fly() {
		System.out.println("猫飞起来了");
	}
}

//动物类子类 蛇  不想让他飞，不实现Flyable接口
class Snake extends Animal{
	
}

class Pig extends Animal implements Flyable{
	public void fly() {
		System.out.println("我是一只会飞的猪");
	}
}

/*鱼（默认实际上是存在继承的，默认继承Object）
class Fish extends Object implements Flyable{
}
*/
class Fish implements Flyable{
	public void fly() {
		System.out.println("我是六眼飞鱼"); 
	}
}




