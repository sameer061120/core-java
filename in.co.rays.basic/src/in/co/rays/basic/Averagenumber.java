package in.co.rays.basic;

public class Averagenumber {

	public static void main(String[] args) {
		int n = 1000;
		int sum = 0;
		int count = 0;
		int avg;
		
		for(int i = 1; i <=n; i++) { 
			if(i%2==0)
				sum=sum+i;
			count++;
		}
		
		avg=sum/count;
		System.out.println("avg="+avg); 

	}

}
