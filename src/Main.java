
import java.util.ArrayList;

public class Main 
{

	static public void main(String[] args)
	{
		
		System.out.println("N=9, results should be 3::" + josephus_ArrayList(9));
		System.out.println("N=11, results should be 7::" + josephus_ArrayList(11));  
		System.out.println("N=14, results should be 13::" + josephus_ArrayList(14));

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
            
            // Define an ArrayList
            ArrayList<Integer> A;
            A = new ArrayList<Integer>();
            
            // fill array with values: 1,2,3,...
            // don't do it as a funciton call
            for (int ii=1; ii<=n; ++ii) {
                A.add(ii);
            }
            
            // logic: find last remaining.
            int cnt = 1;
            while (A.size() > 1) {
                A.remove(cnt);
                cnt++;
                if (cnt >= A.size()) {
                    cnt = cnt - A.size();
                }
            }
            
            // return last remaining
            
		return A.get(0);
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
