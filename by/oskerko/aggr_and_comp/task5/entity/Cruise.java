package oskerko.aggr_and_comp.task5.entity;

public class Cruise extends TravelVoucher {

	private String sea;
	
	public Cruise() {}

	public Cruise(String place, String transp, int price, int numOfDays, boolean isFood) {
		this.setType(Type.CRUISE);
		this.setPlace(place);
		this.setTransport(Transport.valueOf(transp.toUpperCase()));
		this.setPrice(price);
		this.setNumOfDays(numOfDays);
		this.setFood(isFood);
		this.sea = "Baltic";
	}

	public String getSea() {
		return sea;
	}

	public void setSea(String sea) {
		this.sea = sea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sea == null) ? 0 : sea.hashCode());
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
		Cruise other = (Cruise) obj;
		if (sea == null) {
			if (other.sea != null)
				return false;
		} else if (!sea.equals(other.sea))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [Type=" + getType() + ", Place=" + getPlace()
		    + ", Transport=" + getTransport() + ", Price=" + getPrice() + ", NumOfDays="
				+ getNumOfDays() + ", isFood=" + isFood() + ", sea=" + sea + "]";
	}
}
