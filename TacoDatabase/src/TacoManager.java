import java.util.Scanner;
import java.io.*;
public class TacoManager {

	private Taco[] tacos;  // Taco[] is an array
	public static final int DEF_SIZE = 10;
	public static final String DELIM = "\t"; // this is a tab space
	public static final int BODY_FIELD_AMT = 3;
	public static final int HEADER_FIELD_AMT = 2;
	
	public TacoManager()
	{
		init(DEF_SIZE); //default construtor
	}
	public TacoManager(int size)
	{
		init(size);// parameterized consturctor size
	}
	public void init(int size)
	{
		//now we have to check if this checks parameters 
		//also apperantly size is contriubting to the size of the array
		if(size >= 1)
			tacos = new Taco[size];
		else
			tacos = new Taco[DEF_SIZE];
	}
	public void addTaco(Taco aTaco)
	{
		// we have to check if the array is full
		if(tacos[tacos.length-1] != null)
			return;
		for(int i=0; i<tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				tacos[i] = aTaco;
				break;
			}
		}
	}
}
