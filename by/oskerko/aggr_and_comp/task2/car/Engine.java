package oskerko.aggr_and_comp.task2.car;

public class Engine {
	
	private int capacity;
	private boolean isRun;

	{
		capacity = 1600;
	}
	
	public Engine() {}

	public Engine(int capacity, boolean isRun) {
		this.capacity = capacity;
		this.isRun = isRun;
	}
	
	public void startEngine() {
		isRun = true;
	}
	
	public void stopEngine() {
		isRun = false;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isRun() {
		return isRun;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + (isRun ? 1231 : 1237);
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
		Engine other = (Engine) obj;
		if (capacity != other.capacity)
			return false;
		if (isRun != other.isRun)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [capacity=" + capacity + ", isRun=" + isRun + "]";
	}

	
	
}
