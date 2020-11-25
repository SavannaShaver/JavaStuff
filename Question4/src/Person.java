/*
 * CSCE 145 Exam02 Question04
 * Provided code
 * Do not alter
 */
public class Person {
	private String name;
	public Person()
	{
		this.name = "none";
	}
	public Person(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public String getName()
	{
		return this.name;
	}
	public String toString()
	{
		return "Name: "+this.name;
	}
}

