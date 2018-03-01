package symphony.domain;

public class Individual {


public Individual(){}

public Individual(Name name, Address address, Telephone telephone){
	this.name=name;
	this.address=address;
	this.telephone=telephone;
	
}

public Name getName(){
	return name;
}

public Address getAddress(){
	return address;
}
	
public Telephone getTelephone(){
	return telephone;}	
	
	
public ID getID(){
	return id;
}	
	
public void setName(Name name){
	this.name= name;
}

public void setAddress(Address address){
	this.address= address;
	
}
	
public void setID(ID id){
	this.id = id;
} 

public String toString(){
	return "Name of person is " + name 
			+"  Address of the person is " + address 
			+ "Telephone of the person is " 
			+ telephone + " ID is "+ id;
}

protected Name name;
protected Address address;
protected Telephone telephone;
private ID id;


}
