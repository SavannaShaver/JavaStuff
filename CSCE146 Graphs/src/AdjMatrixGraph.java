
public class AdjMatrixGraph {
	public static final int DEF_VERT_COUNT = 10;
	private double[][] adjMatrix;
	public AdjMatrixGraph()
	{
		init(DEF_VERT_COUNT);
	}
	public AdjMatrixGraph(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if (size <= 0)
		{
			init(DEF_VERT_COUNT);
			return;
		}
		adjMatrix = new double[size][size];
		for(int i=0; i<adjMatrix.length;i++)
			for(int j=0; j<adjMatrix[i].length;j++)
				adjMatrix[i][j]= 0;
	}
	
	public void addEdge(int fromVertex, int toVertex, double weight) {
		// TODO Auto-generated method stub
		if(isValid(fromVertex)|| isValid(toVertex))
			return;
		adjMatrix[fromVertex][toVertex] = weight;
	}
	
	private boolean isValid(int index)
    {
		return index >= 0 && index < adjMatrix.length;
	}
	public void printAdjMatrix()
	{
		for(int i=0;i<adjMatrix.length;i++)
		{
			for(int j=0; j<adjMatrix[i].length;j++)
			{
				System.out.println(adjMatrix[i][j]+" ");
			}
		}
		System.out.println();
	}
	
}
