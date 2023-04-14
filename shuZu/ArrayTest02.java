package shuZu;
/*运行结果
交换次数：10
比较次数：4
1
2
3
5
6
*/
/*
 选择排序
每循环一次，从参与比较的数据当中找出最小值
拿这个最小值和最前面的元素交换位置。
选择排序比冒泡排序好在效率高，每一次的交换位置都是有意义的
例：参与比较的数据 3 1 6 2 5
 第一次循环之后的结果 1 3 6 2 5(最左边元素下标为0)
 
 参与比较的数据 3 6 2 5
 第二次循环之后的结果 2 6 3 5(最左边元素下标为1)
 
 参与比较的数据 6 3 5
 第三次循环之后的结果 3 6 5(最左边元素下标为2)
 
 参与比较的数据 6 5 
 第四次循环之后的结果 5 6(最左边元素下标为3) 
注意：5条数据循环4次
关键点：选择排序中的关键在于，怎么找出最小的 
    3和2比较，2更小，此时最小的是2
    继续拿着2往下比对，2和6比较，2仍是最小的
    继续拿着2往下比对，2和1比较，1更小，此时最小的是1
    继续拿着1往下比对，1和5比较，还是1最小，所以1就是最小的
    以此类推
*/

public class ArrayTest02{
    public static void main(String[] args){
        int[] arr = {3,1,6,2,5};
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length - 1; i++){
        //i正好是“参加比较的这堆数据中”最左边元素的下标
        //System.out.println(i);
        //i是一个参与比较的这堆数据中的起点下标
        //假设起点i下标位置上的元素是最小的
        int min = i;
        for(int j = i + 1; j < arr.length; j++){
        	//System.out.println("-->" + j); 
            count++;
            if(arr[j] < arr[min]){
            	min = j;//最小值的下标元素是j
           }
       }
        //当i和min相等时，表示最初假设是对的。反之表示有比这更小的元素，需要拿着这个更小的元素和最左边的元素交换位置。
        if(min != i) {
        	
        	int temp;
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            count2++;
        }
       
   }
        //冒泡排序和选择排序实际上比较次数一致，交换位置的次数选择排序较少。
        System.out.println("交换次数：" + count);
        System.out.println("比较次数：" + count2);
        
        //排序之后遍历
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }      	
}
