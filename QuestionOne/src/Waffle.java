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

//my understanding of the 1st question i'm not suppose to print anything
// you guys will do the printing. I just need to make sure the logic works 
//and that when you try to test it later with 
//print statements it works. 
}
