package pl.adamskim.dp.strategy.payment;

import pl.adamskim.dp.strategy.order.Order;

public class PayPalPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(Order order) {
		System.out.println("Zap�acono przez PayPal serwis");
	}

}
