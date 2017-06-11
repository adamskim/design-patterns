package pl.adamskim.dp.observer;

public class MarketShareApplication {
	public static void main(String[] args) {
		StockMarketService marketService = new StockMarketService("PZU", "KGHM", "PKO");
		marketService.registerObserver(new SendAlarmStockObserver(200));
		marketService.registerObserver(new PrintPricesStockObserver());
		marketService.generatePrices();		
		marketService.generatePrices();		
		marketService.generatePrices();		
	}
}
