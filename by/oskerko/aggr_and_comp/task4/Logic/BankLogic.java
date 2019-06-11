package oskerko.aggr_and_comp.task4.Logic;

import java.util.List;

import oskerko.aggr_and_comp.task4.entity.Account;
import oskerko.aggr_and_comp.task4.entity.Customer;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
 Учитывать возможность блокировки/разблокировки счета. 
 Реализовать поиск и сортировку счетов. 
 Вычисление общей суммы по счетам.
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/

public class BankLogic {

	public Account findAccount(Customer customer, int accountNum) {
		List<Account> accountList = customer.getAccountList();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNum() == accountNum) {
				return accountList.get(i);
			}
		}
		return null;
	}

	public void sortAccount(Customer customer) {
		AccComparator accComp = new AccComparator();
		customer.getAccountList().sort(accComp);
	}

	public double sumAll(Customer customer) {
		double sumAll = 0;
		List<Account> accList = customer.getAccountList();
		for (int i = 0; i < accList.size(); i++) {
			sumAll = sumAll + accList.get(i).getBalance();
		}
		return sumAll;
	}

	public double sumPlus(Customer customer) {
		double sumPlus = 0;
		List<Account> accList = customer.getAccountList();
		for (int i = 0; i < accList.size(); i++) {
			if (accList.get(i).getBalance() > 0) {
				sumPlus = sumPlus + accList.get(i).getBalance();
			}
		}
		return sumPlus;
	}

	public double sumMinus(Customer customer) {
		double sumMinus = 0;
		List<Account> accList = customer.getAccountList();
		for (int i = 0; i < accList.size(); i++) {
			if (accList.get(i).getBalance() < 0) {
				sumMinus = sumMinus + accList.get(i).getBalance();
			}
		}
		return sumMinus;
	}

	public double sumUnBlock(Customer customer) {
		double sumUnBlock = 0;
		List<Account> accList = customer.getAccountList();
		for (int i = 0; i < accList.size(); i++) {
			if (accList.get(i).isBlock() == false) {
				sumUnBlock = sumUnBlock + accList.get(i).getBalance();
			}
		}
		return sumUnBlock;
	}
	
	public double sumBlock(Customer customer) {
		double sumBlock = 0;
		List<Account> accList = customer.getAccountList();
		for (int i = 0; i < accList.size(); i++) {
			if (accList.get(i).isBlock() == true) {
				sumBlock = sumBlock + accList.get(i).getBalance();
			}
		}
		return sumBlock;
	}

}
