/*
 * Written By Savanna Shaver
 */
public class Shape implements Comparable<Shape>{
	
	private int area;
	private String type;
	public Shape()
	{
		this.area = 0 ;
		this.type = "none";
	}
	public Shape(int aA,String aT)
	{
		this.setArea(aA);
		this.setType(aT);
		
	}
	public double getArea()
	{
		return this.area;
	}
	public String getType()
	{
		return this.type;
	}
	public void setArea(int aA)
	{
		if(aA>0.0)
			this.area = aA;
		else
			this.area = 0;
	}
	public void setType(String aT)
	{
		if(aT !=null && (aT.equalsIgnoreCase("rectangle") ||aT.equalsIgnoreCase("circle")|| aT.equalsIgnoreCase("right triangle")))
		{
		 this.type = aT;
		}
		else
			this.type = "none";		

	}
	public String toString()
	{
		return this.type + " " + this.area;
	}
	public int compareTo(Shape aShape)
	{
		if(aShape == null)
			return -1;
		if(this.area < aShape.getArea())
			return -1;
		else if(this.area > aShape.getArea())
			return 1;
		else
			return this.type.compareTo(aShape.getType()); // compares letters not nums
			
	}

}
