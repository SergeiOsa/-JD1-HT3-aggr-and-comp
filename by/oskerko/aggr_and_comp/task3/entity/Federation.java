package oskerko.aggr_and_comp.task3.entity;

import java.util.List;

public class Federation {

	private String name;
	private double square;
	private int population;
	private List<State> federation;

	public Federation() {}

	public Federation(String name, List<State> federation) {
		this.name = name;
		this.federation = federation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<State> getFederation() {
		return federation;
	}

	public void setFederation(List<State> federation) {
		this.federation = federation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((federation == null) ? 0 : federation.hashCode());
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
		Federation other = (Federation) obj;
		if (federation == null) {
			if (other.federation != null)
				return false;
		} else if (!federation.equals(other.federation))
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
		return this.getClass().getSimpleName() + " [name=" + name + ", square=" + square + ", population=" + population + ", federation="
				+ federation + "]";
	}
	
}
