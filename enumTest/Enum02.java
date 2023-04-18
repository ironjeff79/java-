package enumTest;
/*运行结果  计算失败
1. 枚举也是一种引用数据类型。
2. 枚举类型怎么定义，语法是？
   enum 枚举类型名{
       枚举值1,枚举值2
   }
3. 结果只有两种情况的，建议使用布尔类型。   
   
   枚举编译之后也是生成class文件。

   枚举中的每一个值可以看作是常量。 
*/
public class Enum02 {
	public static void main(String[] args) {
		Result r = divide(10,0);
		System.out.println(r == Result.SUCESS ? "计算成功" : "计算失败");
	}
	
	//计算两个int类型数据的商
	//Result.SUCESS表示成功 Result.FAIL表示失败
	public static Result divide(int a,int b) {
		try {
			int c = a / b;
			return Result.SUCESS;
		}catch(Exception e) {
			return Result.FAIL;
		}
	}

}

//枚举： 一枚一枚可以列举出来，才建议使用枚举类型。
enum Result{
	//SUCESS 是枚举Result类型中的一个值
	//FAIL 是枚举Result类型中的一个值
	//枚举中的每一个值，可以看作是“常量”
	SUCESS,FAIL
	
}
