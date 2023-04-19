package integer;
//目前这种包装类是自己写的，实际开发中不需要自己写。

public class MyInt {
	int value;
	
	
	public MyInt() {
		
	}
	
	public MyInt(int value) {
		this.value = value;
	}
	
	
	//Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
