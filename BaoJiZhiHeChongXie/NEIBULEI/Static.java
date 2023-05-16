package examTopic;
/* 运行结果
我是：1.8
我是：静态内部类的type属性
我是：静态内部类的类名
我是：外部类的类名 
 */
public class Static {
    static String name = "外部类的类名";
    //静态内部类中不能访问外部类非静态成员
    String type = "外部类的type属性";
 
    public static class Inner{
        //四种权限修饰符可以修饰静态内部类
        public String name = "静态内部类的类名";
        static double weight = 1.8;
        String type = "静态内部类的type属性";
        public void show(){
            System.out.println("我是：" + weight);
            System.out.println("我是：" + type);
            System.out.println("我是：" + name);
            //System.out.println("我是：" + Static.type);//静态内部类中不能访问外部类非静态成员
            System.out.println("我是：" + Static.name);
        }
    }
 
    public static void main(String[] args) {
        //静态内部类可以直接实例化 不需要依附于外部类
        Inner inner = new Inner();
        inner.show();
    }
}
