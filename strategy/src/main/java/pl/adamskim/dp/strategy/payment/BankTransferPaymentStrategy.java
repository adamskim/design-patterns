package pl.adamskim.dp.strategy.payment;

import pl.adamskim.dp.strategy.order.Order;

public class BankTransferPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(Order order) {
		System.out.println("Zap�acono przelewem");
	}};
