package collection;
import java.util.ArrayList;
import java.util.Collection;
/*运行结果
集合中的元素个数是：5
集合中的元素个数是：0
true
集合中的元素个数是：1
false
------------------------
hello
ab
cd
efg
collection.Dog@49e4cb85
 
关于java.util.Collection接口中常用的方法 
    1. Collection中能存放什么元素？
       没有使用“泛型”之前，Collection中可以存储Object的所有子类型。
       使用了“泛型”之后，Collection中只能存储某个具体的类型。
       集合后期会接触“泛型”语法。
       ！集合中不能直接存储基本数据类型，也不能存Java对象，只是存储Java对象的内存地址
    2. Collection中的常用方法
       boolean add(E e)  向集合中添加元素
       int size()  获取集合中元素的个数
       void clear()  清空集合
       boolean contains(Object o)  判断当前集合中是否包含元素o，包含返回true，不包含返回false
       boolean remove(Object o)  删除集合中的某个元素
       boolean isEmpty()  判断集合是否为空 集合中元素个数是否为0
       Object[] toArray()  调用这个方法可以把集合转换成数组 【作为了解，使用不多】
*/
public class Collection01 {
	public static void main(String[] args) {
		//创建一个集合对象
		//Collection c = new Collection();  接口是抽象的 无法实例对象
		//多态
		Collection c = new ArrayList();
		//测试collection接口中的常用方法
		c.add(1000);
		c.add(3.1415926);
		c.add(new Object());
		c.add(new Dog());
		c.add(true);
		
		//获取集合中元素的个数
		System.out.println("集合中的元素个数是：" + c.size());
		
		//清空集合
		c.clear();
		System.out.println("集合中的元素个数是：" + c.size());
		
		//再向集合中添加元素
		c.add("hello"); //“hello”对象的内存地址放到了集合当中
		c.add("world");
		
		//判断集合中是否包含“hello”
		System.out.println(c.contains("hello"));
		
		//删除集合中某个元素
		c.remove("world");
		System.out.println("集合中的元素个数是：" + c.size());
		
		//判断集合是否为空
		System.out.println(c.isEmpty());
		
		c.add("ab");
		c.add("cd");
		c.add("efg");
		c.add(new Dog());
		
		System.out.println("------------------------");
		//转换成数组
		Object[] obj = c.toArray();
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}	
}

class Dog{
	
}
