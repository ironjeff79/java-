package number;

import java.util.Arrays;
import java.util.Random;
/*运行结果
生成的随机数1
生成的随机数1
生成的随机数1
生成的随机数3
生成的随机数2
生成的随机数3
生成的随机数1
生成的随机数0
生成的随机数5
0  1  2  3  5 
*/

/* 
   编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
   最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
*/
public class Random02 {
	public static void main(String[] args) {
		//创建随机数对象
		Random random = new Random();
		//准备一个长度为5的数组
		int arr[] = new int[5]; //默认值都是0
		for(int i = 0;i < arr.length; i++) {
			arr[i] = 7;
		}
		
		//循环，生成随机数
		int index = 0;
		while(index < arr.length) {
			//生成随机数
			int num = random.nextInt(6);
			System.out.println("生成的随机数" + num);
			//判断数组中有没有num
			if(!contains(arr,num)) {
				arr[index++] = num;
			}
		}
		//遍历数组
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}
	//单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
	public static boolean contains(int[] arr,int key) {
		//对数组进行排序
		Arrays.sort(arr);
		//进行二分法查找
		//二分法查找的结果 >= 0 说明，这个元素找到了，表示存在。
		return Arrays.binarySearch(arr, key) >= 0 ;
	}
}
