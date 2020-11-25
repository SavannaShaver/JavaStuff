/*
 * Written By Savanna Shaver
 */
public class Circle extends Shape {
 double radius;
 public Circle()
 {
	 type = "Circle";
	 radius = 0.0;
	 
 }
 public Circle(double aR)
 {
	 type = "Circle";
	 radius = aR;
 }
 public void findArea()
 {
	 area = Math.PI * radius * radius;
 }
 @Override
 public String toString()
	{
		return this.type + " Radius: " + this.radius + " Area :" + this.area;
	}
}
