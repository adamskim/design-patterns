package pl.adamskim.dp.strategy.calculation;

import pl.adamskim.dp.strategy.order.Order;

public class DefaultPriceCalculation implements PriceCalculationStrategy {
	@Override
	public double calculateFinalPrice(Order order) {
		return order.getItems().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
	}
}
