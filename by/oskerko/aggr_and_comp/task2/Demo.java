package oskerko.aggr_and_comp.task2;

import java.util.ArrayList;
import java.util.List;

import oskerko.aggr_and_comp.task2.car.Car;
import oskerko.aggr_and_comp.task2.car.Engine;
import oskerko.aggr_and_comp.task2.car.Wheel;
import oskerko.aggr_and_comp.task2.logic.CarLogic;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Demo {

	public static void main(String[] args) {

		Engine engine = new Engine();
		List<Wheel> wheels = new ArrayList<Wheel>();
		
		for (int i = 0; i < 4; i++) {
			Wheel wheel = new Wheel(19, "BBS");
			wheels.add(wheel);
		}
		
		Car car = new Car("Belarus", engine, wheels);
		
		CarLogic cl = new CarLogic();
		System.out.println("выводим назв брэнда:");
		cl.printBrand(car);
		
		System.out.println("Статус авто:");
		System.out.println(cl.status(car));
		
		System.out.println("Запустили метод ехать");
		car.StartDrive();
		
		System.out.println("Статус авто:");
		System.out.println(cl.status(car));
		
		System.out.println("Запустили метод стоп");
		car.StopDrive();
		
		System.out.println("Статус авто:");
		System.out.println(cl.status(car));
		
	}

}
