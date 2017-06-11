package pl.adamskim.dp.strategy.calculation;

import pl.adamskim.dp.strategy.order.Order;

public interface PriceCalculationStrategy {

	double calculateFinalPrice(Order order);
}
