package baojizhi;
/*访问控制权限
   private    私有
   protected  受保护
   public     公开
              默认
              
 1 控制范围是什么？
    private 表示私有的，只能在本类中访问
    public 表示公开的，在任何位置都可以访问           
    “默认”表示只能在本类，以及同包下访问
    protected表示只能在本类，同包，子类中访问
    
   	访问控制修饰符		本类			同包			子类			任意位置
-----------------------------------------------------------------------
       public           可以        可以        可以          可以
       protected        可以        可以        可以          不行
       默认	            可以        可以        不行          不行
       private          可以        不行        不行   	     不行

范围从大到小排序  public > protected > 默认 > private

  2 访问控制权限修饰符可以修饰什么？
    属性（4个都能用）
    方法（4个都能用）
    类（public和默认能用，其他不行。）
    接口（public和默认能用，其他不行。）
    
其他 JDK类库的根类：Object类当中有哪些常用的方法？如何寻找
    1 去源代码当中
    2 查阅java的类库的帮助文档
    
  什么是API?
   应用程序编程接口（Application Program Interface）
   整个JDK的类库就是一个javase的API
   每一个API都会配置一套API帮助文档  
    
  目前需要知道的方法：
   protected Object clone()    //负责对象克隆的
   int hashCode()   //获取对象哈希码的一个方法
   boolean equals (Object obj)  //判断两个对象是否相等
   String toString()   //将对象转换成字符串形式
   protected void finalize()    //垃圾回收器负责调用的方法
   
*/

public class FangWenQuanXian {
	//给一些私有的属性
	private int id;
	protected int age;
	public int weight;
	String name;
	
	//方法
	public void m1() {}
	private void m2() {}
	void m3() {}
	protected void m4() {}
	
	//静态方法
	public static void x() {}
	private static void y() {}
	static void z() {}
	protected static void k() {}
	

}
