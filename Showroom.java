class Showroom
{
	String name;
	String address="davangere";
	String type="bike";
	long pincode;
	boolean availability=true;
	int floors=3;
	double rent;
	double spaceInm=50;
	
	Showroom()
	{
		System.out.println("Showroom created....");
	}
	Showroom(String name,String address,String type)
	{
		this.name=name;
		this.address=address;
		this.type=type;
		System.out.println("name:"+name);
		System.out.println("address:"+address);
		System.out.println("type:"+type);
		
	}
	Showroom(double rent,double spanceInm)
	{
		this.rent=rent;
		this.spaceInm=spaceInm;
		System.out.println("rent:"+rent);
		System.out.println("spaceInm:"+spaceInm);
	}
	Showroom(long pincode,int floors,boolean availability)
	{
		this.pincode=pincode;
		this.floors=floors;
		this.availability=availability;
		System.out.println("pincode:"+pincode);
		System.out.println("floors:"+floors);
		System.out.println("availability:"+availability);
		
	}
	Showroom(String type,int floors,double spaceInm,boolean availability)
	{
		this.type=type;
		this.floors=floors;
		this.spaceInm=spaceInm;
		this.availability=availability;
		System.out.println("type:"+type);
		System.out.println("floors:"+floors);
		System.out.println("spaceInm:"+spaceInm);
		System.out.println("availability:"+availability);
			
	}
	Showroom(double rent,String address,long pincode)
	{
		this.rent=rent;
		this.address=address;
		this.pincode=pincode;
		System.out.println("rent:"+rent);
		System.out.println("address:"+address);
		System.out.println("pincode:"+pincode);
		
	}
	Showroom(int floors,String name,boolean availability,double spaceInm )
	{
		this.floors=floors;
		this.name=name;
		this.availability=availability;
		this.spaceInm=spaceInm;
		System.out.println("floors:"+floors);
		System.out.println("name:"+name);
		System.out.println("availability:"+availability);
		System.out.println("spanceInm:"+spaceInm);
		
	}
	Showroom(long pincode,int floors,boolean availability,double rent,String type)
	{
		this.pincode=pincode;
		this.floors=floors;
		this.availability=availability;
		this.rent=rent;
		this.type=type;
		System.out.println("pincode:"+pincode);
		System.out.println("floors:"+floors);
		System.out.println("availability:"+availability);
		System.out.println("rent:"+rent);
		System.out.println("type:"+type);	
		
	}

}