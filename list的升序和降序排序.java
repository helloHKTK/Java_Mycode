List<Double> value_list = new ArrayList<Double>();
		value_list.add(2.0);
		value_list.add(1.0);
		value_list.add(3.0);
		value_list.add(5.0);
		value_list.add(4.0);
		System.out.println(value_list);
		
		Collections.sort(value_list); // 升序排序		
		System.out.println(value_list);
		
		
		//反转之后变成倒序 排序
		Collections.reverse(value_list);
		System.out.println(value_list);
