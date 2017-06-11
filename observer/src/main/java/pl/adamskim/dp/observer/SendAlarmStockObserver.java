package pl.adamskim.dp.observer;

import java.util.Map;

public class SendAlarmStockObserver implements StockObserver {
	
	private int lowLimit;

	public SendAlarmStockObserver(int lowLimit) {
		this.lowLimit = lowLimit;
	}

	@Override
	public void notify(Map<String, Integer> sharePrices) {
		sharePrices.entrySet().stream().filter(sharePrice -> sharePrice.getValue() < lowLimit)
			.forEach(sharePrice -> System.out.println("*** [Alarm] Action price of company " + sharePrice.getKey() + " reduce to: " + sharePrice.getValue()));
	}
}
