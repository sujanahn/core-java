class Keyboard{
	String brand;
	String color="black";
	int noOfKeys;
	String type="wired";
	double cost=2000.9;
	
	Keyboard()
	{
		System.out.println("keyboard created....");
		
	}
	Keyboard(String brand,String Color,String type)
	{
		this.brand=brand;
		this.color=color;
		this.type=type;
		System.out.println("keyboard brand:"+brand);
		System.out.println("keyboard color:"+color);
		System.out.println("keyboard type:"+type);
		
	}
	Keyboard(int noOfKeys)
	{
		this.noOfKeys=noOfKeys;
		System.out.println("keyboard noOfKeys:"+noOfKeys);
	}
	Keyboard(double cost)
	{
		this.cost=cost;
		System.out.println("keyboard cost:"+cost);
		
	}
	Keyboard(double cost,int noOfKeys,String brand,String type)
	{
		this.noOfKeys=noOfKeys;
		this.cost=cost;
		this.brand=brand;
		this.type=type;
		System.out.println("keyboard noOfKeys:"+noOfKeys);
		System.out.println("keyboard cost:"+cost);
		System.out.println("keyboard brand:"+brand);
		System.out.println("keyboard type:"+type);
	}
	Keyboard(int noOfKeys,double cost)
	{
		this.noOfKeys=noOfKeys;
		this.cost=cost;
		System.out.println("keyboard noOfKeys:"+noOfKeys);
		System.out.println("keyboard cost:"+cost);
	}



}