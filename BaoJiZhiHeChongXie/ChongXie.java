package baojizhi;
/*运行结果
true
false
 */

public class ChongXie {
	public static void main(String[] args) {
		
		User u1 = new User("zhangsan",new Address("shanghai","xuhuiqu","11111"));
		User u2 = new User("zhangsan",new Address("shanghai","xuhuiqu","11111"));
		System.out.println(u1.equals(u2));
		
		User u3 = new User("zhangsan",new Address("shanghai","minhangqu","11111"));
		System.out.println(u1.equals(u3));
	}

}


class User{
	String name;
	Address addr;
	
	public User(){}
	public User(String name,Address addr) {
		this.name = name;
		this.addr = addr;
	}
	//这个equals判断的是User对象是否相等。
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof User)) return false;
		if(this == obj) return true;
		
		User u = (User) obj;
		if(this.name.equals(u.name) && this.addr.equals(u.addr)) {
			return true;
		}
		return false;
	}
}


class Address{
	String city;
	String street;
	String zipcode;
	
	public Address() {}
	public Address(String city,String street,String zipcode) {
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}
	//重写equals方法
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Address)) return false;
		if(this == obj) return true;
		Address a = (Address)obj;
		if(this.city.equals(a.city) && this.street.equals(a.street) && this.zipcode.equals(a.zipcode)) {
			return true;
		}return false;
	}
}


