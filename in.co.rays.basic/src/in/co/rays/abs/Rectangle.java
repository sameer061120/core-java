package in.co.rays.abs;

public class Rectangle extends Shape {
	
	private int length;
	
	private int width;
	
	public int getLength() {
		return length; 
	}
	
	public void setLength(int lenght) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}	
	
		
		

	@Override
	public void area() {
		int rArea=getLength()*getWidth();
		
		System.out.println(rArea);
		
	}

	private int Length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
