package collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/*
关于集合的迭代/遍历

运行结果
Integer类型1
Integer类型2
Integer类型3
Integer类型2
50
100
150
90
45
350
*/
public class Collection03 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();  //ArrayList有序可重复
		//添加元素
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(2);
		//迭代集合
		Iterator i = c.iterator();
		while(i.hasNext()) {
			//存进去什么类型 输出的时候就是什么类型
			Object obj = i.next();
			if(obj instanceof Integer) {
				System.out.print("Integer类型");
			}
			//只不过在输出的时候会转换成字符串，因为这里println会调用toString()方法
			System.out.println(obj);
		}
		
		//HashSet集合 无序不重复
		Collection c2 = new HashSet();
		//存进去和取出的顺序不一定相同
		c2.add(45);
		c2.add(45);
		c2.add(50);
		c2.add(90);
		c2.add(100);
		c2.add(150);
		c2.add(350);
		c2.add(150);
		
		Iterator r = c2.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
		
		
		
		
	}

}
