package symphony.domain;

public class Date {

	
	public Date(){}
	
	public Date(DateBuilder builder){
		builder.getDay();
		builder.getMonth();
		builder.getTime();
		builder.getYear();
	}
	
	public static Date getDate(DateBuilder builder) {
		return new Date(builder);
	}
	
	
	private Year year;
	private Month month;
	private Day day;
	private Time time;
}
