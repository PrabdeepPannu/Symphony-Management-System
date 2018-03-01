package symphony.domain;

public class Soloist extends Individual{

	
	
	private Soloist(){}
	
	private Soloist(Name name, Address address , Telephone telephone, String expert){
		super(name, address, telephone);
		this.expert = expert;
	}
	
	public String getexpertise(){
		return expert;
	
	}
	
	public void setexpert(String expert){
		this.expert=expert;
		
		
	}
   private String expert;
}
