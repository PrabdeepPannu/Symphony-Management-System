package symphony.domain;

public class DateBuilder {

	
	
	public DateBuilder(){
		
	}
	
	public DateBuilder(Year year,Month month,Day day){
		this.year=year;
		this.month = month;
		this.day = day;
		
	}
	
	public Date build(){
		return Date.getDate(this);
	}
	
	public DateBuilder time(Time time){
		this.time = time;
		return this;
	}
	
	public Year getYear(){
		return year;
	} 
	
	public Month getMonth(){
		return month;
	}
	
	public Day getDay(){
		return day;
	}
	
	public Time getTime(){
		return time;
	}
	
	
	
	private Year year;
	private Day day;
	private Month month;
	private Time time;
}
