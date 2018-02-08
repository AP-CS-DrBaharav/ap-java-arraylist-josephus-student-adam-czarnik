
import java.util.ArrayList;

public class Main 
{

	static public void main(String[] args)
	{
		
		System.out.println("N=9, results should be 3::" + josephus_ArrayList(9));
		System.out.println("N=7, results should be 11::" + josephus_CircShift(11));  
		System.out.println("N=14, results should be 13::" + josephus_LogN(14));

		System.out.println(" n  | ArrayList <-> CircShift <-> LogN");
		for (int ii=1 ; ii<40; ++ii)
		{
			System.out.print(String.format(" %2d |",ii));
			System.out.print(josephus_ArrayList(ii));  
			System.out.print(" <-> " +josephus_CircShift(ii));  
			System.out.println(" <-> " +josephus_LogN(ii));		
		}
		
		
	}
	
	static public int josephus_ArrayList(int n)
	{
		return 0;
	}
	
	static public int josephus_CircShift(int n)
	{
            return 0;
	}
	
	static public int josephus_LogN(int n)
	{
            return 0;
	}
	
}
