package oskerko.aggr_and_comp.task3.entity;

public class City {

	private String name;
	private boolean isCapital;
	private boolean isStateCentre;
	private double square;
	private int population;
	
	public City() {}
	
	public City(String name, boolean isCapital, boolean isStateCentre, double square, int population) {
		this.name = name;
		this.isCapital = isCapital;
		this.isStateCentre = isStateCentre;
		this.square = square;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public boolean isStatenCentre() {
		return isStateCentre;
	}

	public void setStateCentre(boolean isStateCentre) {
		this.isStateCentre = isStateCentre;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCapital ? 1231 : 1237);
		result = prime * result + (isStateCentre ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		City other = (City) obj;
		if (isCapital != other.isCapital)
			return false;
		if (isStateCentre != other.isStateCentre)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", isCapital=" + isCapital + ", isStateCentre=" + isStateCentre + ", square="
				+ square + ", population=" + population + "]";
	}

}
