package in.co.rays.oops;

public class TestAccount {

	public static void main(String[] args) {
		
	
	
		Account a=new Account();
		
		a.setFirstname("sameer");
		a.setLastname("khan");
		
		a.setAddress("Indore");
		
		a.setId(12);
	    
	    System.out.println(a.getId());
	    
	    System.out.println(a.getFirstname());
	    
	    System.out.println(a.getAddress());
		
		System.out.println(a.getLastname());
	}

}
