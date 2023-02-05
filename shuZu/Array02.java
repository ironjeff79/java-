package shuZu;
/*
运行结果
数组中下标为0的元素是：0
数组中下标为1的元素是：0
数组中下标为2的元素是：0
数组中下标为3的元素是：0
数组中下标为0的元素是：1
数组中下标为1的元素是：15
数组中下标为2的元素是：111
数组中下标为3的元素是：222
下标为0的元素是：null
下标为1的元素是：null
下标为2的元素是：null
String下标为0的元素是：null
String下标为1的元素是：null
String下标为2的元素是：null


关于每个类型的默认值
    数据类型             默认值
------------------------------------
     byte                  0
     short                 0
     int                   0
     long                  0L
     float                 0.0F
     double                0.0
     boolean               false
     char                  \u0000
     引用数据类型           null
     
什么时候采用静态初始化方式，什么时候采用动态初始化方式？
     当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态初始化方式。
     当你创建数组的时候，部确定数组中存储哪些数据，可以采用动态初始化的方式，预先分配内存空间。     
*/
public class Array02 {
	public static void main(String[]args) {
		//声明/定义一个数组，采用动态初始化的方式创建
		int[] a = new int[4]; //创建长度为4的int数组，数组中每个元素的默认值是0
		//遍历数组
		for(int i = 0;i < a.length; i++) {
			System.out.println("数组中下标为" + i+ "的元素是：" + a[i]);
		}
		
		//后期赋值
		a[0] = 1;
		a[1] = 15;
		a[2] = 111;
		a[3] = 222;
		for(int i = 0;i < a.length; i++) {
			System.out.println("数组中下标为" + i+ "的元素是：" + a[i]);
		}
		
		
		//初始化一个Object类型的数组，采用动态初始化方式
		Object[] objs = new Object[3];  //3个长度，动态初始化，所有每个元素默认值都是null
		for(int i = 0; i < objs.length; i++) {
			System.out.println("下标为" + i+ "的元素是：" + objs[i]);
		}
		
		String[] strs = new String[3];
		for(int i = 0; i < strs.length; i++) {
			System.out.println("String下标为" + i+ "的元素是：" + strs[i]);			
		}
	}

}
