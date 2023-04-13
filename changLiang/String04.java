package changLiang;

/*String类当中常用方法。
      1. char charAt(int index)
      2. int compareTo(String anotherString)

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
    }
}
