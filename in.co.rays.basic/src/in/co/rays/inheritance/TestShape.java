package in.co.rays.inheritance;

public class TestShape extends Triangle {

	public static void main(String[] args) {
		
		TestShape t=new TestShape();
		
		t.setColour("pink");
		
		t.setBorderwidth(23);
		
		System.out.println(t.getColor());
		
		System.out.println(t.getBorderwidth());
		
		t.setBase(2);

		t.setHeight(4);
		
		System.out.println(t.getBase());
		
		System.out.println(t.getHeight());
		
		t.area();
		

	}

}
