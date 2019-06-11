package oskerko.aggr_and_comp.task5.entity;

public abstract class TravelVoucher {
	private Type type;
	private String place;
	private Transport transport;
	private int price;
	private int numOfDays;
	private boolean isFood;
	
	public TravelVoucher() {}
	
	public TravelVoucher( Type type, String place, Transport transport, int price, int numOfDays, boolean isFood) {
		this.type = type;
		this.place = place;
		this.transport = transport;
		this.price = price;
		this.numOfDays = numOfDays;
		this.isFood = isFood;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public boolean isFood() {
		return isFood;
	}

	public void setFood(boolean isFood) {
		this.isFood = isFood;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isFood ? 1231 : 1237);
		result = prime * result + numOfDays;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		TravelVoucher other = (TravelVoucher) obj;
		if (isFood != other.isFood)
			return false;
		if (numOfDays != other.numOfDays)
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (price != other.price)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [type=" + type + ", place=" + place + ", transport=" + transport + ", price=" + price
				+ ", numOfDays=" + numOfDays + ", isFood=" + isFood + "]";
	}

}
