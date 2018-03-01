package symphony.domain;

public class Credit implements Payment{

	
	public int getCardNumber(){
		return cardNumber;
		
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
		this.id=id;
		
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
		
	}
	
	public void setCardNumber(int cardNumber) {
	    this.cardNumber=cardNumber;	
		
	}

	private ID id;
	private Date date;
	private int cardNumber;
	private AccountHolder holder;
	

	
}
