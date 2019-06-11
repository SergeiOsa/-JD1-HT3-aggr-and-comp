package oskerko.aggr_and_comp.task3;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

import oskerko.aggr_and_comp.task3.entity.City;
import oskerko.aggr_and_comp.task3.entity.Federation;
import oskerko.aggr_and_comp.task3.entity.Region;
import oskerko.aggr_and_comp.task3.entity.State;
import oskerko.aggr_and_comp.task3.logic.Logic;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class Demo {

	public static void main(String[] args) {

		Logic l = new Logic();
		
		City minsk = new City("Минск", true, true, 1000, 2500);
		City borovlyani = new City("Боровляны", false, false, 100, 50);
		City brest = new City("Брест", false, true, 300, 400);
		City vitebsk = new City("Витебск", false, true, 310, 400);
		City baranovichi = new City("Барановичи", false, false, 200, 210);
		City borisov = new City("Борисов", false, false, 150, 180);

		
		Region minskReg = l.createRegion("Минский район", minsk);
		l.addCityToRegion(minskReg, borovlyani);
		Region brestReg = l.createRegion("Брестский район", brest);
		Region vitebskReg = l.createRegion("Витебский район", vitebsk);
		Region baranovichiReg = l.createRegion("Барановичкий район", baranovichi);
		Region borisovReg = l.createRegion("Борисовский район", borisov);

		l.regionSquare(minskReg);
		l.regionSquare(brestReg);
		l.regionSquare(vitebskReg);
		l.regionSquare(baranovichiReg);
		l.regionSquare(borisovReg);
		
		l.regionPopulation(minskReg);
		l.regionPopulation(brestReg);
		l.regionPopulation(vitebskReg);
		l.regionPopulation(baranovichiReg);
		l.regionPopulation(borisovReg);
		
		
		State minskState = l.ctreateState("Минская обл", minskReg);
		l.addRegionToState(minskState, borisovReg);
		State brestState = l.ctreateState("Брестская обл", brestReg);
		l.addRegionToState(brestState, baranovichiReg);
		State vitebskState = l.ctreateState("Витебская обл", vitebskReg);

		l.stateSquare(minskState);
		l.stateSquare(brestState);
		l.stateSquare(vitebskState);
		
		l.statePopulation(minskState);
		l.statePopulation(brestState);
		l.statePopulation(vitebskState);

		
		Federation federation = l.ctreateFederation("Беларусь", minskState);
		l.addStateToFederation(federation, brestState);
		l.addStateToFederation(federation, vitebskState);
		
		l.federationPopulation(federation);
		l.federationSquare(federation);
		
		
		System.out.println("Площадь минского района: " + minskReg.getSquare());
		System.out.println("Площадь брестского района: " + brestReg.getSquare());
		System.out.println("Площадь минской обл: " + minskState.getSquare());
		System.out.println("Площадь витебской обл: " + vitebskState.getSquare());
		System.out.println("Население брестской обл: " + brestReg.getPopulation());
		System.out.println("Площадь страны:" + federation.getSquare());
		System.out.println("Население страны:" + federation.getPopulation());
		l.printCapital(federation);
		l.printStateCenter(federation);
		
	}

}
