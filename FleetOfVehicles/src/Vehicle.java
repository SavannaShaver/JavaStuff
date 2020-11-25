/*
 * Written by Savanna Shaver
 */
public class Vehicle {
	private String manName;
	private int numOfC;
	private String owner;
	public Vehicle()
	{
		this.manName = "none";
		this.numOfC = 1;
		this.owner = " none";
	}
	public Vehicle(String aM, int aC, String aO)
	{
		this.setManufacturersName(aM);
		this.setNumberOfCylinders(aC);
		this.setOwner(aO);
		
	}
	public String getManufacturersName()
	{
		return this.manName;
	}
	public int getNumberOfCylinders()
	{
		return this.numOfC;
	}
	public String getOwner()
	{
		return this.owner;
	}
	public void setManufacturersName(String aN)
	{
		if(aN == null)
		{
			this.manName = "none";
			
		}
		else
		{
			this.manName = aN;
		}
	}
	public void setNumberOfCylinders(int aNum)
	{
		if(aNum <= 0)
		{
			this.numOfC = 1;
			
		}
		else
		{
			this.numOfC = aNum;
		}
	}
	public void setOwner(String aO)
	{
		if(aO == null)
		{
			this.owner = "none";
		}
		else
		{
			 this.owner = aO;
		}
	}
	public String toString()
	{
		return "Manufacturer's Name: "+this.manName+ 
				"\nNumber of Cylinders: "+this.numOfC+
				"\nOwner's Name: "+this.owner;
	}
	public boolean equals(Vehicle aV)
	{
		return aV != null && 
				this.manName.equals(aV.getManufacturersName()) &&
				this.numOfC == (aV.getNumberOfCylinders()) &&
				this.owner.contentEquals(aV.getOwner());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
