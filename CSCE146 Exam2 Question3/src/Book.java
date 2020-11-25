/*
 * CSCE 146 Exam02 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 */
//Do not alter-----------------------------------------------------------------------
public class Book implements Comparable<Book>
{
	private String title;
	public Book(String aT)
	{
		this.setTitle(aT);
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		if(title != null)
			this.title = title;
		else
			this.title = "none";
	}
	public String toString()
	{
		return "Book "+title;
	}
	public int compareTo(Book b)
	{
		if(b == null)
			return 1;
		else
			return title.compareTo(b.getTitle());
	}
}
//-----------------------------------------------------------------------------------