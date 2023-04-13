package shuZu;
import java.util.Arrays;

/*SUN公司已经写好了一个数组工具类 java.util.Arrays
  所有方法都是静态的，直接用类名调用
  主要使用的是两个方法：
      二分法查找，排序  
*/

public class ArrayTest03{
    public static void main(String[] args){
        int[] arr = {3,6,5,12,1,2,32,5,5};
        //排序
        Arrays.sort(arr);
        //输出
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //二分法查找
        int index = Arrays.binarySearch(arr,32);
        System.out.println(index == -1 ? "该元素不存在：" : "该元素下标是：" + index);
    }
}
