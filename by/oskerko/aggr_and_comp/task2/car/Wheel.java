package oskerko.aggr_and_comp.task2.car;

public class Wheel {
	
	private int diameter;
	private String brand;
	private boolean isRotate;
	
	{
		diameter = 17;
	}
	
	public Wheel() {}
	
	public Wheel(int diameter, String brand) {
		this.diameter = diameter;
		this.brand = brand;
	}
	
	public void rotateWheel() {
		this.isRotate = true;
	}
	
	public void stopRotateWheel() {
		this.isRotate = false;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isRotate() {
		return isRotate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + diameter;
		result = prime * result + (isRotate ? 1231 : 1237);
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
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (diameter != other.diameter)
			return false;
		if (isRotate != other.isRotate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [diameter=" + diameter + ", brand=" + brand + ", isRotate=" + isRotate + "]";
	}
	
	
	
}
