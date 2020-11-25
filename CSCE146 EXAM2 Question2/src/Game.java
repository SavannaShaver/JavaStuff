/*
 * CSCE 146 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 */
//Do not alter-----------------------------------------------------------------------
public class Game implements Comparable<Game>
{
	private double price;
	public Game(double aP)
	{
		this.setPrice(aP);
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		if(price >= 0.0)
			this.price = price;
		else
			this.price = 0.0;
	}
	public String toString()
	{
		return "Game $"+this.price;
	}
	public int compareTo(Game g)
	{
		if(g == null)
			return 1;
		else if(this.price > g.getPrice())
			return 1;
		else if(this.price < g.getPrice())
			return -1;
		else
			return 0;
	}
}
//-----------------------------------------------------------------------------------

