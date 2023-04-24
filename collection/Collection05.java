package collection;

import java.util.Collection;
import java.util.ArrayList;
/*
运行结果
true
0

测试contains方法
测试remove方法

结论：存放在一个集合中的类型，一定要重写equals方法
不重写比较的是内存地址 重写了之后比较的是内容

*/

public class Collection05 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建用户对象
		User u1 = new User("Jack");
		User u2 = new User("Jack");
		
		//加入集合
		c.add(u1);
		//没有重写equals之前，这个结果是false 
		//重写equals方法之后，比较的时候会比较name
		System.out.println(c.contains(u2)); 
		
		//创建集合对象
		Collection cc = new ArrayList();
		//创建字符串对象
		String s1 = new String("hello");
		String s2 = new String("hello");
		cc.add(s1);
		cc.remove(s2);
		//说明底层调了equals方法
		System.out.println(cc.size());  //0
	}

}



class User{
	private String name;
	public User() {}
	public User(String name) {
		this.name = name;
	}
	//重写equals方法
	//这个equals方法的比较原理是：只要姓名一样就表示同一个用户
	public boolean equals(Object o) {
		/*自动生成的代码
		if(this == o)  return true;
		if(null == o || getClass() != o.getClass()) return false;
		User user = (User)o;
		return Objects.equals(name,user.name);
		*/
		if(null == o || !(o instanceof User)) return false;
		if(o == this)return true;
		User u = (User)o;
		//如果名字一样表示同一个人
		return u.name.equals(this.name);
	}
	
	
	
	
	
}