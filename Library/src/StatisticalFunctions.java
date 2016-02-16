
public class StatisticalFunctions {

	
	int findMin(int a, int b)
	{
		if(a<b)
			return a;
		else
			return b;
	}
	
	
	int findMax(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	int findMean(int[] array)
	{
		int sum =0;
		for(int a : array)
			sum = sum + a;
		
		return sum/array.length;
	}
	
	
}
