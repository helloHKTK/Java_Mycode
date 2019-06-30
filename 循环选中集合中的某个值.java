		List<Integer> Collection = new ArrayList<>();

		Collection.add(11);
		Collection.add(22);
		Collection.add(33);
		
		int choose_one = 0;
		for(int g=0;g<10;g++)
		{
			
			//模拟中途的两次添加
			if(g==4 ||g==6)
				Collection.add(g*10);
			
			
			System.out.print(choose_one+" ");
			System.out.println(Collection.get(choose_one));
			
			if (choose_one+1 < Collection.size())
				choose_one++;
			else
				choose_one = 0;	
			
		}
