package symphony.domain;

public class AccountHolder extends Individual{

	public AccountHolder(){
		
	}
	
	private AccountHolder(Name name,Address address,Telephone telephone){
         super( name, address,telephone);		
	}
}
