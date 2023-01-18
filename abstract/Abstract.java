package abstractword;
//运行结果 查询信用卡余额
/*抽象类
   1 什么是抽象类？
     类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
     类到对象是实例化，对象到类是抽象。
     类本身是不存在的，所以抽象类无法创建对象《无法实例化》。
   
   2 抽象属于什么类型？
     抽象类也属于引用数据类型
   
   3 抽象类怎么定义？
     语法：
       [修饰符列表] abstract class 类名{
           类体;
       }
       
   4 抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。    
   
   5 final和abstract不能联合使用，这两个关键字是对立的。
   
   6 抽象类的子类可以是抽象类。
   
   7 抽象类虽然无法实例化，但是抽象类有构造方法，构造方法是供子类使用的。
   
   8 抽象类关联到一个概念：抽象方法。什么是抽象方法呢？
     抽象方法表示没有实现的方法，没有方法体的方法。
     例如： public abstract void doSome();
     方法特点：
        特点1：没有方法体，以分号结尾。
        特点2：前面修饰符列表中有abstract关键字。
   9 抽象类中不一定有抽象方法,抽象方法必须出现在抽象类中。
     一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
     这里的覆盖或者重写，也可以叫做实现。（对抽象的实现）
     
    
 题目：java语言中凡是没有方法体的方法都是抽象方法。
      不对，错误的。
      Object类中就有很多方法都没有方法体，都是以“;”结尾，但他们都不是抽象方法，例如：
         public native int hashCode();
         这个方法底层调用了C++写的动态链接库程序，修饰符列表中的native表示调用JVM本地程序。   
     
 */
public class Abstract {
	public static void main(String[] args) {
		Account a = new CreditAccount();//这就是面向抽象编程 这种编程思想符合OCP原则
		//面向抽象编程，不要面向具体编程，降低程序的耦合度，提高程序的扩展力。
		a.withdraw();
	}

}

//银行账户类（抽象类）
abstract class Account{
	//非抽象方法
	public void doOther() {
		
	}
	//抽象方法
	public abstract void withdraw();
	
}
//子类继承抽象类，子类可以实例化对象。（非抽象类）
class CreditAccount extends Account{
	//需要将从父类中继承过来的抽象方法进行覆盖/重写，或者也可以叫做“实现”。
	public  void withdraw() {
		System.out.println("查询信用卡余额");		
	}
	
}

