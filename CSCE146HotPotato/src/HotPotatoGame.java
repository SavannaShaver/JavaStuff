/*
 * Written by Savanna Shaver
 */
import java.util.Random;

public class HotPotatoGame {
	public static final int MIN_RAND_TIME = 10; // min random time
	public static final int MAX_RAND_TIME = 21; // max random time 21 is really 30? bc computers count from 0
	QueueI<String> players;
	private int currentTime;
	public HotPotatoGame()
	{
		init(); // intializes everything
	}
	private void init()
	{
		players = new LLQueue<String>(); // constructing players
		this.resetTime();// this intially slectes a random time
	}
	public void resetTime() // will use the random function to give a random time for the game
	{
		Random r = new Random();
		this.currentTime = r.nextInt(MAX_RAND_TIME)+ MIN_RAND_TIME; // this will select a random integer
	}
	//16:38 QUEUE 2 
	public void addPlayer(String aName)
	{
		if(aName == null)
		{
			return;
		}
		players.enqueue(aName); // this will add the players names to the end of the queue
				
	}
	public String getCurrentPlayer()
	{
		return players.dequeue(); // to find the current player we have to remove them first
	}
	public boolean hasLost(int time)
	{
		this.currentTime -= time; // time is the value they will enter that they held the aka hot potato 
		return this.currentTime <= 0; // current time os less than 0 than they lose 
	}
	public boolean getWin()
	{
		return players.size() <=1; // this should be exactly one but he said he want to use an < bc it looked nice??
	}
}
