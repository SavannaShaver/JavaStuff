/*
 * Written by Savanna Shaver
 */
public class Diamond extends ShapeBasics implements DiamondInterface {
 private int width;// instance variables

	//Step 3. Create Constructors 
	public Diamond()// Default Constructor
	 {
		super();// calls shape basics defualt constructor 
		this.width = 1; 
	 }
	public Diamond(int anO,int aW)
	{
		
		super(anO);
		this.setWidth(aW);
		
	}
	//Step 4.Create accessors for each instance
	public int getWidth()
	{
		return this.width;
	}
	
	public void setWidth(int aW)
	{
		if(aW > 0 && aW % 2 == 1)
		{
			this.width = aW;
		}
		else
		{
			this.width = 1;
		}
	}
	
	
	
	public static void skipSpaces(int spaces)//static method, static because it doesnt rely on any instance 
	{
		for(int i=0;i<spaces;i++)
		{
			System.out.print(" ");
		}
			
	}
	
	private void drawTopV()// method defintion // dynamic
	{
		//Drawing the top point
		skipSpaces(super.getOffset());
		int stop = this.width/2;
		//System.out.println(stop);
		skipSpaces(stop);
		System.out.println("*");
		//Draw the rest 
		int innerSpaces = 1;
		int outerSpaces = stop-1;
		for(int i=0;i<stop;i++)
		{
			skipSpaces(super.getOffset());
			skipSpaces(outerSpaces);
			System.out.print("*");
			skipSpaces(innerSpaces);
			System.out.println("*");
			outerSpaces--;
			innerSpaces +=2;
		}
	}
	
	private void drawBottomV()// method defintion // dynamic
	{
	
		int stop = this.width / 2;
		int innerSpaces = this.width - 4;
		int outerSpaces = 1;
		for(int i=0;i<stop-1;i++)
		{
			skipSpaces(super.getOffset());
			skipSpaces(outerSpaces);
			System.out.print("*");
			skipSpaces(innerSpaces);
			System.out.println("*");
			outerSpaces++;
			innerSpaces -= 2;
			
		}
		skipSpaces(super.getOffset());
		skipSpaces(stop);
		System.out.println("*");
		
	}
	
	//write overidden method drawHere
	public void drawHere()
	{
		this.drawTopV();
		this.drawBottomV();
		
	}

	
				
}
