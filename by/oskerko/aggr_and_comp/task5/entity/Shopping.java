package oskerko.aggr_and_comp.task5.entity;

public class Shopping extends TravelVoucher {

	private boolean isDiscount;
	
	public Shopping() {}
	
	public Shopping(String place, String transp, int price, int numOfDays, boolean isFood) {
		this.setType(Type.SHOPPING);
		this.setPlace(place);
		this.setTransport(Transport.valueOf(transp.toUpperCase()));
		this.setPrice(price);
		this.setNumOfDays(numOfDays);
		this.setFood(isFood);
		this.isDiscount = true;
	}

	public boolean isDiscount() {
		return isDiscount;
	}

	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isDiscount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shopping other = (Shopping) obj;
		if (isDiscount != other.isDiscount)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [Type=" + getType() + ", Place=" + getPlace()
		    + ", Transport=" + getTransport() + ", Price=" + getPrice() + ", NumOfDays="
				+ getNumOfDays() + ", isFood=" + isFood() + ", isDiscount=" + isDiscount + "]";
	}

}
