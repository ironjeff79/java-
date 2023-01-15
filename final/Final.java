package javajinjie;
/*运行结果
20
30
*/
/*final
final 是java语言中的一个关键字。
表示的是最终的，不可变的。
可以修饰变量以及方法，还有类等。
final修饰的变量，只能赋一次值。

final修饰的变量？
final修饰的局部变量，一旦赋值不能重新赋值。

final修饰的方法？
final修饰的方法无法被覆盖，被重写。

final修饰的类？
final修饰的类无法继承。

final修饰的引用？
该引用只能指向一个对象，并且他只能永远指向该对象，无法再指向其他对象。
并且在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收。
直到当前方法结束，才会释放空间。

虽然
final控制不了能不能调用的问题。

*/
public class Final {
	public static void main(String[] args) {
		Person p = new Person(20);
		System.out.println(p.age);
		
		final Person p1 = new Person(30);
		p.age = 40;
		System.out.println(p1.age);
	}
}

class Person{
	int age;
	public Person() {}
	public Person(int age) {
		this.age = age;
	}
}

