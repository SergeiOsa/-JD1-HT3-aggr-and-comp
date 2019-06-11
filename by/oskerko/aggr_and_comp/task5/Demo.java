package oskerko.aggr_and_comp.task5;

import java.util.ArrayList;

import oskerko.aggr_and_comp.task5.entity.Cruise;
import oskerko.aggr_and_comp.task5.entity.Excursion;
import oskerko.aggr_and_comp.task5.entity.Relaxation;
import oskerko.aggr_and_comp.task5.entity.Shopping;
import oskerko.aggr_and_comp.task5.entity.TravelVoucher;
import oskerko.aggr_and_comp.task5.entity.Treatment;
import oskerko.aggr_and_comp.task5.entity.VoucherList;
import oskerko.aggr_and_comp.task5.logic.TravelLogic;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*/

public class Demo {

	public static void main(String[] args) {

		TravelLogic tl = new TravelLogic();
		
		TravelVoucher cruise1 = new Cruise("Porto", "airplane", 3000, 10, true);
		TravelVoucher cruise2 = new Cruise("Bobryisk", "airplane", 2000, 6, true);
		TravelVoucher excurs = new Excursion("Jodino", "train", 900, 2, false);
		TravelVoucher relax1 = new Relaxation("Minsk", "bus", 300, 4, true);
		TravelVoucher relax2 = new Relaxation("Monaco", "airplane", 4500, 15, true);
		TravelVoucher shop = new Shopping("Vilnus", "bus", 800, 2, false);
		TravelVoucher treat = new Treatment("Mexico", "airplane", 4000, 14, true);
	
		ArrayList<TravelVoucher> vouchList = new ArrayList<TravelVoucher>();
		VoucherList voucherList = new VoucherList(vouchList);
		voucherList.addVoucher(cruise1);
		voucherList.addVoucher(cruise2);
		voucherList.addVoucher(excurs);
		voucherList.addVoucher(relax1);
		voucherList.addVoucher(relax2);
		voucherList.addVoucher(shop);
		voucherList.addVoucher(treat);
		
		System.out.println("дешевле чем + сортировка:");
		tl.printVoucherList(tl.cheaperThan(voucherList, 2000));
		
		System.out.println("дороже чем + сортировка:");
		tl.printVoucherList(tl.expensiveThan(voucherList, 2000));
		
		System.out.println("поиск по транспорту:");
		tl.printVoucherList(tl.searchByTransport(voucherList, "bus"));
		
	}

}
