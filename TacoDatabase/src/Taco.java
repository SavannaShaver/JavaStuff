
public class Taco {
  private String name; 
  private String location;
  private double price;
  
  public Taco()
  {
	  this.name = this.location = "none";
	  this.price = 0.0;
  }
  public Taco(String aName, String aLocation, double aPrice) // the point of this is to set the variables for a bunch of items 
  {
	  this.setName(aName);
	  this.setLocation(aLocation);// these essential check for errors in your data sometimes
	  this.setPrice(aPrice);
  }
  public String getName()
  {
	  return this.name;
  }
  public String getLocation()
  {
	  return this.location;
  }
  public double getPrice()
  {
	  return this.price;
  }
  public void setName(String aName) // void means doesnt have to reutrn anything 
  {
	  if(aName != null)
		  this.name = aName;
	  else
		  this.name = "none";
  }
  public void setLocation(String aLocation) // checking to make sure a location is returned even if it is null
  {
	  if(aLocation != null)
		  this.location = aLocation;
	  else
		  this.location = "none";
  }
  public void setPrice(double aPrice) // checking to make sure a location is returned even if it is null
  {
	  if(aPrice >= 0.0)
		  this.price = aPrice;
	  else
		  this.price = 0.0;
  }
  public String toString()
  {
	  return " Name: "+ this.name + "Location: "+ this.location + " Price: $" + this.price;
  }
  public boolean equals(Taco aTaco)
  {
	  return aTaco != null && 
			  this.name.equals(aTaco.getName()) && 
			  this.location.contentEquals(aTaco.getLocation()) &&
			  this.price == aTaco.getPrice();
  }
}
