package pl.adamskim.dp.observer;

import java.util.Map;

public interface StockObserver {
	void notify(Map<String, Integer> sharePrices);
}
