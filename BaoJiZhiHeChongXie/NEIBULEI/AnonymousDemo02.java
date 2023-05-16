package examTopic;
/**
 * 运行结果：匿名内部类用于给方法传递实参
 * 说明：首先有一个接口，然后在使用的类中编写了一个方法（参数类型是接口对象），并使用接口中未实现的方法。
                我们调用此方法直接构造一个接口对象传入，此时会自动生成一个此接口的子类（匿名内部类）实现接口中的方法。本质传入的类便是此时的匿名内部类。
 * @author 47922
 *
 */
interface Dao2 {
	void show();
}
 
public class AnonymousDemo02 {
    //编写回调方法:callInner 参数类型为接口Dao
    private static void callInner(Dao d) {
        d.show();
    }
 
    public static void main(String[] args) {
        callInner(new Dao() {//接口回调
 
            //实现子类 但是没有名字 所以叫匿名内部类
            @Override
            public void show() {
                System.out.println("匿名内部类用于给方法传递实参");
            }
        });
    }
}