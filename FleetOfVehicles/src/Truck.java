/*
 * Written by Savanna Shaver
 */
public class Truck extends Vehicle{
	private double loadC;
	private double towingC;
	public Truck()
	{
		super(); //Def const Vehicle
		this.loadC = 0.0;
		this.towingC = 0.0;
		
	}
	public Truck(String aM, int aC, String aO, double aL, double aT)
	{
		super(aM,aC,aO);
		this.setLoadCapacity(aL);
		this.setTowingCapacity(aT);
	}
	public double getLoadCapacity()
	{
		return this.loadC;
	}
	public double getTowingCapacity()
	{
		return this.towingC;
	}
	public void setLoadCapacity(double aL)
	{
		if(aL < 0.0)
		{
			this.loadC = 0.0;
		}
		else
		{
			this.loadC = aL;
		}
	}
	public void setTowingCapacity(double aT)
	{
		if(aT < 0.0)
		{
			this.towingC = 0.0;
		}
		else
		{
			this.towingC = aT;
		}
	}
	public String toString()
	{
		return super.toString()+ "\nTowing Capacity: "+this.towingC+ 
				"\nLoad Capacity: "+this.loadC;
	}
	public boolean equals(Truck aT)
	{
		return aT != null && 
				super.equals(aT) &&
				this.loadC == aT.getLoadCapacity() &&
				this.towingC == aT.getTowingCapacity();
	}
	

}
