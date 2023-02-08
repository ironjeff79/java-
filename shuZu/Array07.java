package shuZu;
/*运行结果
Animal move
Animal move
猫在走猫步
---------------------------------------
猫抓老鼠
Bird singing

 一维数组的深入，数组中存储的类型为：引用数据类型
 对于数组来说，实际上只能存储java对象的内存地址，数组中存储的每个元素是“引用”。
*/
public class Array07 {
	public static void main(String[] args) {
		//创建一个Animal类型的数组
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal[] animals = {a1,a2};
		
		//对Animal数组进行遍历
		for(int i = 0;i < animals.length; i++) {
			//Animal a = animals[i];
			//a.move();
			//代码合并
			animals[i].move();			
		}
		
		//动态初始化一个长度为2的Animal类型数组
		Animal[] ans = new Animal[2];
		//创建一个Animal对象，放到数组的第一个盒子中。
		ans[0] = new Animal();
		ans[1] = new Cat();
		ans[1].move();
		System.out.println("---------------------------------------");
		
		//创建一个Animal类型的数组，数组当中存储Cat和Bird
		Animal[] anis = {new Cat(),new Bird()};
		for (int i = 0;i < anis.length; i++) {
			//Animal an = anis[i];
			//an.move();
			if(anis[i] instanceof Cat) {
				Cat c = (Cat)anis[i];
				Cat.catchMouse();
			}else if(anis[i] instanceof Bird) {
				Bird b = (Bird) anis[i];
				Bird.sing();				
			}
			
		}
    }
}
class Animal{
	public void move() {
		System.out.println("Animal move");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("猫在走猫步");
	}
	public static void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
class Bird extends Animal{
	public void move() {
		System.out.println("Bird flying");
	}
	public static void sing() {
		System.out.println("Bird singing");
	}
}

	
