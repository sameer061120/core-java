package in.co.rays.abs;

public class Businessmen implements Richman,SocialWorker {
	
	@Override
	public void helpToOther() {
		
		System.out.println("helping");
		
	}
	
	@Override
	public void earn() {
		System.out.println("earn money");
		
	}
	
	public void donation() {
		System.out.println("donation");
		
	}
	
	@Override
	public void party() {
	   System.out.println("party");
	}

	@Override
	public void donate() {
		// TODO Auto-generated method stub
		
	}

}
