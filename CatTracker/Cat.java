//Step 1. Define the class
public class Cat {
 // step 2. Create Instance Variables
	private String name;
	private double weight;
	private int numberOfLegs;
	//Step 3. Create Constructors 
	public Cat()// Default Constructor
	 {
		this.name = "none";
		this.weight = 1.0;
		this.numberOfLegs = 4; 
	 }
	public Cat(String aName, double aW, int aN)
	{
		this.setName(aName);
		this.setWeight(aW);
		this.setNumberOfLegs(aN);
		
	}
	//Step 4.Create accessors for each instance
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight; 
	}
	public int getNumberOfLegs()
	{
		return this.numberOfLegs; 
	}
	//Step 5. Create mutators for each instance
	public void setName(String aName)
	{
		if(aName == null)
		{
			this.name = "none";
		}
		else
		{
			this.name =aName;
		}
	}
	public void setWeight(double aWeight)
	{
		if(aWeight <=0.0)
		{
			aWeight = 10.0;
		}
		else
		{
			this.weight = aWeight;
		}
	}
	
	public void setNumberOfLegs(int aN)
	{
		if(aN > 4 || aN < 0 )
		{
			this.numberOfLegs = 4; 
		}
		else
		{
			this.numberOfLegs = aN;
		}
	}
	//Step 6. Other useful methods
	public String toString()
	{
		return "Name: " + this.name+" Weight:"+ this.weight+" Number of Legs: "
	+ this.numberOfLegs;  
	}
	public boolean equals(Cat aCat)
	{
		return aCat!= null &&
				this.name.contentEquals(aCat.getName())&& 
				this.weight == aCat.getWeight()&&
				this.numberOfLegs == aCat.getNumberOfLegs();
	}
}
	
