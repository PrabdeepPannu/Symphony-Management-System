package symphony.domain;

public class ConcertSeason {
	
	
	public ConcertSeason(){}
	
	public ConcertSeason(OpeningDate openingDate, int seasonLength){
		this.openingDate=openingDate;
		this.seasonLength=seasonLength;
		
	}
	
	public OpeningDate getOpeningDate(){
		return openingDate;
		
	}
	
	public int SeasonLength(){
		return seasonLength;
		
	}
	
	public void setOpeningDate(OpeningDate openingDate){
		this.openingDate = openingDate;
	}
	
	public void setSeasonLength(int seasonLength){
		this.seasonLength=seasonLength;
	}
	
	public String toString(){
		return "Opening Date for the concert is " 
	            + openingDate + 	" Season Length is " 
				+ seasonLength;
	}
	
	private OpeningDate openingDate;
	private int seasonLength;

}
