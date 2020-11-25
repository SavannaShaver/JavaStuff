/*
 * Written by Savanna Shaver
 */
public class ExponentialLine implements Line {
	private double exponent;
	public ExponentialLine()
	{
		this.exponent = 0.0;
	}
	public ExponentialLine(double anE)
	{
		this.setExponent(anE);
	}
	public double getExponent()
	{
		return this.exponent;
	}
	public void setExponent(double anE)
	{
		this.exponent = anE;
	}
	public double getYPoint(double x)
	{
		return Math.pow(x, this.exponent);
	}

}
