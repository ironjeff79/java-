package integer;
//运行结果 100
/*
1.  java中为8种基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是Object。
2.  为什么要再提供8种包装类？
    因为8种数据类型不够用，所以SUN又提供了对应的8种包装类型
*/

public class Integer01{
	//入口
    public static void main(String[] args){
    	/*有没有这种需求：调用doSome()方法的时候需要传一个数字进去
        但是数组属于基本数据类型，而doSome()方法参数的类型是Object
        可见doSome()方法无法接收基本数据类型的数字。那怎么办？可以传一个数字对应的包装类进去。        
        */
      
        //把100这个数字经过构造方法包装成对象
        MyInt myInt = new MyInt(100);
        //doSome()方法虽然不能直接传100，但是可以直接传一个100对应的包装类型。
        doSome(myInt);
    }
      
    public static void doSome(Object obj){
    	System.out.println(obj);
    }
}