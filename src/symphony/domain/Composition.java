package symphony.domain;

public class Composition {


public Composition(){}

public ID getID(){
	return id;
}

public Name getName(){
	return name;
}

public Composer getcomposer(){
	return composer;
}

public Movement getMovement(){
	return movement;}

public void setMovement(Movement movement){
	this.movement=movement;
}

public void setID(ID id){
	this.id=id;
}

public void setName(Name name){
	this.name = name;
}

public Soloist getSoloist(){
	return soloist;}

public void setSoloist(Soloist soloist){
	this.soloist = soloist;
}

private Soloist soloist;
private ID id;
private Name name;
private Composer composer;
private Movement movement;
}
