package in.co.rays.basic;

public class AverageCal {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		int count = 0;
		int avg;
		
		for (int i=1; i<=n;i++) {
			if(i%2==0) {
				sum=sum+1;
				count++;
			}
		}
		avg=sum/count;
		System.out.println("avg"+avg);
			}
		

	}


