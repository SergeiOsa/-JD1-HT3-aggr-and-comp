package oskerko.aggr_and_comp.task3.logic;

import java.util.ArrayList;
import java.util.List;

import oskerko.aggr_and_comp.task3.entity.City;
import oskerko.aggr_and_comp.task3.entity.Federation;
import oskerko.aggr_and_comp.task3.entity.Region;
import oskerko.aggr_and_comp.task3.entity.State;

public class Logic {

	public Region createRegion(String name, City city) {
		ArrayList<City> regList = new ArrayList<City>();
		regList.add(city);
		return new Region(name, regList);
	}

	public void addCityToRegion(Region region, City city) {
		region.getRegion().add(city);
	}

	public void regionSquare(Region reg) {
		double square = 0;
		List<City> regList = reg.getRegion();

		for (int i = 0; i < regList.size(); i++) {
			square = square + regList.get(i).getSquare();
		}
		reg.setSquare(square);
	}

	public void regionPopulation(Region reg) {
		int population = 0;
		List<City> regList = reg.getRegion();

		for (int i = 0; i < regList.size(); i++) {
			population = population + regList.get(i).getPopulation();
		}
		reg.setPopulation(population);
	}

	public State ctreateState(String name, Region region) {
		ArrayList<Region> stateList = new ArrayList<Region>();
		stateList.add(region);
		return new State(name, stateList);
	}

	public void addRegionToState(State state, Region region) {
		state.getState().add(region);
	}

	public void stateSquare(State state) {
		double square = 0;
		List<Region> stateList = state.getState();

		for (int i = 0; i < stateList.size(); i++) {
			square = square + stateList.get(i).getSquare();
		}
		state.setSquare(square);
	}

	public void statePopulation(State state) {
		int population = 0;
		List<Region> stateList = state.getState();

		for (int i = 0; i < stateList.size(); i++) {
			population = population + stateList.get(i).getPopulation();
		}
		state.setPopulation(population);
	}

	public Federation ctreateFederation(String name, State state) {
		ArrayList<State> federationList = new ArrayList<State>();
		federationList.add(state);
		return new Federation(name, federationList);
	}

	public void addStateToFederation(Federation federation, State state) {
		federation.getFederation().add(state);
	}

	public void federationSquare(Federation federation) {
		double square = 0;
		List<State> federationList = federation.getFederation();

		for (int i = 0; i < federationList.size(); i++) {
			square = square + federationList.get(i).getSquare();
		}
		federation.setSquare(square);
	}

	public void federationPopulation(Federation federation) {
		int population = 0;
		List<State> federationList = federation.getFederation();

		for (int i = 0; i < federationList.size(); i++) {
			population = population + federationList.get(i).getPopulation();
		}
		federation.setPopulation(population);
	}

	public void printCapital(Federation federation) {
		String capital = "";
		List<State> stateList = federation.getFederation();
		for (int i = 0; i < stateList.size(); i++) {
			List<Region> regList = stateList.get(i).getState();

			for (int j = 0; j < regList.size(); j++) {
				List<City> cityList = regList.get(j).getRegion();

				for (int k = 0; k < cityList.size(); k++) {
					if (cityList.get(k).isCapital() == true) {
						capital = cityList.get(k).getName();
					}
				}
			}
		}
		System.out.println("Столица: " + capital);
	}

	public void printStateCenter(Federation federation) {
		ArrayList<String> stateCenter = new ArrayList<String>();
		List<State> stateList = federation.getFederation();
		for (int i = 0; i < stateList.size(); i++) {
			List<Region> regList = stateList.get(i).getState();

			for (int j = 0; j < regList.size(); j++) {
				List<City> cityList = regList.get(j).getRegion();

				for (int k = 0; k < cityList.size(); k++) {
					if (cityList.get(k).isStatenCentre() == true) {
						stateCenter.add(cityList.get(k).getName());
					}
				}
			}
		}
		System.out.print("Обл центры: ");
		for (int m = 0; m < stateCenter.size(); m++) {
			System.out.print(stateCenter.get(m) + ", ");
		}
		System.out.println();
	}

}
