/*
 * CSCE 146 Exam02 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 */
//Do not alter-----------------------------------------------------------------------
public class Waffle 
{
	private int pockets;
	public Waffle(int aP)
	{
		this.setPockets(aP);
	}
	public int getPockets() 
	{
		return pockets;
	}
	public void setPockets(int pockets) 
	{
		if(pockets >= 1)
			this.pockets = pockets;
		else
			this.pockets = 1;
	}
	public String toString()
	{
		return "Waffle with "+this.pockets+" pockets";
	}
}
//-----------------------------------------------------------------------------------	