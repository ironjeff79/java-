package collection;

import java.util.Collection;
import java.util.ArrayList;
/*
运行结果
2
true
true

深入Collection集合的Contains方法：
    boolean contains(Object o)判断集合中是否包含某个对象o
    如果包含返回true 
    
    contains方式是用来判断集合中是否包含某个元素的方法
    那么在底层是怎么判断集合中是否包含某个元素的？
        调用了equals方法进行比较
        equals方法返回true就表示包含这个元素
*/
public class Collection04 {
	public static void main(String[] args){
		//创建集合对象
		Collection c = new ArrayList();
		
		//向集合中存储元素
		String s1 = new String("abc");
		c.add(s1);  //放进去了一个"abc"
		String s2 = new String("def");
		c.add(s2);
		
		//集合中元素的个数
		System.out.println(c.size());
		
		//新建对象String
		String x = new String("abc");
		System.out.println(x.equals(s1));  //true
		
		//c集合中是否包含x
		//其实就是判断集合中是否存在"abc"
		System.out.println(c.contains(x));  //true  重写了底层就是x.equals(s1) 比较的是内容	
	}
}
