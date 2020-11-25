/*
 * Written by Savanna Shaver
 */
public class Diamond extends ShapeBasics implements DiamondInterface {
	private int width;
	public Diamond()
	{
		super();
		this.width = 1;
	}
	public Diamond(int anO, int aW)
	{
		super(anO);
		this.setWidth(aW);
	}
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
	public static void skipSpaces(int spaces)
	{
		for(int i =0; i<spaces; i++)
		{
			System.out.print(" ");
		}
	}
	private void drawTopV()
	{
		skipSpaces(super.getOffset());
		int stop = this.width/2;
		skipSpaces(stop);
		System.out.print("*");
		
		int innerSpaces = 1;
		int outerSpaces = stop-1;
		for( int i=0; i< stop; i++ )
		{
			skipSpaces(super.getOffset());
			skipSpaces(outerSpaces);
			System.out.print("*");
			skipSpaces(innerSpaces);
			System.out.print("*");
			outerSpaces --;
			innerSpaces +=2;
			
		}
		
		
	}
	private void drawBottomV()
	{
		int stop = this.width/2;
		int innerSpaces = this.width -4;
		int outerSpaces = 1;
		for(int i=0; i<stop-1; i++)
		{
			skipSpaces(super.getOffset());
			skipSpaces(outerSpaces);
			System.out.print("*");
			skipSpaces(innerSpaces);
			System.out.print("*");
			outerSpaces ++;
			innerSpaces -=2;
		}
		skipSpaces(super.getOffset());
		skipSpaces(stop);
		System.out.print("*");
		
	}
	public void drawHere()
	{
		this.drawTopV();
		this.drawBottomV();
	}
}
