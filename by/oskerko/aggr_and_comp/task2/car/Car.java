package oskerko.aggr_and_comp.task2.car;

import java.util.List;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Car implements Action {

	private String brand;
	private String size;
	private Engine engine;
	private List<Wheel> wheels;
	private boolean isDrive;
	private boolean isEmptyTank;

	{
		size = "BIG car";
	}

	public Car() {
	}

	public Car(String brand, Engine engine, List<Wheel> wheels) {
		this.brand = brand;
		this.engine = engine;
		this.wheels = wheels;
	}

	public void StartDrive() {
		if (engine.isRun() == false) {
			engine.startEngine();
		}
		for (int i = 0; i < wheels.size(); i++) {
			wheels.get(i).rotateWheel();
		}
		isDrive = true;
	}

	public void StopDrive() {
		isDrive = false;
		for (int i = 0; i < wheels.size(); i++) {
			wheels.get(i).stopRotateWheel();
		}
	}

	public void toRefuel() {
		isEmptyTank = false;
	}
	
	public void changeWheel(int index, Wheel wheel) {
		if(index < 1 || index > 4) {
			index = 1;
		}
		wheels.set(index, wheel);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public boolean isDrive() {
		return isDrive;
	}

	public boolean isEmptyTank() {
		return isEmptyTank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + (isDrive ? 1231 : 1237);
		result = prime * result + (isEmptyTank ? 1231 : 1237);
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (isDrive != other.isDrive)
			return false;
		if (isEmptyTank != other.isEmptyTank)
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [brand=" + brand + ", size=" + size + ", engine=" + engine + ", wheels=" + wheels + ", isDrive="
				+ isDrive + ", isEmptyTank=" + isEmptyTank + "]";
	}

	
	
}
