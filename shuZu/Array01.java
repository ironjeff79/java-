package shuZu;
/*运行结果
数组中元素的个数5
第一个元素 = 1
最后一个元素 = 15
第一个元素 = 110
最后一个元素 = 0
110
100
10
30
0
颠倒顺序输出0
颠倒顺序输出30
颠倒顺序输出10
颠倒顺序输出100
颠倒顺序输出110


Array
 1 java语言中的数组是一种引用数据类型。不属于基本数据类型，数组的父类是Object类。
 2 数据实际上是一个容器，可以同时容纳多个元素。（数组是一个数据的集合）
 3 数组当中可以存储基本数据类型的数据，也可以存储引用数据类型的数据。
 4 数组因为是引用类型，所以数组对象是堆内存当中。
 5 数组当中如果存储的是“java对象”的话，实际上存储的是对象的“引用（内存地址）”
 6 数组一旦创建，在java中规定，长度不可变。 
 7 数组的分类：一维数组，二维数组，三维数组，多维数组。。。（一维数组使用最多）
 8 所有的数组对象都有Length属性，用来获取数组中元素的个数
 9 java中的数组要求数组中元素的类型统一，比如int类型数组只能存储int类型，Person类型数组只能存储Person类型。
   例如：超市购物，购物袋中只能装苹果，不能同时装苹果和橘子。（数组中存储的元素类型统一）
10 数组在内存方面存储的时候，数组中的内存地址（存储的每一个元素都是有规则的挨着排列的）是连续的。   
   内存地址连续是数组存储元素的特点。数组实际上是一种简单的数组结构。
11 所有数组都是拿“第一个小方框”的内存地址作为整个数组对象的内存地址。（数组中首元素的内存地址作为整个数组对象的内存地址）
12 数组中每一个元素都是有下标的，下标从0开始以1递增。最后一个元素下标是Length-1
13 数组这种数据结构的优点和缺点是什么？
   优点：查询/查找/检索某个下标上的元素时效率极高。可以说是查询效率最高的一个数据结构。
        为什么检索效率高？
        第一:每一个元素的内存地址在空间存储上是连续的。
        第二：每一个元素类型相同，所有占用空间大小一样。
        第三：知道第一个元素内存地址，知道每一个元素占用空间的大小，又知道下标，所以通过一个数学表达式就可以计算出某个下标上元素的内存地址。
             直接通过内存地址定位元素，所以数组的检索效率是最高的。
        
        数组中存储100个元素，或者存储100万个元素，在元素查询/检索方面，效率是相同的，
        因为数组中元素查找的时候不会一个个找，是通过数学表达式计算出来的。（算出一个内存地址，直接定位的。）     
             
   
   缺点：
        第一：由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或者增加元素的时候，
             效率较低，因为随机增删元素会涉及到后面元素统一向前或者向后位移的操作。
        第二：数组不能存储大数据量
             因为很难在内存空间上找到一块特别大的连续的内存空间。
             
   注意：对于数组中最后一个元素的增删，是没有效率影响的。     
   
14 怎么声明/定义一个一维数组？
   语法格式：
   int[]  array1;
   double[] array2;
   boolean[] array3;
   String[] array4;
   Object[] array5;
15 怎么初始化一个一维数组？
   包括两种方式：静态初始化一维数组，动态初始化一维数组。
   
   静态初始化语法格式：
       int[] array = {100,200,300,55};
                  
   动态初始化语法格式：
       int[] array = new int[55];  //这里的55表示数组的元素个数 
                                   //初始化一个55个长度的int类型数组，每个元素默认值0
       String[] names = new String[6]; //初始化6个长度的String类型数组，吗，每个元素默认值null  
   
*/
public class Array01 {
	public static void main(String[] args) {
		//声明一个int类型的数组，使用静态初始化的方式
		int[] a = {1,100,10,30,15};
		
		//所有的数组对象都有Length属性
		System.out.println("数组中元素的个数" + a.length);
		//数组中每一个元素都有下标
		//通过下标对数组中的元素进行存取
		//取
		System.out.println("第一个元素 = " + a[0]);
		System.out.println("最后一个元素 = " + a[a.length -1]);
		
		//存（改）
		//把第一个元素修改为111
		a[0] =110;
		a[a.length -1] = 0;
		
		System.out.println("第一个元素 = " + a[0]);
		System.out.println("最后一个元素 = " + a[a.length -1]);
		
		//一维数组怎么遍历？
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);  //i是从0到5，是下标
			//下标为6表示第7个元素，下标越界了。会出现以下异常。
			//System.out.println(a[6]);  ArrayIndexOutOfBoundsException:Index 6 out of bounds for length 5
		}
		
		//从最后一个元素遍历到第1个元素
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("颠倒顺序输出" + a[i]);
		}
			
		
	}

}