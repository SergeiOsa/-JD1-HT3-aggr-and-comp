package oskerko.aggr_and_comp.task5.entity;

import java.util.List;

public class VoucherList {

	private List<TravelVoucher> voucherList;
	
	public VoucherList() {}
	
	public VoucherList(List<TravelVoucher> voucherList) {
		this.voucherList = voucherList;
	}
	
	public void addVoucher(TravelVoucher trVoucher) {
		voucherList.add(trVoucher);
	}
	
	public void removeVoucher(TravelVoucher trVoucher) {
		voucherList.remove(trVoucher);
	}
	
	public int getSize() {
		return voucherList.size();
	}

	public List<TravelVoucher> getVoucherList() {
		return voucherList;
	}

	public void setVoucherList(List<TravelVoucher> voucherList) {
		this.voucherList = voucherList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((voucherList == null) ? 0 : voucherList.hashCode());
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
		VoucherList other = (VoucherList) obj;
		if (voucherList == null) {
			if (other.voucherList != null)
				return false;
		} else if (!voucherList.equals(other.voucherList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [voucherList=" + voucherList + "]";
	}
	
	
	
}
