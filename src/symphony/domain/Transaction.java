package symphony.domain;

public class Transaction {


public Transaction(){
	
}	
	
public Transaction(Date date,Payment payment,ID id, Ticket ticket){
	this.date=date;
	this.payment= payment;
	this.id=id;
	this.ticket=ticket;
}


public Date getDate(){
	return date;
}

public Payment getPayment(){
	return payment;
}

public ID getID(){
	return id;
}

public Ticket ticket(){
	return ticket;
}

public void setDate(Date date){
	this.date=date;
}
public void setPayment(Payment payment){
	this.payment =payment;
}
public void setID(ID id){
	this.id=id;
}

public void setTicket(Ticket ticket){
	this.ticket=ticket;
}

public String toString() {
	return "ID is " + id + " Date =" + date + " Tickets  " + ticket + " Payment Method " + payment;
}	
	
	
	
		
private Date date;	
private Payment payment;	
private ID id;	
private Ticket ticket;	
	
}
