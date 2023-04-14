package changLiang;

/*String类当中常用方法。
      1. char charAt(int index)
      2. int compareTo(String anotherString)  字符串之间比较大小不能直接使用< >，需要使用compareTo方法。
      3. boolean contains (CharSequence s)  判断前面的字符串中是否包含后面的字符串
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
    }
}
