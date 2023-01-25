package abstractword;
//运行结果 abstractword.Friend@1eb44e46
//自己类 Myself has a Friend

public class jiekouhomework2 {
	public static void main(String[] args) {
		//创建朋友对象
		Friend f = new Friend();  //朋友对象有了
		//创建自己对象 目前还没有交朋友
		Myself m = new Myself(); //自己对象
		m.f = f; //把朋友的地址给了你
		System.out.println(m.f);
		//创建对象的同时交朋友
		Myself m2 = new Myself(f);
		
	}

}

class Myself{
	//你这个对象，应该有一个朋友对象的电话号码
	//电话号码就是一个对象的内存地址，联系朋友的时候，打电话
	//f是一个引用，f默认值是null，是null表示，你没有朋友
	Friend f;
	public Myself() {
		
	}
	//通过构造方法能不能给你一个朋友对象
	public Myself(Friend f) {
		this.f = f;
	}
}

class Friend{
	
}