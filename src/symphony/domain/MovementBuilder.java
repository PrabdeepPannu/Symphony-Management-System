package symphony.domain;

public class MovementBuilder {

	public MovementBuilder(){}
	
	public Movement build(){
		return Movement.getMovement(this);
		
	}
	
	
	
	
	public MovementBuilder movementID(ID number){
	this.number= number;
	return this;
		
	}
	
	public MovementBuilder Name(Name name){
		this.name=name;
		return this;
	}
	
	public ID getID() {
		
		return number;
	}

	public Name getName() {
		return name;
	}
	public ID number;
	public Name name;
	
	
	
}
