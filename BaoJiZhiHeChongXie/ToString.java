package baojizhi;
//运行结果1970年1月1日
/*关于Object类的toString()方法
   1 源代码长什么样？  
   public String toString(){
      return getClass().getName() + "@" + Integer.toHexString(hashCode());
   }
   源代码上toString()方法的默认实现是：
      类名@对象的内存地址转换为十六进制的形式
    
      
   2 SUN公司设计toString()方法的目的是什么？
     toString()方法的作用是什么？
     toString()方法的设计目的是：通过调用这个方法可以将一个“java对象”转换成“字符串表现形式”
    
   3 其实SUN公司公司开发java语言的时候，建议所有的子类都去重写toString()方法。
     toString()方法应该是一个简洁的，详实的，易阅读的。   
   
*/
public class ToString {
	public static void main(String[] args) {
		MyTime t1 = new MyTime(1970,1,1);
		String s1 = t1.toString();
		System.out.println(s1);
	}
	

}

class MyTime{
	private int year;
	private int month;
	private int day;
	public MyTime() {}
	public MyTime(int year, int month, int day) {
		this.year  = year;
		this.month = month;
		this.day = day;
	}
	//重写toString()方法 越简洁越好，可读性越强越好
	public String toString() {
		return this.year + "年" + this.month + "月" + this.day + "日";
	}
	
}
