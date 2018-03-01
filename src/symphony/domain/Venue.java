package symphony.domain;

public class Venue {




public Venue(){}

public int getConcerts(){
	return concert;
}

public Address getLocation(){
	return address;
}

public int getSeats(){
	return seats;
	}

public int getTickets(){
	return tickets;
}

public void setConcerts(int concert){
	this.concert=concert;
	}

public void setLocation(Address address){
	this.address=address;
}

public void setSeats(int seats){
	this.seats = seats;
}


public void setTickets(int tickets){
	this.tickets=tickets;
}




private int concert;
private Address address;
private int seats;
private int tickets;


}


