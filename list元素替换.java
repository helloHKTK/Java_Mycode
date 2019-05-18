int len = 4;		
//--------------- 1 原List ----------------------------------				
		List<BitSet> list1 = new ArrayList<BitSet>();// populations[存放整个种群]

		BitSet bitset1 = new BitSet(len);
		bitset1.set(0);
		bitset1.set(1);
		bitset1.clear(2);
		bitset1.clear(3);		
		System.out.println(bitset1);
		list1.add(bitset1);
		
		
		BitSet bitset2 = new BitSet(len);
		bitset2.clear(0);
		bitset2.clear(1);
		bitset2.set(2);
		bitset2.set(3);		
		System.out.println(bitset2);
		list1.add(bitset2);
		
		System.out.println("原List = "+list1);
		
//------------------ 2 替换原List中的某个元素 -------------------------------
		
		BitSet new_bitset = new BitSet(len);
		new_bitset.set(0);
		new_bitset.set(1);
		new_bitset.set(2);
		new_bitset.set(3);
		
		list1.set(1,new_bitset);// 替换下标为1的list元素
		
		System.out.println("替换之后的List = "+list1);
