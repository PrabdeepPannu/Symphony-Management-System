package symphony.domain;

public class Movement {
	
	
	
	
	public Movement(MovementBuilder builder){
		this.number=builder.getID();
		this.name= builder.getName();
	}
	
	public static Movement getMovement(MovementBuilder builder){
		return new Movement(builder);}
	
	
	
	private ID number;
    private Name name;
}
