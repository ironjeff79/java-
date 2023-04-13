package shuZu;

/*
数组工具类：自己写的，不是SUN的。

二分法查找  1 基于排序的基础之上
           2 查找效率要高于“一个挨着一个”的查找方法

二分法查找的终止条件：一直折半，直到中间的那个元素恰好是被查找的元素。

arr数组 10(下标0) 11 12 13 14 15 16 17 18 19 20(下标10)
  通过二分法查找，找出18这个元素的下标：
     (0 + 10)/2 ---> 中间元素的下标：5
  
  拿着中间这个元素和目标要查找的元素进行对比：
    中间元素是 arr[5] ---> 15
    15 < 18(被查找的元素)
    说明被查找的元素18在目前元素15的右边
    所以开始元素的下标从0变成6
    
    再重新计算一个中间元素的下标：
    开始下标是：5 + 1 
    结束下标还是10
    (6 + 10)/2 ---> 中间元素的下标：8
    8下标对应的元素arr[8]是18
    找到的中间元素正好和被找的元素18相等，表示找到了。下标为8。
*/

public class ArrayUtil{
    public static void main(String[] args){
        int[] arr = [100,200,230,235,600,1000,2000,9999];
        
        //找出arr这个数组中200所在的下标
        //调用方法
        int index = binarySearch(arr,200);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标：" + index);
    }
    
    /*从数组中查找目标元素的下标
    arr 被查找的数组（必须是已经排序的）
    dest 目标元素
    -1 表示该元素不存在 其他表示返回该元素的下标
    */
    public static int binarySearch(int[] arr, int dest){
        //开始下标
        int begin = 0;
        //结束下标
        int end = arr.length - 1;
        //开始元素的下标只要在结束元素下标的左边，就有机会继续循环
        while(begin <= end){
        //中间下标
            int mid = (begin + end) / 2;
            if (arr[mid] == dest){
                return mid;
            } else if(arr[mid] < dest){
                //目标在中间的右边 开始元素下标需要发生变化(需要重新赋值)
                begin = mid + 1; //一直增
            } else{
                //目标在中间的左边  结束元素下标需要发生变化(需要重新赋值)
                end = mid - 1;  //一直减
            }
        }
        return -1;
    }
        
}

      
  
  
  
  
