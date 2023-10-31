class Clock
{
	String type="roman";
	int numbers=12;
	double price;
	String size;
	
	Clock()
	{
		
		this(800.9,"m","num");
		
	}
	Clock(String type,String size)
	{
		this.type=type;
		this.size=size;
		System.out.println("type & size:"+type+","+size);
		
	}
	Clock(int numbers,double price)
	{
		this.numbers=numbers;
		this.price=price;
		System.out.println("number & price:"+numbers+","+price);
		
	}
	Clock(String type,int numbers,double price)
	{
		this.type=type;
		this.numbers=numbers;
		this.price=price;
		System.out.println("type,numbers & price:"+type+","+numbers+","+price);
	}
	Clock(double price,String size,String type)
	{
		this.price=price;
		this.size=size;
		this.type=type;
		System.out.println("price,size & type:"+price+","+size+","+type);
	}
	

}