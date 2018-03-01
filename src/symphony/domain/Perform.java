package symphony.domain;

public class Perform {

	
public Perform(){
	
}	
	
public boolean add(Composition composition){
	return true;} 	
	
public Date getPerformDate(){
	return performDate;
}
	
public void setPerformDate(Date performDate){
	this.performDate=performDate;
}	
	
public String toString(){
	return "Perform Date is "+ performDate;
}
	
private Date performDate;
}
