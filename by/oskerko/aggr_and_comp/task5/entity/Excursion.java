package oskerko.aggr_and_comp.task5.entity;

public class Excursion extends TravelVoucher {

	private String language;
	
public Excursion() {}
	
	public Excursion(String place ,String transp, int price, int numOfDays, boolean isFood) {
		this.setType(Type.EXCURSION);
		this.setPlace(place);
		this.setTransport(Transport.valueOf(transp.toUpperCase()));
		this.setPrice(price);
		this.setNumOfDays(numOfDays);
		this.setFood(isFood);
		this.language = "Belarussian";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((language == null) ? 0 : language.hashCode());
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
		Excursion other = (Excursion) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [Type=" + getType() + ", Place=" + getPlace()
		    + ", Transport=" + getTransport() + ", Price=" + getPrice() + ", NumOfDays="
				+ getNumOfDays() + ", isFood=" + isFood() + ", language=" + language + "]";
	}
	
	
}
