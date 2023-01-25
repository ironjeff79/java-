package abstractword;
/*运行结果
中餐师傅做的番茄炒蛋
中餐师傅做的鱼香肉丝
*/
/*接口的使用离不开多态机制（接口+多态才可以达到降低耦合度）
接口可以解耦合
任何一个接口都有调用者和实现者。
接口可以将调用者和实现者解耦合。
调用者面向接口调用
实现者面向接口编写实现

类型和类型之间的关系：
is a(继承) has a(关联) like a(实现)

抽象类是半抽象的，接口是完全抽象
抽象类中有构造方法，接口中没有构造方法
接口和接口之间支持多继承 类和类之间只能单继承
一个类可以同时实现多个接口 一个抽象类只能继承一个类（）
接口中只允许出现常量和抽象方法

接口的使用比抽象类多，一般抽象类使用的较少
接口一般都是对“行为”的抽象

*/

public class jiekouhomework {
	public static void main(String[] args) {
	//创建厨师对象	
	FoodMenu cooker1 = new ChinaCooker();
	//创建顾客对象
	Customer customer = new Customer(cooker1);
	customer.order();
	}
}
	





//接口：菜单，抽象的
 interface FoodMenu{
	 void fanQieChaoDan();
	 void yuXiangRouSi();
}



//西餐厨师
//实现菜单上的菜  厨师是接口的实现者
class AmericCooker implements FoodMenu{
	public void fanQieChaoDan() {
		System.out.println("西餐师傅做的番茄炒蛋");
		}
	public void yuXiangRouSi() {
		System.out.println("西餐师傅做的鱼香肉丝");
	    }
}

class ChinaCooker implements FoodMenu{
	public void fanQieChaoDan() {
		System.out.println("中餐师傅做的番茄炒蛋");
		}
	public void yuXiangRouSi() {
		System.out.println("中餐师傅做的鱼香肉丝");
    }	
}

//顾客
class Customer{
	/*顾客手里有一个菜单
	Customer has a FoodMenu
	以后凡是能够使用has a来描述的，统一以属性的方式存在。
	
	Cat is Animal 但凡满足is a的表示都可以设置为继承
	Customer has a FoodMen 但凡是满足has a的表示都以属性的形式存在。
	*/

	//实例变量，属性
	private FoodMenu foodMenu;//都要养成封装的好习惯
	public Customer() {}
	public Customer(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}
	//set和get
	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}
	public FoodMenu getFoodMenu() {
		return foodMenu;
	}
	
	//提供一个点菜的方法
	public void order() {
		//先拿到菜单再点菜
		foodMenu.fanQieChaoDan();
		foodMenu.yuXiangRouSi();
	}
}



