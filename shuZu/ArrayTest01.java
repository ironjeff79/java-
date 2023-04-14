package shuZu;
/*运行结果
1
3
4
56
67
112
012345比较次数：21
0
6
7
8
9
10
11

*/
import java.util.Arrays;

/*1.1 常见的算法
     排序算法：冒泡排序算法 选择排序算法
     
     冒泡排序算法：
     1每一次循环之后，都要找出最大的数据，放到参与比较的这堆数据的最右边。（冒出最大的气泡）
     2核心：拿着左边的数字和右边的数字比对，当左边>右边的时候，交换位置。
     
     参与比较的数据 9，8，10，7，6，0，11
     第一次循环：
     8 9 10 7 6 0 11（1次比较：交换）
     8 9 10 7 6 0 11（2次比较：不交换）
     8 9 7 10 6 0 11（3次比较：交换）
     8 9 7 6 10 0 11（4次比较：交换）
     8 9 7 6 0 10 11（5次比较：交换）
     8 9 7 6 0 10 11（6次比较：不交换）
     最终冒出的最大数据在右边：11
     
     参与比较的数据：8 9 7 6 0 10
     第二次循环：
     8 9 7 6 0 10（1次比较：不交换）
     8 7 9 6 0 10（2次比较：交换）
     8 7 6 9 0 10（3次比较：交换）
     8 7 6 0 9 10（4次比较：交换）
     8 7 6 0 9 10（5次比较：不交换）
     
     参与比较的数据：8 7 6 0 9
     第三次循环：
     7 8 6 0 9（1次比较：交换）
     7 6 8 0 9（2次比较：交换）
     7 6 0 8 9（3次比较：交换）
     7 6 0 8 9（4次比较：不交换）
     
     参与比较的数据：7 6 0 8
     第四次循环
     6 7 0 8（1次比较：交换）
     6 0 7 8（2次比较：交换）
     6 0 7 8（3次比较：不交换）
     
     参与比较的数据：6 0 7
     第五次循环
     0 6 7（1次比较：交换）
     0 6 7（2次比较：不交换）
     
     参与比较的数据：0 6
     第六次循环
     0 6（1次比较：不交换）
     
     查找算法：二分法算法
  1.2 算法不用精通，java中已经封装好，要排序用调用方法就行。
     java中提供了一个数组工具类
     java.util.Arrays
     Arrays是一个工具类。
     其中有一个sort()方法，可以排序。静态方法，直接使用类名调用就行。
  
*/
public class ArrayTest01 {
	public static void main(String[] args) {
		int[] arr = {112,3,4,56,67,1}; 
		//工具类当中的方法大部分是静态的。
		Arrays.sort(arr);
		
		//遍历输出
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[] arr1 = {9,8,10,7,6,0,11};
		for(int i = 0; i < arr1.length-1; i++) {
			System.out.print(i);
		}
		//7条数据，循环6次。以下代码可以循环6次。（冒泡排序的外层循环采用这种方式）
		int count = 0;
		for(int i = arr1.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++ ) {
				count++;
				if(arr1[j] > arr1[j+1]) {
					//交换位置
					//arr[j]和arr[j+1]交换
					int temp;
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}				 
			}
		}
		System.out.println("比较次数：" + count);
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
}