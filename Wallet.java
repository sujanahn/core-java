class Wallet
{
	double weight;
	String variety;
	int noOfCompartments=15;
	boolean photocase;
	
	Wallet()
	{
		this(20,false,"leather",60.00);
		System.out.println("wallet....");

	}
	Wallet(double weight,int noOfCompartments)
	{
		this.weight=weight;
		this.noOfCompartments=noOfCompartments;
		System.out.println("weight & noo of compartments:"+weight+","+noOfCompartments);
	}
	Wallet(String variety,boolean photocase,double weight)
	{
		this.variety=variety;
		this.photocase=photocase;
		this.weight=weight;
		System.out.println("variety,photocase&weight:"+variety+","+photocase+","+weight);
	}
	Wallet(int noOfCompartments,boolean photocase,String variety,double weight)
	{
		this.noOfCompartments=noOfCompartments;
		this.photocase=photocase;
		this.variety=variety;
		this.weight=weight;
		System.out.println("noOfCompartments,photocase,variety&weight:"+noOfCompartments+","+photocase+","+variety+","+weight);
		
	}
	Wallet(boolean photocase,double weight)
	{
		this.photocase=photocase;
		this.weight=weight;
		System.out.println("photocase&weight:"+photocase+","+weight);
	}
}