package date;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
java中对日期的处理
这个案例最主要掌握：知识点1 怎么获取系统当前时间
                   知识点2 String --> Date
                   知识点3 Date --> String
                   
*/

public class Date01 {
	public static void main(String[] args) throws Exception{
		//获取系统当前时间(精确到毫秒) 
		//直接调用无参数构造方法
		Date nowTime = new Date();
		System.out.println(nowTime);
		
		//将日期类型Date，按照指定的格式进行转换：Date --> 转换成具有一定格式的日期字符串 --> String
		//SimpleDateFormat是java.text包下的，专门负责日期格式化的。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(nowTime));
		
		//假设现在有一个日期字符串String，怎么转换成Date类型？
	    //String --> Byte
		String time = "2008-08-08 08:08:08 888";
		//注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致，不然会出现异常：java.text.ParseException。
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dateTime = sdf2.parse(time);
		System.out.println(dateTime);
	}

}
