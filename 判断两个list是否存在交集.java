		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(1);l1.add(2);l1.add(3);
		l2.add(7);l2.add(6);l2.add(4);
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		// list1 与 list2 存在相同元素，list1集合只保留list2中存在的元素
		// list1 与 list3 不存在相同元素，list1集合变为空
		l1.retainAll(l2); 		
		
		if(l1.isEmpty())
		{
			System.out.println("没有交集！");
		}
		else
		{
			System.out.println("存在交集");
		}
