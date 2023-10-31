class MakeupKit
{
	String shape="round";
	String type="liquid";
	int noOfitems;
	double weight=90.00;
	
	MakeupKit()
	{
		this("sqyare",12,50.00);
		System.out.println("makeupkit....");
	}
	
	MakeupKit(String shape,String type)
	{
		this.shape=shape;
		this.type=type;
		System.out.println("shape & type:"+shape+","+type);
	}
	MakeupKit(int noOfitems,double weight)
	{
		this.noOfitems=noOfitems;
		this.weight=weight;
		System.out.println("noOfitems & weight:"+noOfitems+","+weight);		
	}
	MakeupKit(String shape,int noOfitems,double weight)
	{
		this.shape=shape;
		this.noOfitems=noOfitems;
		this.weight=weight;
		System.out.println("shape,noOfitems & weight:"+shape+","+noOfitems+","+weight);
	}
	MakeupKit(int noOfitems,double weight,String type)
	{
		this.noOfitems=noOfitems;
		this.weight=weight;
		this.type=type;
		System.out.println("noOfitems,weight & type:"+noOfitems+","+weight+","+type);
	
	}
}