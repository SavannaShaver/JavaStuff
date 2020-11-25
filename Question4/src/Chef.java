/*
 * CSCE 145 Exam02 Question04
 * Provided code
 */
public class Chef extends Person //Don't forget to put something here
{
	//Do not alter-----------------------
	private String restaurantName;
	private String signatureDish;
	public String getRestaurantName() 
	{
		return restaurantName;
	}
	public String getSignatureDish() 
	{
		return signatureDish;
	}
	//------------------------------------
	//Put Constructors and toString method here
	public Chef()
	{
		super();
		this.restaurantName = "none";
		this.signatureDish = "none";
	}
	public Chef(String aN,String aR,String aD)
	{
		super(aN);
		this.setRestaurant(aR);
		this.setDish(aD);
	}
	public String getRestaurant()
	{
		return this.restaurantName;
	}
	public String getDish()
	{
		return this.signatureDish;
	}
	public void setRestaurant(String aR)
	{
		if(aR == null)
		{
			this.restaurantName = "none";
		}
		else
		{
			this.restaurantName = aR;
		}
	}
	public void setDish(String aD)
	{
		if(aD == null)
		{
			this.signatureDish = "none";
		}
		else
		{
			this.signatureDish = aD;
		}
	}
	public String toString()
	{
		return super.toString()+" Restaurant Name:"
	+ this.restaurantName+" Signature Dish:"
	+ this.signatureDish ;  
	}
	
	/*
	 * Created by Savanna Shaver
	 */
}
