package oskerko.aggr_and_comp.task3.entity;

import java.util.List;

public class Region {
	
	private String name;
	private double square;
	private int population;
	private List<City> region;
	
	public Region() {}
	
	public Region(String name,  List<City> region) {
		this.name = name;
		this.region = region;
	}

	public void setSquare(double square) {
		this.square = square;
	}
	
	public double getSquare() {
		return square;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public List<City> getRegion() {
		return region;
	}

	public void setRegion(List<City> region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		Region other = (Region) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", square=" + square + ", population=" + population + ", region=" + region
				+ "]";
	}

}
