package collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
/*运行结果
a
def
100
java.lang.Object@58ceff1
 
迭代专题（重点：五颗星*****）

迭代器是一个对象
    迭代器有两个对象：next(); hasNext();

以下方法是迭代器对象Iterator中的方法：
        boolean hasNext()  如果仍有元素可以迭代，则返回true
        Object next()  返回迭代的下一个元素
		void remove()  从迭代器指向的 collection 中一处迭代器返回的最后一个元素。（可选操作）

*/
public class Collection02 {
	public static void main(String[] args) {
		//注意：以下讲解的迭代方式/遍历方式，是所有Collection通用的一种方式。
		//在Map集合中不能用。在所有的Collection以及子类中使用。
		//创建集合对象
		Collection c = new ArrayList();
		c.add("a");
		c.add("def");
		c.add(100);
		c.add(new Object());
		
		//对集合进行迭代
		//第一步：获取集合对象的迭代器对象
		//类名or接口名(Iterator) 引用(it) --> c(集合)调用方法(iterator)
		Iterator it = c.iterator();
		//第二步：通过以上获取的迭代器对象开始迭代/遍历组合
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
