class Over
{
	public static void main(String[] args)
	{
		System.out.println("starting of over");
		System.out.println("***************************************");
		System.out.println("starting of clock");
		Clock clock=new Clock();
		System.out.println("clock type is:"+clock.type);
		System.out.println("clock number is:"+clock.numbers);
		System.out.println("clock price is:"+clock.price);
		System.out.println("clock size is:"+clock.size);
		
		Clock clock1=new Clock("xyz","s");
		System.out.println("clock1 type is:"+clock1.type);
		System.out.println("clock1 number is:"+clock1.numbers);
		System.out.println("clock1 price is:"+clock1.price);
		System.out.println("clock1 size is:"+clock1.size);
		
		Clock clock2=new Clock(6,1000.00);
		System.out.println("clock2 type is:"+clock2.type);
		System.out.println("clock2 number is:"+clock2.numbers);
		System.out.println("clock2 price is:"+clock2.price);
		System.out.println("clock2 size is:"+clock2.size);
		
		Clock clock3=new Clock();
		System.out.println("clock3 type is:"+clock3.type);
		System.out.println("clock3 number is:"+clock3.numbers);
		System.out.println("clock3 price is:"+clock3.price);
		System.out.println("clock3 size is:"+clock3.size);
		
		Clock clock4=new Clock();
		System.out.println("clock4 type is:"+clock4.type);
		System.out.println("clock4 number is:"+clock4.numbers);
		System.out.println("clock4 price is:"+clock4.price);
		System.out.println("clock4 size is:"+clock4.size);
		System.out.println("ending of clock");
		System.out.println("***************************************");
		System.out.println("starting of Rocket");
		
		Rocket rocket=new Rocket();
		System.out.println("rocket country is:"+rocket.country);
		System.out.println("rocket size is:"+rocket.size);
		System.out.println("rocket length is:"+rocket.length);
		System.out.println("rocket lanch is:"+rocket.lanch);
		
		Rocket rocket1=new Rocket();
		System.out.println("rocket1 country is:"+rocket1.country);
		System.out.println("rocket1 size is:"+rocket1.size);
		System.out.println("rocket1 length is:"+rocket1.length);
		System.out.println("rocket1 lanch is:"+rocket1.lanch);
		
		Rocket rocket2=new Rocket("china",'l',false);
		System.out.println("rocket2 country is:"+rocket2.country);
		System.out.println("rocket2 size is:"+rocket2.size);
		System.out.println("rocket2 length is:"+rocket2.length);
		System.out.println("rocket2 lanch is:"+rocket2.lanch);
		
		Rocket rocket3=new Rocket();
		System.out.println("rocket3 country is:"+rocket3.country);
		System.out.println("rocket3 size is:"+rocket3.size);
		System.out.println("rocket3 length is:"+rocket3.length);
		System.out.println("rocket3 lanch is:"+rocket3.lanch);
		
		Rocket rocket4=new Rocket();
		System.out.println("rocket4 country is:"+rocket4.country);
		System.out.println("rocket4 size is:"+rocket4.size);
		System.out.println("rocket4 length is:"+rocket4.length);
		System.out.println("rocket4 lanch is:"+rocket4.lanch);
		
		System.out.println("***************************************");
		System.out.println("starting of makeupkit");
		MakeupKit makeupkit=new MakeupKit();
		System.out.println("Makeupkit shape:"+makeupkit.shape);
		System.out.println("Makeupkit type:"+makeupkit.type);
		System.out.println("Makeupkit noOfitems:"+makeupkit.noOfitems);
		System.out.println("Makeupkit weight:"+makeupkit.weight);
		
		MakeupKit makeupkit1=new MakeupKit();
		System.out.println("Makeupkit1 shape:"+makeupkit1.shape);
		System.out.println("Makeupkit1 type:"+makeupkit1.type);
		System.out.println("Makeupkit1 noOfitems:"+makeupkit1.noOfitems);
		System.out.println("Makeupkit1 weight:"+makeupkit1.weight);
		
		MakeupKit makeupkit2=new MakeupKit();
		System.out.println("Makeupkit2 shape:"+makeupkit2.shape);
		System.out.println("Makeupkit2 type:"+makeupkit2.type);
		System.out.println("Makeupkit2 noOfitems:"+makeupkit2.noOfitems);
		System.out.println("Makeupkit2 weight:"+makeupkit2.weight);
		MakeupKit makeupkit3=new MakeupKit();
		System.out.println("Makeupkit shape:"+makeupkit3.shape);
		System.out.println("Makeupkit type:"+makeupkit3.type);
		System.out.println("Makeupkit noOfitems:"+makeupkit3.noOfitems);
		System.out.println("Makeupkit weight:"+makeupkit3.weight);
		
		MakeupKit makeupkit4=new MakeupKit();
		System.out.println("Makeupkit shape:"+makeupkit4.shape);
		System.out.println("Makeupkit type:"+makeupkit4.type);
		System.out.println("Makeupkit noOfitems:"+makeupkit4.noOfitems);
		System.out.println("Makeupkit weight:"+makeupkit4.weight);
		System.out.println("ending of makeupkit");
		System.out.println("***************************************");
		System.out.println("starting of Wallet");
		
		Wallet wallet=new Wallet();
		System.out.println("wallet weight:"+wallet.weight);
		System.out.println("wallet verity:"+wallet.variety);
		System.out.println("wallet noOfCompartments:"+wallet.noOfCompartments);
		System.out.println("wallet photocase:"+wallet.photocase);
		
		Wallet wallet1=new Wallet();
		System.out.println("wallet1 weight:"+wallet1.weight);
		System.out.println("wallet1 verity:"+wallet1.variety);
		System.out.println("wallet1 noOfCompartments:"+wallet1.noOfCompartments);
		System.out.println("wallet1 photocase:"+wallet1.photocase);
		
		Wallet wallet2=new Wallet();
		System.out.println("wallet2 weight:"+wallet2.weight);
		System.out.println("wallet2 verity:"+wallet2.variety);
		System.out.println("wallet2 noOfCompartments:"+wallet2.noOfCompartments);
		System.out.println("wallet2 photocase:"+wallet2.photocase);
		
		Wallet wallet3=new Wallet();
		System.out.println("wallet3 weight:"+wallet3.weight);
		System.out.println("wallet3 verity:"+wallet3.variety);
		System.out.println("wallet3 noOfCompartments:"+wallet3.noOfCompartments);
		System.out.println("wallet3 photocase:"+wallet3.photocase);
		
		Wallet wallet4=new Wallet();
		System.out.println("wallet weight:"+wallet4.weight);
		System.out.println("wallet verity:"+wallet4.variety);
		System.out.println("wallet noOfCompartments:"+wallet4.noOfCompartments);
		System.out.println("wallet photocase:"+wallet4.photocase);
		System.out.println("ending of Wallet");
		System.out.println("***************************************");
		System.out.println("starting of Ornament");
		
		Ornament ornament=new Ornament();
		System.out.println("ornament type:"+ornament.type);
		System.out.println("ornament colors:"+ornament.color);
		System.out.println("ornament designs:"+ornament.designs);
		System.out.println("ornament cost:"+ornament.cost);
		System.out.println("ornament availability:"+ornament.availability);
		
		Ornament ornament1=new Ornament();
		System.out.println("ornament1 type:"+ornament1.type);
		System.out.println("ornament1 colors:"+ornament1.color);
		System.out.println("ornament1 designs:"+ornament1.designs);
		System.out.println("ornament1 cost:"+ornament1.cost);
		System.out.println("ornament1 availability:"+ornament.availability);
		
		
		Ornament ornament2=new Ornament();
		System.out.println("ornament2 type:"+ornament2.type);
		System.out.println("ornament2 colors:"+ornament2.color);
		System.out.println("ornament2 designs:"+ornament2.designs);
		System.out.println("ornament2 cost:"+ornament2.cost);
		System.out.println("ornament2 availability:"+ornament2.availability);
		
		Ornament ornament3=new Ornament();
		System.out.println("ornament3 type:"+ornament3.type);
		System.out.println("ornament3 colors:"+ornament3.color);
		System.out.println("ornament3 designs:"+ornament3.designs);
		System.out.println("ornament3 cost:"+ornament3.cost);
		System.out.println("ornament3 availability:"+ornament3.availability);
		
		Ornament ornament4=new Ornament(500.00,32,true);
		System.out.println("ornament4 type:"+ornament4.type);
		System.out.println("ornament4 colors:"+ornament4.color);
		System.out.println("ornament4 designs:"+ornament4.designs);
		System.out.println("ornament4 cost:"+ornament4.cost);
		System.out.println("ornament availability:"+ornament.availability);
		System.out.println("ending of Ornament");
		System.out.println("***************************************");
		System.out.println("starting of over");
		
		
		
	}
	

}