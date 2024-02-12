package in.co.rays.oops;

public class PersonOne {
	
	private int number;

	public void sum(int a,int b) {
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	public void primeNumber (int numbre ) {
		int count=0;
		
		for (int i = 2; i < number; i++) {
			if (number%2==0) {
				count++;
				
			}
		}
		
		if (count==0) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
	}

}
