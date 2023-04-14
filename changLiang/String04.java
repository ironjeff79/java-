package changLiang;

/*String类当中常用方法。
      1. char charAt(int index)
      2. int compareTo(String anotherString)  字符串之间比较大小不能直接使用< >，需要使用compareTo方法。
      3. boolean contains (CharSequence s)  判断前面的字符串中是否包含后面的字符串
      4. boolean endsWith(String suffix)  判断当前字符是否以某个子字符结尾
      5. boolean equals(Object anObject) 比较两个字符串必须使用equals方法，不能使用双等号 “==”
      6. boolean equalsIgnoreCase(String anotherString) 判断两个字符串是否相等，并且同时忽略大小写
      7. byte[] getBytes() 将字符串对象转换成字节数组
      8. int indexOf(String str) 判断某个子字符串在当前字符串中第一次出现处的索引（下标）
      9. boolean isEmpty() 判断某个字符串是否为“空字符串” 底层源代码调用的应该是字符串的length()方法。
      10.int length() 
         ** 面试题 判断数组长度和判断字符串长度不一样
            判断数组长度是length属性，判断字符串长度是length()方法。
      11.int lastIndexOf(String str) 判断某个子字符串在当前字符串当中最后一次出现的索引（下标）
      12.String replace(CharSequence target, CharSequence repalcement) String的父接口是：CharSequence 
      13.String[] split(String regex) 拆分字符串
      14.boolean startsWith(String prefix) 判断某个字符串是否以某个子字符串开始
      15.String substring(int beginIndex) 截取字符串 参数是起始下标
      16.String substring(int beginIndex,int endIndex) 返回一个新字符串 是此字符串的一个子字符串 长度为endIndex-beginIndex
              beginIndex是起始位置（包括） endIndex是结束位置（不包括）
      17.char[] toCharArray() 将字符串转换成char数组
      18.String toLowerCase() 转换为小写
      19.String toUpperCase() 转换为大写
      20.String trim() 去除字符串前后空白
      21.String中只有一个方法是静态的 不需要new对象 这个方法叫做valueOf  将非字符串转换为字符串
*/

public class String04{
    public static void main(String[] args){
          //char charAt(int index)   
          char c = "中国人".charAt(1);  //"中国人"是一个字符串String对象，只要是对象就能"."
          System.out.println(c); //国
    
          //int compareTo(String anotherString)
          int result = "abc".compareTo("abc");
          System.out.println(result);  //0  前后一致
    
          int result2 = "abcd".compareTo("abce");  
          System.out.println(result2);  //-1  前小后大
    
          int result3 = "abce".compareTo("abcd");  
          System.out.println(result3);  //1  前大后小
    
          //拿着字符串第一个字母和后面字符串的第一个字母比较。能分胜负就不再比较。
          System.out.println("xyz".compareTo("yxz")); //-1
          
          //boolean contains (CharSequence s)
          System.out.println("HelloWorld.java".contains(".java")); //true
          System.out.println("Http://www.baidu.com".contains("Https://")); //true
          
          //boolean endsWith(String suffix)
          System.out.println("test.txt".endsWith(".java")); //false
          System.out.println("test.txt".endsWith(".txt")); //true
          
          //boolean equals(Object anObject)
          //equals方法有没有调用compareTo方法？老版本可以看一下。JDK13中并没有调用此方法。
          //equals方法只能看出相等不相等，compareTo方法可以看出是否相等，并判断出谁大谁小。
          System.out.println("abc".equals("abc")); //true
          
          //boolean equalsIgnoreCase(String anotherString)
          System.out.println("ABc".equalsIgnoreCase("abC")); //true
          
          //byte[] getBytes()
          byte [] bytes = "abcdef".getBytes();
          for(int i = 0; i < bytes.length; i++){
              System.out.println(byte[i]);
          }
          
          //int indexOf(String str)
          System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".indexOf("java")); //6
          
          //boolean isEmpty()
          String s = " ";
          System.out.println(s.isEmpty()); //true 
                
          //int length()
          System.out.println("abc".length()); //3
          
          //String replace(CharSequence target, CharSequence repalcement)
          System.out.println("http://www.baidu.com".repalce("http://","https://")); //https://www.baidu.com
          //把以下字符串的" = "号替换成" : "
          System.out.println("name=zhangsan&password=123&age=20".repalce(" = "," : ")); 
          
          //String[] split(String regex)
          String[] ymd = "2020-01-01".spilt("-");
          for(int i = 0; i < ymd.length; i++){
              System.out.println(ymd[i]); 
          }
          
          String param = "name=zhangsan&password=123&age=20";
          String[] params = param.spilt("&");
          for(int i = 0; i < params.length; i++){
              System.out.println(params[i]);
          }
          //boolean startsWith(String prefix)
          System.out.println("http://www.baidu.com".startsWith("http")); //true
          
          //String substring(int beginIndex)
          System.out.println("http://www.baidu.com".substring(7)); //www.baidu.com
          
          //String substring(int beginIndex,int endIndex)
          System.out.println("http://www.baidu.com".substring(7,10)); //www 7包含 10不包含 左闭右开
          
          //char[] toCharArray
          char[] chars = "我是中国人".toCharArray();
          for(int i = 0; i < chars.length; i++){
              System.out.println(chars[i]);
          }
          
          //String toLowerCase()
          System.out.println("ABCdefXYZ".toLowCase());
          
          //String trim()
          System.out.println("      hello   world       ".trim()); //hello   world
          
          //静态方法 用类名去
          String s1 = String.valueOf(3.14);
          System.out.println(s1);
          //这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？
          String s2 = String.valueOf(new Customer());
          //System.out.println(s2);  没有重写toString()方法之前是对象内存地址
          System.out.println(s2);  //我是一个VIP客户！！！
          
          
          Object obj = new Object();
          //通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法！ 先调String.valueOf,再调.toString()
          System.out.println(obj);
          //能够在控制台上显示出来的其实都是字符串 。
          //本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出。
                
    }
}
class Customer{
    //重写toString()方法
    public String toString(){
        return "我是一个VIP客户！！！";
    }
      
}
