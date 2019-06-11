package oskerko.aggr_and_comp.task4.Logic;

import java.util.Comparator;

import oskerko.aggr_and_comp.task4.entity.Account;

public class AccComparator implements Comparator<Account> {
	
	@Override
	public int compare(Account acc1, Account acc2) {
		return acc1.getAccountNum() - acc2.getAccountNum();
	}

}
