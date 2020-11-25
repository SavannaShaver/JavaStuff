/*
 * Written By Savanna Shaver
 */
public class Rectangle extends Shape {
	double length,width;
	public Rectangle()
	{
		type = "Rectangle";
		length = width = 0;
	}
	public Rectangle(double aL, double aW)
	{
		type = "Rectangle";
		length = aL;
		width = aW;
	}
	public void findArea()
	{
		area = length * width;
	}
	
	@Override
	public String toString()
	{
		return this.type + " Side 1: " + this.length + " Side 2 :"+ this.width+ " Area: " + this.area;
	}

}
