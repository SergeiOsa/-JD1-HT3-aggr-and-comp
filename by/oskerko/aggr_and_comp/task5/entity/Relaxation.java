package oskerko.aggr_and_comp.task5.entity;

public class Relaxation extends TravelVoucher {	

	private boolean isSpa;
	
	public Relaxation() {}
	
	public Relaxation(String place, String transp, int price, int numOfDays, boolean isFood) {
		this.setType(Type.RELAXATION);
		this.setPlace(place);
		this.setTransport(Transport.valueOf(transp.toUpperCase()));
		this.setPrice(price);
		this.setNumOfDays(numOfDays);
		this.setFood(isFood);
		this.isSpa = true;
	}

	public boolean isSpa() {
		return isSpa;
	}

	public void setSpa(boolean isSpa) {
		this.isSpa = isSpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isSpa ? 1231 : 1237);
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
		Relaxation other = (Relaxation) obj;
		if (isSpa != other.isSpa)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [Type=" + getType() + ", Place=" + getPlace() + ", Transport=" + getTransport()
				+ ", Price=" + getPrice() + ", NumOfDays=" + getNumOfDays() + ", isFood=" + isFood() + ", isSpa=" + isSpa + "]";
	}
	
}
