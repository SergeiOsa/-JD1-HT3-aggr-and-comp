package oskerko.aggr_and_comp.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private List<Account> accountList;
	
	public Customer() {}

	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		accountList = new ArrayList<Account>();
	}
	
	public Customer(int id, String firstName, String lastName, List<Account> accountList) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountList = accountList;
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public boolean removeAccount(Account account) {
		accountList.remove(account);
		return true;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountList == null) ? 0 : accountList.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (accountList == null) {
			if (other.accountList != null)
				return false;
		} else if (!accountList.equals(other.accountList))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", accountList="
				+ accountList + "]";
	}

	
	
}
