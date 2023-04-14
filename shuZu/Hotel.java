package shuZu;
/*
 酒店对象，酒店中有二维数组，二维数组模拟大厦
*/

public class Hotel {
	
	private Room[][] rooms;
	
	//盖楼通过构造方法来盖楼
	public Hotel() {
		//一共有几层，每层的房间类型是什么，每个房间的编号是什么
		
		rooms = new Room[3][10]; //三行十列 3层楼 每层10间
		//创建30个Room对象，放到数组中。用二维数组遍历实现。
		for(int i = 0; i < rooms.length; i++) {
			for(int j = 0; j < rooms[i].length; j++) {
				if(i == 0) {
					rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
				}else if(i == 1) {
					rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
				}else if(i == 2) {
					rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
				}
			}
		}
	}
 
	//在酒店对象上提供一个打印房间列表的方法
	public void print() {
		//打印所有房间状态，就是遍历二维数组
		for(int i = 0; i < rooms.length; i++) {
			//里面for循环负责输出一层
			for(int j = 0;j < rooms[1].length; j++) {
				Room room = rooms[i][j];
				System.out.print(room);
			}
			//换行
			System.out.println();
		}
	}
	
	//订房方法
	//使用此方法时需要传递一个房间编号过来 房间编号由前台输入
	public void order(int roomNo) {
		//订房最主要的是将房间对象的status修改为false
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		room.setStatus(false);
		System.out.println(roomNo + "已订房");
	}
	
	//退房方法
	public void exit(int roomNo) {
		//订房最主要的是将房间对象的status修改为false
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		room.setStatus(true);
		System.out.println(roomNo + "已退房");
	}
	
}
