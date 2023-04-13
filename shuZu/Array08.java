package shuZu;
/*运行结果
0
0
0
11
22
0
0
0
0
0
---------------------------------------------------
Hello
world
123
abc
null

 关于一维数组的扩容。
 在java开发中，数组长度一旦确定不可变，那么数组满了怎么办？
 java中对数组的扩容是：
     先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组当中。
     
结论： 数组扩容效率较低。因为涉及到拷贝问题，所以尽可能少的进行数组拷贝。
      可以在创建数组对象的时候预估准确，减少数组的扩容次数。     
 
 */
public class Array08 {
	public static void main(String[] args) {
		//java中的数组是怎么进行拷贝的呢?
		//System.arraycopy(5个参数);
		
		//拷贝源
		int[] src = {1,11,22,3,4};
		
		//拷贝目标
		int[] dest = new int[10]; //动态初始化一个长度为20的数组，每一个元素默认值0
		
		System.arraycopy(src, 1, dest, 3, 2);
		
		//遍历
		for(int i = 0; i < dest.length; i++ ) {
			System.out.println(dest[i]);
		}
		System.out.println("---------------------------------------------------");
		
		//数组中如果存储的元素是引用，可以拷贝吗？当然可以
		String[] strs = {"Hello","world","123","abc"};
		String[] str = new String[5];
		System.arraycopy(strs, 0, str, 0, strs.length);
		for(int i = 0; i < str.length; i++ ) {
			System.out.println(str[i]);
		}
	}

}
