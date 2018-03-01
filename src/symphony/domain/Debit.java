package symphony.domain;

public class Debit implements Payment{

	
	public int getAccountNumber(){
		return Accountnumber;
		
	}
	public void setAccountNumber(int Accountnumber) {
		this.Accountnumber= Accountnumber;
		
	}

	@Override
	public ID getID() {
		return id;
		
	}

	@Override
	public Date getDate() {
		return date;
		
	}
	@Override
	public AccountHolder getAccountHolder() {
		return holder;
		
	}
	
	@Override
	public void AccountHolder(AccountHolder holder) {
	 this.holder=holder;
		
	}

	@Override
	public void setID(ID id) {
		this.id = id;
		
	}

	@Override
	public void setDate(Date date) {
		this.date= date;
		
	}

	private int Accountnumber;
	private ID id;
	private Date date;
	private AccountHolder holder;
	
	
	

}
