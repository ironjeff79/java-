package shuZu;
/*运行结果
压栈java.lang.Object@3d012ddd元素成功，栈帧指向0
压栈java.lang.Object@626b2d4a元素成功，栈帧指向1
压栈java.lang.Object@5e91993f元素成功，栈帧指向2
压栈java.lang.Object@1c4af82c元素成功，栈帧指向3
压栈java.lang.Object@379619aa元素成功，栈帧指向4
压栈java.lang.Object@cac736f元素成功，栈帧指向5
压栈java.lang.Object@5e265ba4元素成功，栈帧指向6
压栈java.lang.Object@156643d4元素成功，栈帧指向7
压栈java.lang.Object@123a439b元素成功，栈帧指向8
压栈java.lang.Object@7de26db8元素成功，栈帧指向9
栈已满----------------------------
弹栈java.lang.Object@7de26db8元素成功
栈帧指向8
弹栈java.lang.Object@123a439b元素成功
栈帧指向7
弹栈java.lang.Object@156643d4元素成功
栈帧指向6
弹栈java.lang.Object@5e265ba4元素成功
栈帧指向5
弹栈java.lang.Object@cac736f元素成功
栈帧指向4
弹栈java.lang.Object@379619aa元素成功
栈帧指向3
弹栈java.lang.Object@1c4af82c元素成功
栈帧指向2
弹栈java.lang.Object@5e91993f元素成功
栈帧指向1
弹栈java.lang.Object@626b2d4a元素成功
栈帧指向0

 
编写程序，使用一维数组，模拟栈数据结构。
要求：
  1 这个栈可以存储java中的任何引用类型的数据 
  2 在栈中提供push方法模拟压栈（栈满了，要有提示信息）
  3 在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
  4 编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
  5 假设栈的默认初始化容量是10
   
*/

public class HomeWork01 {
	public static void main(String[] args) {
		//创建一个栈对象，初始化容量是10
		HomeWork01 s = new HomeWork01();
		//调用方法压栈
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.push(new Object());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}
	
		//向栈当中存储元素，这里使用一维数组模拟。
		private Object[] elements;
		
		//栈帧（永远指向栈顶部的元素）
		
		private int index;
		
		
		//无参数构造方法，默认初始化栈容量10
		public HomeWork01() {
			//一维数组动态初始化
			//默认初始化容量是10
			this.elements = new Object[10];
			//给index初始化
			this.index = -1;
		}
		
		public void push(Object obj) {
			if(index >= elements.length-1 ) {
				System.out.println("栈已满----------------------------");
				return;
			}
			//向栈中加一个元素，栈帧向上移动一个位置
			//index++;
			//elements[index] = obj;
			elements[++index] = obj;
			//再次声明 所有的System.out.println()方法执行时，如果输出引用的话，自动调用引用的toString()方法。
			System.out.println("压栈" + obj + "元素成功，栈帧指向" + index);
		}
		
		//弹栈 从数组中往外取元素
		public void pop() {
			if(index < 0) {
				System.out.println("栈已空");
				return;
			}
			System.out.println("弹栈" + elements[index] + "元素成功" );
			index--;
			System.out.println("栈帧指向" + index );
		}
		
		
		
		//封装第一步，属性私有化 第二步，对外提供set和get方法。
		public Object[] getElements() {
			return elements;
		}
		public void setElements(Object[] elements) {
			this.elements = elements;
		}
		public int getIndex() { 
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
	}