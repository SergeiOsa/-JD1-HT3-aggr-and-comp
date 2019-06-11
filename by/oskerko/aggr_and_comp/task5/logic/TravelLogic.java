package oskerko.aggr_and_comp.task5.logic;

import java.util.ArrayList;
import java.util.List;

import oskerko.aggr_and_comp.task5.entity.Transport;
import oskerko.aggr_and_comp.task5.entity.TravelVoucher;
import oskerko.aggr_and_comp.task5.entity.VoucherList;

public class TravelLogic {

	public List<TravelVoucher> searchByTransport(VoucherList voucherList, String transp) {
		ArrayList<TravelVoucher> searchList = new ArrayList<TravelVoucher>();
		List<TravelVoucher> list = voucherList.getVoucherList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTransport() == Transport.valueOf(transp.toUpperCase())) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	public List<TravelVoucher> searchByFood(VoucherList voucherList, boolean isFood) {
		ArrayList<TravelVoucher> searchList = new ArrayList<TravelVoucher>();
		List<TravelVoucher> list = voucherList.getVoucherList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isFood() == isFood) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	public List<TravelVoucher> cheaperThan(VoucherList voucherList, int price) {
		ArrayList<TravelVoucher> searchList = new ArrayList<TravelVoucher>();
		List<TravelVoucher> list = voucherList.getVoucherList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPrice() <= price) {
				searchList.add(list.get(i));
			}
		}
		CompareByPrice c = new CompareByPrice();
		searchList.sort(c);
		return searchList;
	}
	
	public List<TravelVoucher> expensiveThan(VoucherList voucherList, int price) {
		ArrayList<TravelVoucher> searchList = new ArrayList<TravelVoucher>();
		List<TravelVoucher> list = voucherList.getVoucherList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPrice() >= price) {
				searchList.add(list.get(i));
			}
		}
		CompareByPrice c = new CompareByPrice();
		searchList.sort(c);
		return searchList;
	}
	
	public void printVoucherList(List<TravelVoucher> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
