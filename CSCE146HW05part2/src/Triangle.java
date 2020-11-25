/*
 * Written By Savanna Shaver
 */
public class Triangle extends Shape {
	double base,height;
	public Triangle()
	{
		type = "Right Triangle";
		base = height = 0;
	}
	public Triangle(double aB, double aH)
	{
		type = "Right Triangle";
		base = aB;
		height = aH;
	}
	public void findArea()
	{
		area =  (base * height)/2;
	}

	public String toString()
	{
		return this.type + " Side 1: " + this.base + " Side 2 :" + this.height+ " Area: "+ this.area;
	}
}
