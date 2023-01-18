package finalkeyword;
//运行结果 中国
/*final修饰的实例变量，必须手动赋值，只能赋一次值。

final修饰一般添加static修饰。

static final联合修饰的变量称为“常量”
常量名建议全部大写，每个单词之间采用下划线衔接。

常量：实际上常量和静态变量一样，区别在于：常量的值不能变。 

常量和静态变量都是存储在方法区，并且都是在类加载时初始化。

总结
1 final修饰的类无法继承
2 final修饰的方法无法覆盖
3 final修饰的变量只能赋值一次
4 final修饰的引用一旦指向某个对象，则不能再重新指向其他对象，但该引用指向的对象内部的数据是可以修改的。
5 final修饰的实例变量必须手动初始化，不能采用系统默认值。
6 final修饰的实例变量一般和static联合使用，成为常量。 

*/
public class Final3 {
	public static void main(String[] args){
		System.out.println(Chinese.COUNTRY);
	}

}



class Chinese{
	//身份证号 对象级别的，每个人都不一样
	String idCard;
	//姓名，对象级别
	String name;
	//国家是固定值
	//实例变量在堆中，一个对象一份。
	//实例变量既然使用final修饰，说明该实例变量值不会随着对象的变化而变化。
	//实例变量前面应该添加：static关键字，变为静态的，存储在方法区。
	static final String COUNTRY = "中国";
}