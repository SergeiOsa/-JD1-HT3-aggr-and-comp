package oskerko.aggr_and_comp.task2.car;

//ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public interface Action {
	
	void StartDrive();
	void StopDrive();
	void toRefuel();	
	void changeWheel(int index, Wheel wheel);
}
