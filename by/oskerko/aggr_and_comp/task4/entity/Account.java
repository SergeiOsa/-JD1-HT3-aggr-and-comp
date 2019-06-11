package oskerko.aggr_and_comp.task4.entity;

public class Account {

	private int accountNum;
	private double balance;
	private boolean isBlock;
	
	public Account() {}
	
	public Account(int accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public Account(int accountNum, double balance, boolean isBlock) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.isBlock = isBlock;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlock() {
		return isBlock;
	}

	public void setBlock(boolean isBlock) {
		this.isBlock = isBlock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNum;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBlock ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (accountNum != other.accountNum)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isBlock != other.isBlock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [accountNum=" + accountNum + ", balance=" + balance + ", isBlock=" + isBlock + "]";
	}

	
	
}
