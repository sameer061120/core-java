package in.co.rays.basic;

public class Reverse {

	public static void main(String[] args) {
		
		int a=564738291;
		int b=0;
		int c;
		
		while(a!=0) {
			
			c=a%10;
			b=b*10+c;
			
			a=a/10;
		}
		System.out.println(b);
		

	}

}
