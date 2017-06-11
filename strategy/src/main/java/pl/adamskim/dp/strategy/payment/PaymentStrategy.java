package pl.adamskim.dp.strategy.payment;

import pl.adamskim.dp.strategy.order.Order;

public interface PaymentStrategy {

	void pay(Order order);
}
