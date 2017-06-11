package pl.adamskim.dp.strategy.calculation;

import pl.adamskim.dp.strategy.order.Order;
import pl.adamskim.dp.strategy.order.OrderItem;

public class MultiPriceCalculationStrategy implements PriceCalculationStrategy {

	@Override
	public double calculateFinalPrice(Order order) {
		double finalPrice = 0;
		for (OrderItem item : order.getItems()) {
			int discount = calculateDiscountProcent(item.getQuantity());
			finalPrice += (item.getPrice() - ((item.getPrice() * discount) / 100)) * item.getQuantity();
		}
		return finalPrice;
	}
	
	private int calculateDiscountProcent(int quantity) {
		int percent = 0;
		if (quantity >= 50) {
			percent = 50;
		} else if (quantity > 1) {
			percent = quantity;
		}
		return percent;
	}

}
