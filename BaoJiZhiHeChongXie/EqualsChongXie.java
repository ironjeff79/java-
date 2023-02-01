package baojizhi;
/*运行结果
false
true
 */
//String对象比较的时候必须使用equals方法

public class EqualsChongXie {
	public static void main(String[] args) {
		Student s1 = new Student(111,"实现小学");
		Student s2 = new Student(111,"实现小学");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}

class Student{
	//学号  
	int no;  //基本数据类型 比较时使用 ==
	//所在学校
	String school;  //引用数据类型，比较时使用 equals方法
	
	public Student() {}
	public Student(int no, String school) {
		this.no = no;
		this.school = school;
	}
	
	//重写toString方法
	public String toString() {
		return "学号" + no + " ， 所在学校名称" + school;
	}
	
	//重写equals方法
	//当一个学生的学号相等，并且学校相通时，表示同一个学生
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student)) return false;
		if(this == obj)return true;
		Student s = (Student)obj; 
		if(this.no == s.no && this.school.equals(s.school)) {
			return true;			
		}
		return false;
	}
}
