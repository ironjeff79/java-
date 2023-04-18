package enumTest; //标识符，关键字不能做标识符。enum是关键字。

/*这个案例没有使用java中的枚举，
  分析以下程序，在设计方面有什么缺陷？在这个方法的返回值类型上
  
 */
public class Enum01 {
	public static void main(String[] args) {
		boolean retValue = divide(10,2);
		System.out.println(retValue ? "计算成功" : "计算失败");  //1
		System.out.println(divide(10,0) ? "计算成功" : "计算失败");  //0
		
	}
	
	/*分析以下程序，在设计方面有什么缺陷？在这个方法的返回值类型上，返回一个int不恰当。
	//以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0
	//既然最后的结果只是成功和失败，最好使用布尔类型。因为布尔类型true和false正好可以表示两种不同的状态。
	public static int divide(int a,int b) {
		try {
			int c = a / b;
			//程序执行到此处表示以上代码没有发生异常。表示执行成功！
			//如果把1写成了10，返回10已经偏离了需求，实际上已经出错了，但是编译器没有检查出来。
			//错误尽量让编译器找出来，越早发现越好。
			return 1;
		}catch (Exception e) {
			//程序执行到此处表示发生异常。表示执行失败！
			return 0;
		}
		
	}
	*/
	public static boolean divide(int a,int b) {
		try {
			int c = a / b;
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	/*思考
	  以上程序没有问题，返回true和false两种情况
	  但是在以后的开发当中，有可能遇到一个方法的结果包括两种以上的情况，
	  每一个都是可以数清楚的，一枚一枚都是可以列举出来的。
	  这个布尔类型就无法满足需求了。
	*/
	
	
	
	
	
	
	
	
	
	
	

}
