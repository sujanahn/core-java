class Rocket
{
	String country="usa";
	char size;
	double length=190.00;
	boolean lanch;
	
	Rocket()
	{
		this("india",'M',2000.0,true);
		System.out.println("rocket....");
	}
	Rocket(String Country,char size,double length,boolean lanch)
	{
		this.country=country;
		this.size=size;
		this.length=length;
		this.lanch=lanch;
		System.out.println("country,size,length&lanch:"+country+","+size+","+length+","+lanch);
	}
	Rocket(char size,double length,boolean lanch)
	{
		this.size=size;
		this.length=length;
		this.lanch=lanch;
		System.out.println("size,length&lanch:"+size+","+length+","+lanch);
	}
	Rocket(String Country,char size,boolean lanch)
	{
		this.country=country;
		this.size=size;
		this.lanch=lanch;
		System.out.println("country,size,&lanch:"+country+","+size+","+lanch);
	}
	Rocket(String Country,char size)
	{
		this.country=country;
		this.size=size;
		System.out.println("country,size,&lanch:"+country+","+size);
	}
}