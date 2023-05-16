package examTopic;

// 实现关系下的匿名内部类：
interface Dao {
	void show();
}

public class AnonymousDemo {
   //编写回调方法 ：callInner
   public void callInner(){
       // 接口关系下的匿名内部类
       new Dao(){
           //实现子类 但是没有名字 所以叫匿名内部类
           @Override
           public void show() {
               System.out.println("接口方法...");
           }
       }.show();
   }
}

