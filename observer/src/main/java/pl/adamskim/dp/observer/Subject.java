package pl.adamskim.dp.observer;

public interface Subject {
	void registerObserver(StockObserver observer);
	void unregisterObserver(StockObserver observer);
	void notifyObservers();
	
}
