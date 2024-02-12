package in.co.rays.basic;

public class Largenumber {

	public static void main(String[] args) {
		int[] arr = {10,30,20,50,60,70,90,100};
		
		int a=0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
		}
		System.out.println(a);

	}

}
