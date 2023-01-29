package baojizhi;
/*运行结果
0
0
null
*/

public class Test01 {
	public static void main(String[] args) {
		FangWenQuanXian fwqx = new FangWenQuanXian();
		//private修饰的元素只能在本类中使用
		//System.out.println(fwqx.id);  The field FangWenQuanXian.id is not visible
		System.out.println(fwqx.age);
		System.out.println(fwqx.weight);
		System.out.println(fwqx.name);
		
		
	}

}
