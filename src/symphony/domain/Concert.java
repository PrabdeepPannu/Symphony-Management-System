package symphony.domain;

public class Concert {


	
	public Concert(){}
	
	public Conductor getConductor(){
		return conductor;
	}
	
	
	public ID getConcertNumber(){
		return concertNumber;
	}
	
	
	public Perform getPerform(){
		return perform;
		
	}
	
	public Date getDate(){
		return date;
		
	}
	
	
	public Venue getVenue(){
		return venue;
	}
	
   public void  setConcertNumber(ID concertNumber){
	  this.concertNumber=concertNumber; 
   }
	
   public void setPerform(Perform perform){
	   this.perform= perform;
   }	
	
   public void setDate(Date date){
	   this.date= date;
   }
	
   public void setVenue(Venue venue){
	   this.venue= venue;
   }	
	
	private Conductor conductor;
	private ID concertNumber;
	private Perform perform;
	private Date date;
	private Venue venue;
	
	
}
