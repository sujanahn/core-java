class MatchBox
{
	String brand="cycle";
	int noOfStick=20;
	double length;
	double price=10;
	char size='m';
	double weight;
	String type;
	
	MatchBox()
	{
		System.out.println("matchbox created....");
	}
	MatchBox(String brand,String type)
	{
		this.brand=brand;
		this.type=type;
		System.out.println("brand:"+brand);
		System.out.println("type:"+type);
	}
	MatchBox(double length,double price,double weight)
	{
		this.length=length;
		this.price=price;
		this.weight=weight;
		System.out.println("length:"+length);
		System.out.println("price:"+price);
		System.out.println("weight:"+weight);		
		
	}
	MatchBox(int noOfStick,char size)
	{
		this.noOfStick=noOfStick;
		this.size=size;
		System.out.println("noOfStick:"+noOfStick);
		System.out.println("size:"+size);
	}
	MatchBox(String type,int noOStick,double price,char size)
	{
		this.type=type;
		this.noOfStick=noOfStick;
		this.price=price;
		this.size=size;
		System.out.println("type:"+type);
		System.out.println("noOfStick:"+noOfStick);
		System.out.println("price:"+price);
		System.out.println("size:"+size);
		
	}
	MatchBox(char size,double weight,double length)
	{
		this.size=size;
		this.weight=weight;
		this.length=length;
		System.out.println("size:"+size);
		System.out.println("weight:"+weight);
        System.out.println("length:"+length);		
		
	}
	MatchBox(String brand,int noOfStick,String type)
	{
		this.brand=brand;
		this.noOfStick=noOfStick;
		this.type=type;
		System.out.println("brand:"+brand);
		System.out.println("noOfStick:"+noOfStick);
		System.out.println("type:"+type);
	}
}