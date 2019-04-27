//主要是想利用FHM算法中的2-items的TWU值
//下面实现的是：将嵌套的map表示的值填入二维数组，并打印二维数组

package com.helloHKTK;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	class Pair{
		int item = 0;
		int utility = 0;
	}
	
	public static void main(String[] args) {
		
		
		Map<Integer, Map<Integer, Long>> mapFMAP;
		mapFMAP =  new HashMap<Integer, Map<Integer, Long>>();
		
			// row1
			Map<Integer, Long> mp1= new HashMap<Integer, Long>();
			mp1.put(2, (long) 35);
			mp1.put(3, (long) 55);
			mp1.put(4, (long) 33);
			mp1.put(5, (long) 47);			
			mapFMAP.put(1, mp1);	
			
			//row2
			Map<Integer, Long> mp2= new HashMap<Integer, Long>();
			mp2.put(3, (long) 54);
			mp2.put(4, (long) 45);
			mp2.put(5, (long) 54);			
			mapFMAP.put(2, mp2);
			
			//row3
			Map<Integer, Long> mp3= new HashMap<Integer, Long>();
			mp3.put(4, (long) 53);
			mp3.put(5, (long) 76);			
			mapFMAP.put(3, mp3);
		
			//row4
			Map<Integer, Long> mp4= new HashMap<Integer, Long>();
			mp4.put(5, (long) 45);			
			mapFMAP.put(4, mp4);
		
		for (Map.Entry<Integer, Map<Integer, Long>> entry : mapFMAP.entrySet()) { 
		  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
		
		System.out.println("-----------------------");
		
		// 以下才是重点，将嵌套的map表示的值填入二维数组，并打印二维数组
		int i,j;
		int row_num=5,column_num=5;//0,1,2,3,4
        long[][] arr = new long[row_num][column_num];
		for (Map.Entry<Integer, Map<Integer, Long>> entry : mapFMAP.entrySet()) 
		{ 
			  //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
			  Map<Integer, Long> mp= new HashMap<Integer, Long>();
			  mp =entry.getValue();
			  
			  for(Map.Entry<Integer, Long> entry1 : mp.entrySet())
			  {
				  arr[entry.getKey()-1][entry1.getKey()-1]=entry1.getValue();
			  }
			  
		}
		
		for(i=0;i<row_num;i++)
	       {
	           for (j=0;j<column_num;j++)
	               System.out.print(arr[i][j]+" ");
	           System.out.print("\n");
	       }
		
		
		
		
		

	}

}
