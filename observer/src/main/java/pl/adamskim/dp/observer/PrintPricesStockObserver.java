package pl.adamskim.dp.observer;

import java.util.Map;

public class PrintPricesStockObserver implements StockObserver {

	@Override
	public void notify(Map<String, Integer> sharePrices) {		
		sharePrices.entrySet().stream().forEach(sharePrice-> System.out.println("-> " + sharePrice.getKey() + " : " + sharePrice.getValue()));
	}
}
