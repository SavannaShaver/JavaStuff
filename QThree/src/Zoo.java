/*
 * CSCE 145 Exam02 Question03
 * Provided code
 */
//Do not alter----------------------------------
public class Zoo {
	private Animal[] animals;
	public void setAnimals(Animal[] a)
	{
		this.animals = a;
	}
	
	
	public double getAverageAge(String aType)
	{ 
//-----------------------------------------------
		//Write your code here
		
		double avgAge = 0.0;
		double result = 0.0;
		
		int count = 0;
		
		for(int i=0; i<animals.length; i++)
		{
			if(aType != null && animals[i] != null)//Checking input variable is not empty, and that the array at each element is not null
			{
				
				if(aType == animals[i].getType() )
				{
					
					result+=animals[i].getAge(); //adds the age to the result each time a match is found
					
					count ++ ; // increase only if the aType and getType() value are equal
 					
				
				}
			}
		}
			
		 if(count==0)
			{
				return avgAge = 0.0; // if this is returned than we found no match
			}
		 else // if the count is > 0 then we found a match somewhere and this will give us the avg. 
		 { 
		        avgAge = result/count;
		        return avgAge;
		 }
		
		}	
		
		
	}

