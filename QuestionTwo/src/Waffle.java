/*
 * Written by Savanna Shaver
 */
public class Waffle {
	private String type;
	private int numOfPockets;
public Waffle()
{
	this.type = "Belgian";
	this.numOfPockets = 1;
}
public Waffle(String aT, int aNumOfPockets)
{
	this.setType(aT);
	this.setPockets(aNumOfPockets);
	
}
public String getType()
{
 return this.type;
}
public int getPockets()
{
 return this.numOfPockets;
}
public void setType(String aT)
{
 if(aT == null)
 {
	 this.type = "Belgian"; 
 }
 else
 {
	 this.type = aT;
 }
}

public void setPockets(int aNumOfPockets)
{
	if(aNumOfPockets <= 0)
	{
		this.numOfPockets = 1;
	}
	else
	{
		this.numOfPockets = aNumOfPockets;
	}
}
public String toString()
{
	return "Type: " + this.type+" Pockets:"+ this.numOfPockets;  
}
public boolean equals(Waffle aWaffle)
{
	return aWaffle!= null &&
			this.type.contentEquals(aWaffle.getType())&& 
			this.numOfPockets == aWaffle.getPockets();
}
	
public boolean hasMorePockets(Waffle aWaffle) 
{
	if(aWaffle == null || this.numOfPockets > aWaffle.getPockets() )
	{
		return true;
	}
	else
	{
		return false;
	}
}

public static  Waffle cloneWaffle(Waffle w)
{
	
	return new Waffle(w.getType(),w.getPockets());
	

}
}