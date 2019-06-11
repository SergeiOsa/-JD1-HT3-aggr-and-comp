package oskerko.aggr_and_comp.task5.logic;

import java.util.Comparator;

import oskerko.aggr_and_comp.task5.entity.TravelVoucher;

public class CompareByPrice implements Comparator<TravelVoucher> {

	@Override
	public int compare(TravelVoucher arg0, TravelVoucher arg1) {
		return arg0.getPrice()-arg1.getPrice();
	}

}
