## 题目描述

输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

### 1. 方法一：使用最大堆保存这k个数(时间复杂度O(n*logk))

思想：用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆。

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;

        ArrayList minK = GetLeastNumbers_Solution(arr, k);
        System.out.println(minK);
    }

    /*
    链接：https://www.nowcoder.com/questionTerminal/6a296eb82cf844ca8539b57c23e6e9bf?f=discussion
    来源：牛客网
    */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if(k > length || k == 0){
            return result;
        }

        //java中的优先队列是基于堆实现的
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // o1.compareTo(o2) 从小到大  反过来 从大到小
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        
        /*用迭代器来取优先队列中的数，得到的不一定是有序的。基于堆的优先队列，并没有将元素进行排序，而只是在利用最大堆或最小堆的性质在堆顶保存了最大值或者最小值。
        */
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;

    }

}

```



## 2. 基于冒泡排序的思想(时间复杂度O(n*k))

```java
链接：https://www.nowcoder.com/questionTerminal/6a296eb82cf844ca8539b57c23e6e9bf?f=discussion
来源：牛客网

public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (k > input.length) {
            return al;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            al.add(input[input.length - i - 1]);
        }
        return al;
    }
```

```java
//自己也是基于冒泡排序的思路(牛客网通过)

import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        
        ArrayList<Integer> res = new ArrayList<>();
        if(k > input.length)
            return res;
        
        // 基于冒泡排序的思想,只是将每次最大的数就位变成了最小的数就位
        int i,j;
        for(i = 0; i < k; i++) // 次处将i<input.length换成了i<k【表示趟数】
        {
            for(j = 0; j < input.length - i - 1; j++)
                if(input[j] < input[j+1])
                {
                    input[j] ^= input[j+1];
                    input[j+1] ^= input[j];
                    input[j] ^= input[j+1];
                }
            res.add(input[input.length-1-i]); // 当前排行的元素加入list
        }
        return res;            
    }
}
```



