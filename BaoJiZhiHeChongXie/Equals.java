package baojizhi;
/*运行结果
true
false
true
false
false
 */
/*关于Object类中的equals方法
 1 源代码 
  public boolean equals(Object obj){
     return (this == obj);
  }
  以上这个方法是Object类的默认实现
  
 2 SUN公司设计equals方法的目的是什么？
   以后编程的过程当中，都要通过equals方法来判断两个对象是否相等的。 
 3 在Object类中的equals方法当中，默认采用的是“==”判断两个java对象是否相等。而“==”判断的是两个java对象的内存地址，所以需要子类重写。
 
 */
public class Equals {
	public static void main(String[] args) {
		//判断两个基本数据类型的数据是否相等直接使用“==”就行
		int a = 100;
		int b = 100;
		System.out.println(a == b);
		
		//判断两个java对象是否相等该怎么办？
		MyTimes t1 = new MyTimes(2008, 8 ,8);
		MyTimes t2 = new MyTimes(2008, 8 ,8);
		System.out.println(t1 == t2);  //内存地址不同 结果为false
		
		//重写Object equals方法
		boolean c = t1.equals(t2);
		System.out.println(c);
		
		//再创建一个新的日期
		MyTimes t3 = new MyTimes(2008, 8 ,9);
		System.out.println(t1.equals(t3));
		
		//这个程序有没有bug？可以运行 但是效率不行。
		MyTime t4 = null;
		System.out.println(t1.equals(t4));
	}	
		
}	
class MyTimes{
	private int year;
	private int month;
	private int day;
	public MyTimes() {}
	public MyTimes(int year, int month, int day) {
		this.year  = year;
		this.month = month;
		this.day = day;
	  }
	
	/*重写Object equals方法
	public boolean equals(Object obj) {
		//当年月日都相同的时候，表示两个日期相同，两个对象相等
		//获取第一个日期的年月日
		int year1 = this.year;
		int month1 = this.month;
		int day1 = this.day;		
		//获取第二个日期的年月日
		if(obj instanceof MyTimes) {
			MyTimes t = (MyTimes)obj;
			int year2 = t.year;
			int month2 = t.month;
			int day2 = t.day;
			if(year1 == year2 && month1 == month2 && day1 ==day2) {
				return true;
			}
		
		}
		//开始比对
		return false;
		}
		*/
	
	//改良equals方法
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if(!(obj instanceof MyTimes)) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		MyTimes t = (MyTimes)obj;
		return this.year == t.year && this.month == t.month && this.day == t.day ;
		
	}
		
}

