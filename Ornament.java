class Ornament
{
    String type;
	String color;
	int designs;
	double cost;
	boolean availability;
	
	Ornament()
	{
		this(false,"bangles","green");
		System.out.println("ornaments....");
	}
	Ornament(String color,int designs,double cost)
	{
		this.color=color;
		this.designs=designs;
		this.cost=cost;
		System.out.println("color,designs & cost:"+color+","+designs+","+cost);
	}
	Ornament(int designs,double cost)
	{
		this.designs=designs;
		this.cost=cost;
		System.out.println("designs & cost:"+designs+","+cost);
	}
	Ornament(boolean availability, String type,String color)
	{
		this.availability=availability;
		this.type=type;
		this.color=color;
		System.out.println("availability,type & color:"+availability+","+type+","+color);
	}
	Ornament(double cost,int designs,boolean availability)
	{
		this.cost=cost;
		this.designs=designs;
		this.availability=availability;
		System.out.println("cost,designs & availability:"+cost+","+designs+","+availability);
	}
}