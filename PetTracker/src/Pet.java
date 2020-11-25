/* 
 * Written by Savanna Shaver 
 */
public class Pet {

	private String name; 
	private double weight;
	//PetType Enumeration
	private PetType type;
	public Pet()
	{
		this.name = "none";
		this.weight = 0.0;
		this.type = PetType.abomination;
	}
	public Pet(String aN,double aW, PetType aT)
	{
		this.setName(aN);
		this.setWeight(aW);
		this.setType(aT);
	}
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public PetType getType()
	{
		return this.type;
	}

	// mutator
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN; 
		}
		else
		{
			this.name = "none";
		}
	}
	public void setWeight(double aW)
	{
		if(aW >= 0.0)
		{
			this.weight = aW; 
		}
		else 
		{
			this.weight = 0.0; 
		}
	}	
	public void setType(PetType aT)
	{
		this.type = aT;
	}
	public String toString()
	{
		return "Name: "+ this.name+" Weight: "+this.weight+" Pet Type: "+this.type;
	}
	public boolean equals(Pet aP)
	{
		return aP != null && 
				this.name.equals(aP.getName()) &&
				this.weight == aP.getWeight() &&
				this.type == aP.getType();
	}
	public static Pet createPet(PetType aT)
	{
		Pet ret = new Pet();
		ret.setType(aT);
		return ret;
	}
	public static Pet splice(Pet pet01, Pet pet02)
	{
		if(pet01 == null || pet02 == null)
		return null; 
		else
		{
		System.out.println("You are creating a "+ pet01.getType()+" + " +pet02.getType());
		Pet pet = new Pet();
		pet.setType(PetType.abomination);
		return pet;
		}
	}
	
}
