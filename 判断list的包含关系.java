    List<Integer> templist = new ArrayList<Integer>(); 
		templist.add(1);templist.add(2);
		
		List<Integer> now_row_items = new ArrayList<Integer>(); 
		now_row_items.add(1);now_row_items.add(6);now_row_items.add(3);now_row_items.add(5);
		
		System.out.println(templist);
		System.out.println(now_row_items);
		
		System.out.println(now_row_items.containsAll(templist)); // list的包含关系
