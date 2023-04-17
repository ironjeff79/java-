package integer;
/*运行结果
100
123
3.14 
*/
/*
关于integer类的构造方法，有两个：
    Integer(int) 
    Integer(String)

*/
public class Integer03 {
	public static void main(String[] args) {
		//JDK9之后不建议使用这个构造方法，出现横线表示已过时。
		//将数字100转换成integer包装类型(int --> integer)
		Integer x = new Integer(100);
		System.out.println(x); //toString重写了
		
		//将String类型的数字，转换成Integer包装类型。(String --> integer)
		Integer y = new Integer("123");
		System.out.println(y);
		
		//double --> Double
		Double d = new Double(3.14);
		System.out.println(d);
	}

}
