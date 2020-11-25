/*
 * Written by Savanna Shaver
 */
public class Prize {

	private String name; 
	private int price;
	
	
	
	public Prize(String aN,int aP)
	{
		this.setName(aN);
		this.setPrice(aP);
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getPrice()
	{
		return this.price;
	}
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN; 
		}
		else
		{
			this.name = "none";
		}
	}
	public void setPrice(int aP)
	{
		if(aP >= 0)
		{
			this.price = aP; 
		}
		else 
		{
			this.price = 0; 
		}
	}
		
	public String toString()
	{
		return "Prize: "+ this.name+" Price: "+this.price + "";
	}
}	

	

