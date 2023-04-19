package date;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 运行结果
1970-01-01 09:00:00 001
2023-04-18 18:46:53 669
2023-04-02 18:06:24 741

*/
public class Date03 {
	public static void main(String[] args) {
		
		Date time = new Date(1);  //注意：参数是一个毫秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strTime = sdf.format(time);
		System.out.println(strTime);  //格林威治时间是标准时间 
		
		//获取昨天的此时的时间
		Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
		System.out.println(sdf.format(time2));
		
		
		//获取去年的今天的时间
		Date time3 = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24 * 365) );
		System.out.println(sdf.format(time3));
	}

}
