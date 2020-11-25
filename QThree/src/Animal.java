/*
 * CSCE 145 Exam02 Question03
 * Provided code
 * Do not alter
 */
public class Animal 
{
	private String type;
	private double age;
	
	public Animal(String aT, double anA)
	{
		this.type = aT;
		if(anA >= 0)
		{
			this.age = anA;
		}
	}
	public String getType()
	{
		return this.type;
	}
	public double getAge()
	{
		return this.age;
	}
}