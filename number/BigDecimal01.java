package number;
import java.math.BigDecimal;
/*运行结果
300
2

 1. BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
    这是SUN提供的一个类。专门用在财务软件当中。
    
 2. 注意：财务软件中Double是不够的。   
 */
public class BigDecimal01 {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal(100);
		BigDecimal bd2 = new BigDecimal(200);
		
		/*求和 
		不能 bd1 + bd2，
		两者都是引用，不能直接求和。
		*/
		System.out.println(bd1.add(bd2));  //300 调用方法求和
		System.out.println(bd2.divide(bd1));  //2
	}

}
