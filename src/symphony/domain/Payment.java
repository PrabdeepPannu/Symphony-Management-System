package symphony.domain;

public interface Payment {
	
public ID getID();

public Date getDate();

public void setID(ID id);

public void setDate(Date date);

public AccountHolder getAccountHolder();

public void AccountHolder(AccountHolder holder);

public String toString();


}
