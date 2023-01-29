package baojizhi;
/*运行结果
32
您输入的字符串是：32
名字是：zhangsan
名字是：lisi
 */
/*package和import
关于java语言中的oackage和import机制：
   1 为什么要使用package？
     package是java中包机制。为了方便程序的管理。
     不同功能的类分别存放在不同的包下。（按照功能划分的，不同的软件包具有不同的功能）
   2 package怎么用？
     package是一个关键字，后面加包名。例如：
     package com.bjpowernode.javase.chapter17;
     注意：package语句只允许出现在java源代码的第一行。
     
   3 包名有没有命名规范？
     有 一般采用公司域名倒叙的方式（因为公司域名具有全球唯一性）
     包名命名规范：
        公司域名倒序 + 项目名 + 模块名 + 功能名
        
   4 对于带有package的java程序怎么编译？怎么运行？
      采用之前的编译和运行不行了
      类名是 com.bjpowernode.javase.chapter17.HelloWorld
      编译：         
          javac -d . HelloWorld.java
          javac 负责编译的命令
          -d 带包编译
          .  代表编译之后生成的东西放到当前目录下（点代表当前目录）
          HelloWorld.java 被编译的java文件名
      运行：
         java com.bjpowernode.javase.chapter17.HelloWorld 
   
   5 关于import的使用 
        import什么时候使用？
        A类中使用B类。
        A类B类都在同一个包下。不需要import
        A类B类不在同一个包下。不需要import   
        java.lang.*; 这个包下的类不需要使用import导入  
        
        import怎么用？
        import语句只能出现在package语句之下，class声明语句之上。
        import语句还可以采用星号的方式。
        
   6 package和import 总结
       1 package出现在java源文件第一行
       2 带有包名怎么编译？
         javac -d .xxx.java
       3 怎么运行？
         java完整类名
       4 import什么时候不需要？
         java.lang不需要
         同包下不需要 其他一律都需要
       5 怎么用？
         import 完整类名;
         import 包名.*; 
                
  
*/
public class Baojizhi {
	public static void main (String[] args) {
		//因为Baojizhi和Scanner类不在同一个包下。
		//java.util就是Scanner类的包名。
		//也可以在前面加入一行 import Java.util.*;
		java.util.Scanner s = new java.util.Scanner(System.in);
		String str = s.next();
		System.out.println("您输入的字符串是：" + str);
		
		java.lang.String name = "zhangsan";
		System.out.println("名字是：" + name);
		String name2 = "lisi";
		System.out.println("名字是：" + name2);
		
	}

}
