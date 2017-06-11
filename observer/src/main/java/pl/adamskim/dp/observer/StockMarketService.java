package pl.adamskim.dp.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StockMarketService implements Subject {

	private String[] companies;
	private List<StockObserver> observers = new ArrayList<>();
	private Map<String, Integer> sharePrices = new HashMap<String, Integer>(); 

	public StockMarketService(String...companies) {
		this.companies = companies;
	}
	
	public void generatePrices() {
		System.out.println("----- Market Service Generated new prices -----");
		for (String company : companies) {
			sharePrices.put(company, new Random().nextInt(1000));
		}
		notifyObservers();
	}

	@Override
	public void registerObserver(StockObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(StockObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.notify(sharePrices));
	}
	
}
