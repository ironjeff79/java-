package shuZu;
/*运行结果
1
2
3
0
0
0
1
2
3

当一个方法的参数时一个数组的时候，我们还可以采用这种方式。
 */
public class Array04 {
	public static void main(String[] args) {
		//静态初始化一维数组
		int[] a = {1,2,3};
		printArray(a);
		
		//动态初始化一维数组
		int[] a2 = new int[3];
		printArray(a2);
		
		//没有这种语法
		//printArray({1,2,3});
		printArray(new int[] {1,2,3});
		
		
	}
	
	//为什么要使用静态方法？因为方便，不需要new对象。
	public static void printArray(int[] array) {
		for(int i = 0;i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
