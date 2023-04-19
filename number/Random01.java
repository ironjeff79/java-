package number;
import java.util.Random;
/* 运行结果
1785568809
55
随机数
*/
public class Random01 {
	public static void main(String[] args) {
		//创建随机数对象
		Random random = new Random();
		//随机产生一个int类型取值范围内的数字。
		int num1 = random.nextInt();
		System.out.println(num1);
		
		//产生[0-100]之间的随机数，不包含101
		//nextInt翻译为：下一个int类型的数据是101，表示只能取到100
		System.out.println(random.nextInt(101));
		
	}

}
