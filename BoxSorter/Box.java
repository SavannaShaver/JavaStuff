/* 
 * Written by Savanna Shaver
 */
public class Box {
	private String label;
	private double length;
	private double width;
	private double height;
	
	public Box()// Default Constructor
	 {
		label = "none";
		length = width = height = 1.0;
		
	 }
	public Box(String aLabel, double aL, double aW,double aH)
	{
		this.setLabel(aLabel);
		this.setLength(aL);
		this.setWidth(aW);
		this.setHeight(aH);
		
	}
	
	public String setLabel()
	{
		return this.label;
	}
	public double setLength()
	{
		return this.length; 
	}
	public double setWidth()
	{
		return this.width; 
	}
	public double setHeight()
	{
		return this.height; 
	}
	
	public void setLabel(String aLabel)
	{
		if(aLabel == null)
		{
			this.label = "none";
		}
		else
		{
			this.label =aLabel;
		}
	}
	
	
	public void setLength(double aL)
	{
		if(aL <= 0.0)
		{
			this.length = 1.0;
		}
		else
		{
			this.length = aL; 
		}
	}
	public void setWidth(double aW)
	{
		if(aW <= 0.0)
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
		if(aH <= 0.0)
		{
			this.height = 1.0;
		}
			
		else
		{
			this.height = aH; 
		}
		
	}
	public double getVolume()
	{
		return this.length*this.width*this.height;
	}
	public String toString()
	{
		return "Label: " +this.label+ " Volume: "+ this.getVolume();
	}
}
	
	

