package shuZu;

public class Room {
	/*
	  房间编号
	  1楼：101 102 103 104 105 106...
	  2楼：201 202 203 204 205 206...
	  3楼：301 302 303 304 305 306...
	 */
	private int no;
	
	
	
	//房间类型：标准间 单人间 豪华间
	private String type;
	
	
	
	//房间状态： true表示空闲 false表示占用
	private boolean status;
	
	
	//构造方法
	public Room() {
		
	}
	public Room(int no, String type, boolean status) {
		this.no = no;
		this.type = type;
		this.status = status;		
	}
	
	
	//setter和getter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//equals方法重写  用来比较两个房间是否相同
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Room))return false;
		if(this == obj) return true;
		Room room = (Room)obj;
		return this.no == room.getNo();
	}
	
	
	
	//toString方法重写
	public String toString() {
		//动态（把一个变量塞到一个字符串当中，口诀：加一个双引号，双引号中间加两个加号，两个加号中间加变量名。） 
		return "["+no+" , "+type+" , "+(status ? "空闲" : "占用")+"]";
	}
	
	public static void main(String[] args) {
		Room room = new Room(101, "单人间", true);
		//会自动调toString
		//System.out.println(room.toString());
		System.out.println(room);
		
		
		Room room1 = new Room(101, "单人间", true);
		System.out.println(room.equals(room1));
		
	}
}

















