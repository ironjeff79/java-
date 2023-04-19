package date;

/* 运行结果
1681897564122
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9
耗费时长： 0毫秒

   获取自1970年1月1日 00:00:00 000到当前系统时间的毫秒数
       1秒 = 1000毫秒
 
   简单总结System类的相关属性和方法：
   System.out 【out是System类的静态变量】 
   System.out.println() 【println()方法不是System类的，是PrintStream类的方法。】
   System.gc() 建议启动垃圾回收器
   System.currentTimeMillis() 获取自1970年1月1日到系统当前时间的总毫秒数。
   System.exit(0) 推出JVM                      
*/
public class Date02 {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		
		//统计一个方法耗时
		//在调用目标方法之前记录一个毫秒数
		long begin = System.currentTimeMillis();
		print();
		
		
		//在执行完目标方法之后记录一个毫秒数
		long end = System.currentTimeMillis();
		System.out.println("耗费时长： " + (end - begin) + "毫秒");
		
	}

	//需求：统计一个方法执行所耗费的时长
	public static void print() {
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
	}
}
