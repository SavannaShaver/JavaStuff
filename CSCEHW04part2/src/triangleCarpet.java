/*
 * Written by Savanna Shaver
 */
 
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class triangleCarpet extends Canvas {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Applet");
		frame.setSize(700,700);
		triangleCarpet sp = new triangleCarpet(); // i am creating a new instance of the CANVAS drawing thing
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}
	public void paint(Graphics g)// this is a function of canvas
	{
			    
		 //drawCarpet(300,0,0,600,600,600,7,g);
		drawCarpet(300,0,0,600,600,600,7,g);
		 
	}
	public void drawCarpet(int x1,int y1,int x2,int y2, int x3, int y3, int n, Graphics g)
	{

		int xpoints[] = {x1,x2,x3};
	    int ypoints[] = {y1,y2,y3};
	    int npoints = 3;
	    int count = 0 ;
	  
	    
	   // drawCarpet(x1+sub,x2,x3+sub*2,y1,y2+sub*2,y3+sub*2,3, g);
	   
	    //if(n >= 3)
	 //   {
		    //g.fillPolygon(xpoints,ypoints, npoints);
		    if(n == 1) 
		    {
		    	g.setColor(Color.black);
		    	g.fillPolygon(xpoints,ypoints, npoints);
		    	
		    }
		    else
		    {
		    	g.setColor(Color.white);
		    	drawCarpet(x1,y1,(x1+x2)/2,(y1+y2)/2,(x1+x3)/2,(y1+y3)/2,n-1,g);
		    	//System.out.println(""+ x1+ "," + y1 +","+ (x1+x2)/2+","+(y1+y2)/2 +","+(x1+x3)/2+ "," +(y1+y3)/2);
		    	//count++;
		   
		    	g.setColor(Color.blue);
		    	drawCarpet(x2,y2,(x2 + x1)/2,(y2+y1)/2,(x2+x3)/2,(y2+y3)/2, n-1, g);
		    	//System.out.println("------------------------------------");
		    	//System.out.println(x2);
		    	
		    	
		    	g.setColor(Color.red);
		    //	drawCarpet(x3,y3,(x3 + x1)/2,(y3+y1)/2,(x3+x2)/2,(y3+y2)/2, n-1, g);
		    	drawCarpet(x3,y3,(x3 + x2)/2,(y3+y2)/2,(x3+x1)/2,(y3+y1)/2, n-1, g);
		    	
		    	//npoints--;
		    }
		  
	 //   }
	    
	   // drawCarpet(x1,y1,(x1 + x2)/2,(y1+y2)/2,(x1+x3)/2,(y1+y3)/2, 3, g);
		}

		//{
	    	//drawCarpet(x1+sub,x2,x3+sub*2,y1,y2+sub*2,y3+sub*2,3, g);//big middle
	    //	g.setColor(Color.white);
	    	
	    	//drawCarpet(x1+sub,x2+sub/2,x3+sub+sub/2,y1+sub*2,y2+sub,y3+sub,3, g);// white one
	    //	g.setColor(Color.blue);
	    	//TOP
	    	//drawCarpet(x1+sub,x2+sub/2+sub/4,x3+sub+sub/4,y1+sub,y2+sub/2,y3+sub/2,3, g); //middle
	    	//drawCarpet(x1+sub/2+sub/4,x2+sub/2+sub/8,x3+sub/2+sub/4+sub/8,y1+sub,y2+sub/2+sub/4,y3+sub/2+sub/4,3, g);//left
	    //	drawCarpet(x1+sub+sub/4,x2+sub+sub/8,x3+sub+sub/4+sub/2,y1+sub,y2+sub/2+sub/4,y3+sub/2+sub/4,3, g);
	    	
	    	//Left
	    	//drawCarpet(x1+sub/2,x2+sub/4,x3+sub/2+sub/4,y1+sub*2,y2+sub+sub/2,y3+sub+sub/2,3,g);// middle
	    	//Right
	    	//drawCarpet(x1+sub+sub/2,x2+sub+sub/4,x3+sub+sub/2+sub/4,y1+sub*2,y2+sub+sub/2,y3+sub+sub/2,3, g);
	    	//drawCarpet(x1+sub+sub/2,x2+sub+sub/4,x3+sub+sub/2+sub/4,y1+sub*2,y2+sub+sub/2,y3+sub+sub/2,3, g);
		//}
	
}