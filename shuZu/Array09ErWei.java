package shuZu;
/*运行结果
4
3
100
第一个数组的第二个元素200
第二个数组的第一个元素50
1111
100 200 300 
50 40 30 20 10 
1111 7 8 9 
0 

  关于java中的二维数组
  1 二维数组其实是一个特殊的一维数组，特殊在这个以为数组当中的每一个元素是一个一维数组。
  
  
  二维数组的读和改
  a[二维数组中的一维数组的下标][一维数组的下标]
  a[1][2]表示第二个一维数组中的第3个元素
  
 */
public class Array09ErWei {
	public static void main(String[] args) {
		//一维数组
		int[] array = {100,200,300}; 
		
		
		//二维数组
		int[][] a = {
				{100,200,300},
				{50,40,30,20,10},
				{6,7,8,9},
				{0}
		};
		System.out.println(a.length);
		System.out.println(a[0].length);
		int[] a1 = a[0];
		int i =  a1[0];
		System.out.println(i);
		//合并以上代码
		System.out.println("第一个数组的第二个元素" + a[0][1]);
		System.out.println("第二个数组的第一个元素" + a[1][0]);
		
		//改
		a[2][0] = 1111;
		System.out.println(a[2][0]);
		
		//遍历二维数组
		for(int x = 0; x < a.length; x++) {     //外层循环三次
			//内层循环负责输出一行
			for(int y = 0; y < a[x].length; y++) {
				System.out.print(a[x][y] + " ");
			}
			//输出换行符
			System.out.println();
			
		}
	}
}
