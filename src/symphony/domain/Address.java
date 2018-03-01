package symphony.domain;

public class Address {

	
	public Address(){}
	
	
	public Address(String address, PostalCode pCode, String StreetName, String City, String Provience, int streetNumber){
		this.City=City;
		this.pCode=pCode;
		this.Provience=Provience;
		this.streetNumber = streetNumber;
		this.StreetName=StreetName;
		
		}
	
	public int getStreetNumber(){
		return streetNumber;
		}
	
	
	public String getStreetName(){
		return StreetName;
		}
	
	public String getCity(){
		return City;
		}
	
	public String getProvience(){
		return Provience;
		}
	
	
	public PostalCode getPostalCode(){
		return pCode;}
	
	
	
	public void setStreetName(String StreetName){
		this.StreetName=StreetName;
	    }
	
	public void setCity(String City){
		this.City=City;
	    }
	
	public void setProvience(String Provience){
		this.Provience=Provience;
	    }
	
	public void setPostalCode(PostalCode pCode){
		this.pCode=pCode;
	    }
	public String toString(){
		return "Adress = " + " "+streetNumber+" "+ StreetName+ " "+City+"" +Provience+""+ pCode;
		}
	
	
	
	private int streetNumber;
	private String StreetName;
	private String City;
	private String Provience;
	private PostalCode pCode;
	
}
