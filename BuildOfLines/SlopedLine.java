/*
 * Written by Savanna Shaver
 */
public class SlopedLine implements Line {
	private double slope;
	public SlopedLine()
	{
		this.slope = 0.0;
	}
	public SlopedLine(double aSlope)
	{
		this.setSlope(aSlope);
	}
	public double getSlope()
	{
		return this.slope;
	}
	public void setSlope(double aSlope)
	{
		this.slope = aSlope;
	}
	public double getYPoint(double x)
	{
		return x * this.slope;
	}
}
