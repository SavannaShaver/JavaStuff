/*
 * Written by Savanna Shaver
 */
public class SawLine implements Line {
	private double modValue;
	public SawLine()
	{
		this.modValue = 1.0;
	}
	public SawLine(double aM)
	{
		this.setModValue(aM);
	}
	public double getModValue()
	{
		return this.modValue;
	}
	public void setModValue(double aM)
	{
		if(aM == 0.0)
		{
			this.modValue = 1.0;
		}
		else
		{
			this.modValue = aM;
		}
	}
	public double getYPoint(double x)
	{
		return x % this.modValue;
	}
}
