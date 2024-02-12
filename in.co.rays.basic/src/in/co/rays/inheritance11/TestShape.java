package in.co.rays.inheritance11;

public class TestShape {

	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		
		System.out.println();
		
		t.setcolor("Black White");
		t.setBorderwidth(17);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderwidth());
		
		t.setBase(20);
		t.setHeight(40);
		
		System.out.println();
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		
		t.area();
		}
		

	}

