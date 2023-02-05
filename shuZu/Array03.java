package shuZu;
/*运行结果
Hello world
1
2
3
4
abc
xyz
def
op
null
null
 */
//当一个方法上，参数的类型时一个数组的时候。
public class Array03 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		//调用方法时传一个数组
		int[] x = {1,2,3,4};
		printArray(x);
		
		//创建String数组
		String[] strs = {"abc","xyz","def","op"};
		printArray(strs);
		
		String[] str = new String[2];
		printArray(str);
		
	}
	
	public static void printArray(int[] array) {
		for(int i = 0;i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void printArray(String[] args) {
		for(int i = 0;i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	

}