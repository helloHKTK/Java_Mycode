List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		System.out.println(l1);
		
		List<Integer> distinctElements = l1.stream().distinct().collect(Collectors.toList());//
		
		System.out.println(distinctElements);
