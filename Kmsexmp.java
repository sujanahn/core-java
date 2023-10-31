class Kmsexmp{
	public static void main(String[] args)
	{
		System.out.println("starting of kmsexmp");
		System.out.println("starting of keyboard");
		Keyboard keyboard=new Keyboard();
		System.out.println("brand:"+keyboard.brand);
		System.out.println("color:"+keyboard.color);
		System.out.println("type:"+keyboard.type);
		System.out.println("noOfKeys:"+keyboard.noOfKeys);
		System.out.println("cost:"+keyboard.cost);
		
		Keyboard keyboard1=new Keyboard();
		System.out.println("brand:"+keyboard1.brand);
		System.out.println("color:"+keyboard1.color);
		System.out.println("type:"+keyboard1.type);
		
		Keyboard keyboard2=new Keyboard(100);
		System.out.println("noOfKeys:"+keyboard2.noOfKeys);
		
		Keyboard keyboard3=new Keyboard();
		System.out.println("cost:"+keyboard3.cost);
		
		Keyboard keyboard4=new Keyboard(50,89.90);
		System.out.println("noOfKeys:"+keyboard4.noOfKeys);
		System.out.println("cost:"+keyboard4.cost);
		
		
		Keyboard keyboard5=new Keyboard();
		System.out.println("brand:"+keyboard5.brand);
		System.out.println("type:"+keyboard5.type);
		System.out.println("noOfKeys:"+keyboard5.noOfKeys);
		System.out.println("cost:"+keyboard5.cost);

		System.out.println("ending of keyboard");
		System.out.println("--------------------------------");
		
		System.out.println("starting of matchbox");
		MatchBox matchbox=new MatchBox();
		System.out.println("matchbox brand:"+matchbox.brand);
		System.out.println("matchbox noOStick:"+matchbox.noOfStick);
		System.out.println("matchbox length:"+matchbox.length);
		System.out.println("matchbox price:"+matchbox.price);
		System.out.println("matchbox size:"+matchbox.size);
		System.out.println("matchbox weight:"+matchbox.weight);
		System.out.println("matchbox type:"+matchbox.type);
		
		MatchBox matchbox1=new MatchBox("deepam","rose");
		System.out.println("matchbox brand:"+matchbox1.brand);
		System.out.println("matchbox type:"+matchbox1.type);
		
		MatchBox matchbox2=new MatchBox();
		System.out.println("matchbox length:"+matchbox2.length);
		System.out.println("matchbox price:"+matchbox2.price);
		System.out.println("matchbox weight:"+matchbox2.weight);
		
		MatchBox matchbox3=new MatchBox();
		System.out.println("matchbox noOStick:"+matchbox3.noOfStick);
		System.out.println("matchbox size:"+matchbox3.size);
		
		MatchBox matchbox4=new MatchBox();
		System.out.println("matchbox type:"+matchbox4.type);
		System.out.println("matchbox noOStick:"+matchbox4.noOfStick);
		System.out.println("matchbox price:"+matchbox4.price);
		System.out.println("matchbox size:"+matchbox4.size);
		
		MatchBox matchbox5=new MatchBox();
		System.out.println("matchbox size:"+matchbox5.size);
		System.out.println("matchbox weight:"+matchbox5.weight);
		System.out.println("matchbox length:"+matchbox5.length);
		
		MatchBox matchbox6=new MatchBox();
		System.out.println("matchbox brand:"+matchbox6.brand);
		System.out.println("matchbox noOStick:"+matchbox6.noOfStick);
		System.out.println("matchbox type:"+matchbox6.type);
		System.out.println("ending of matchbox");
		System.out.println("--------------------------------");
		System.out.println("starting of showrroom");
		Showroom showroom=new Showroom();
		System.out.println("showroom name:"+showroom.name);
		System.out.println("showroom address:"+showroom.address);
		System.out.println("showroom type:"+showroom.type);
		System.out.println("showroom pincode:"+showroom.pincode);
		System.out.println("showroom availability:"+showroom.availability);
		System.out.println("showroom floors:"+showroom.floors);
		System.out.println("showroom rent:"+showroom.rent);
		System.out.println("showroom spaceInm:"+showroom.spaceInm);
		
		Showroom showroom1=new Showroom("honda","bnglr","car");
		System.out.println("showroom name:"+showroom1.name);
		System.out.println("showroom address:"+showroom1.address);
		System.out.println("showroom type:"+showroom1.type);
		
		Showroom showroom2=new Showroom();
		System.out.println("showroom rent:"+showroom2.rent);
		System.out.println("showroom spaceInm:"+showroom2.spaceInm);
		
		Showroom showroom3=new Showroom();
		System.out.println("showroom pincode:"+showroom3.pincode);
		System.out.println("showroom floors:"+showroom3.floors);
		System.out.println("showroom availability:"+showroom3.availability);
		
			
		Showroom showroom4=new Showroom();
		System.out.println("showroom type:"+showroom4.type);
		System.out.println("showroom floors:"+showroom4.floors);
		System.out.println("showroom spaceInm:"+showroom4.spaceInm);
		System.out.println("showroom availability:"+showroom4.availability);
		
		
		Showroom showroom5=new Showroom();
		System.out.println("showroom rent:"+showroom5.rent);
		System.out.println("showroom address:"+showroom5.address);
		System.out.println("showroom pincode:"+showroom5.pincode);
		
		
		Showroom showroom6=new Showroom();
		System.out.println("showroom floors:"+showroom6.floors);
		System.out.println("showroom name:"+showroom6.name);
		System.out.println("showroom availability:"+showroom6.availability);
		System.out.println("showroom spaceInm:"+showroom6.spaceInm);
		
		
		Showroom showroom7=new Showroom();
		System.out.println("showroom pincode:"+showroom7.pincode);
		System.out.println("showroom floors:"+showroom7.floors);
		System.out.println("showroom availability:"+showroom7.availability);
		System.out.println("showroom rent:"+showroom7.rent);
		System.out.println("showroom type:"+showroom7.type);
		
		System.out.println("ending of showroom");
		
		
		System.out.println("ending of kmsexmp");
		
	}

}