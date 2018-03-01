package symphony.domain;

public class Time {
	
	
	
	
	public Time(){}
	
	public int getHour(){
		return hour;
		
	}
	
	public int getMin(){
		return min;
	}
	
	public int getsec(){
		return sec;
	}
	
	public void setHour(int hour){
		this.hour=hour;
	}
	
	public void setMin(int min){
		this.min = min;
	}
	
	public void setsec(int sec){
		this.sec = sec;
	}
	
	public String toString(){
		return "Time "+ hour+":"+min+":"+sec;
	}
	private int hour;
	private int min;
	private int sec;

}
