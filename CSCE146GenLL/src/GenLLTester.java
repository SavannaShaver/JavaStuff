
public class GenLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenLL<Integer> iLL = new GenLL <Integer>();  // tells the type is int
		GenLL<Double> dLL = new GenLL <Double>(); 
		GenLL<String> strLL = new GenLL <String>(); // tells the type is String
	
		for(int i=4; i>=0; i--)
		{
			iLL.add(i);
			dLL.add((double)i);
			strLL.add("str:" + i);
		}
		iLL.print();
		dLL.print();
		strLL.print();
		
	
	}
	

}
