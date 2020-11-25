/*
 * Written by Savanna Shaver
 */
public class StaircaseLine implements Line {
	private double width;
	private double height;
	public StaircaseLine()
	{
		this.width = this.height = 1.0;
	}
	public StaircaseLine (double aW,double aH)
	{
		this.setWidth(aW);
		this.setHeight(aH);
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setWidth(double aW)
	{
		if(aW == 0.0)
		{
			this.width = 1.0;
		}
		else
		{
			this.width = aW;
		}
	}
	public void setHeight(double aH)
	{
		if(aH == 0.0)
		{
			this.height = 1.0;
		}
		else
		{
			this.height = aH;
		}
	}
	public double getYPoint(double x)
	{
		return((int)(x/this.width)* this.height);
	}
}
