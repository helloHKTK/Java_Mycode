/*
* 自己按教材中原理实现，如有错误还请指出(qiang.learning@gmail.com)
*/


import java.util.BitSet;

public class Main {

	public static void main(String[] args) {
		
		final int chrom_len = 5;
		int i;
		
		BitSet temp1Node = new BitSet(chrom_len);
		BitSet temp2Node = new BitSet(chrom_len);
		temp1Node.set(0);temp1Node.clear(1);;temp1Node.set(2);temp1Node.set(3);temp1Node.clear(4); //{1,0,1,1,0}
//		temp2Node.set(0);temp2Node.clear(1);;temp2Node.set(2);temp2Node.set(3);temp2Node.clear(4);
		temp2Node.clear(0);temp2Node.clear(1);;temp2Node.set(2);temp2Node.clear(3);temp2Node.set(4); //{0,0,1,0,1}
		
		temp1Node.xor(temp2Node);
		System.out.println(temp1Node.cardinality()==0);
		
		//显示初始化值
		System.out.println("---------初始值---------");
		System.out.println(temp1Node);
		System.out.println(temp2Node);
		for(i=0;i<chrom_len;i++)
		{
			System.out.print(temp1Node.get(i)+" ");
		}
		System.out.println();
		for(i=0;i<chrom_len;i++)
		{
			System.out.print(temp2Node.get(i)+" ");
		}
		
		//uniform crossover
		double r;
		boolean temp_p1,temp_p2;
		int[] W= new int[chrom_len]; // 屏蔽字
		
		int j;
		for(j=0;j<chrom_len;j++)
		{
			r = Math.random();			
			if(r>0.5)//执行互换操作
			{	
				W[j]=1;
				
				temp_p1 = temp1Node.get(j);
				temp_p2 = temp2Node.get(j);
				if (temp_p1==temp_p2) // 相同,交叉也没有效果
					continue;
				else
				{
					if (temp_p1) // parent1的第i位为1,parent2的第i位为0
					{
						temp1Node.clear(j);
						temp2Node.set(j);
					}
					else // parent2的第i位为1,parent1的第i位为0
					{
						temp2Node.clear(j);
						temp1Node.set(j);
					}
				}
			}			
		}

		System.out.println("\n---------均匀交叉后结果---------");
		System.out.println(temp1Node);
		System.out.println(temp2Node);
		for(i=0;i<chrom_len;i++)
		{
			System.out.print(temp1Node.get(i)+" ");
		}
		System.out.println();
		for(i=0;i<chrom_len;i++)
		{
			System.out.print(temp2Node.get(i)+" ");
		}
		System.out.println("\n屏蔽字为:");
		for(int a:W)
			System.out.print(a+" ");
		System.out.println("\n temp2Node中设置为true的位数");
		System.out.println(temp2Node.cardinality());
				
	}
	

}
