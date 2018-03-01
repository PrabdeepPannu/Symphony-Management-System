package symphony.domain;

public class OpeningDate {
	
	
	public OpeningDate(){}
	
	public int getOpeningDay(){
		return OpeningDay;
	}
	
	public int getOpeningMonth(){
		return OpeningMonth;
	}
	
	public int getOpeningYear(){
		return OpeningYear;
	}
	
	public void setOpeningDay(int OpeningDay){
		this.OpeningDay=OpeningDay;
	}
	
	public void setOpeningMonth(int OpeningMonth){
		this.OpeningMonth=OpeningMonth;
	}
	
	public void setOpeningYear(int OpeningYear){
		this.OpeningYear=OpeningYear;
		
	}
	
	
	private int OpeningDay;
	private int OpeningMonth;
	private int OpeningYear;

}
