package oskerko.aggr_and_comp.task4;

import java.util.ArrayList;
import java.util.TreeSet;

import oskerko.aggr_and_comp.task4.Logic.AccComparator;
import oskerko.aggr_and_comp.task4.Logic.BankLogic;
import oskerko.aggr_and_comp.task4.entity.Account;
import oskerko.aggr_and_comp.task4.entity.Customer;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
 Учитывать возможность блокировки/разблокировки счета. 
 Реализовать поиск и сортировку счетов. 
 Вычисление общей суммы по счетам.
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/

public class Demo {

	public static void main(String[] args) {

		Account acc1 = new Account(5, 200);
		Account acc2 = new Account(2, 500);
		Account acc3 = new Account(3, 100, true);
		Account acc5 = new Account(1, -300);

		Account acc4 = new Account(4, 300);

		Customer cust1 = new Customer(1, "serg", "osk");
		cust1.addAccount(acc1);
		cust1.addAccount(acc2);
		cust1.addAccount(acc3);
		cust1.addAccount(acc5);

		Customer cust2 = new Customer(2, "andr", "makarevich");
		cust2.addAccount(acc4);

		BankLogic bl = new BankLogic();
		System.out.println(bl.findAccount(cust1, 4));

		System.out.println(cust1);
		System.out.println();

		bl.sortAccount(cust1);
		
		System.out.println("отсортиров по номеру счёта: ");
		System.out.println(cust1);
		System.out.println("сумма всех счетов: " + bl.sumAll(cust1));
		System.out.println("сумма полож балансов: " + bl.sumPlus(cust1));
		System.out.println("сумма отриц балансов: " + bl.sumMinus(cust1));
		System.out.println("сумма разблок счетов: " + bl.sumUnBlock(cust1));
		System.out.println("сумма заблок счетов: " + bl.sumBlock(cust1));

		
	}

}
