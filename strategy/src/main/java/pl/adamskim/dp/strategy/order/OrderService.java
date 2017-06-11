package pl.adamskim.dp.strategy.order;

import pl.adamskim.dp.strategy.calculation.PriceCalculationStrategy;
import pl.adamskim.dp.strategy.payment.PaymentStrategy;

public class OrderService {
	
	private PaymentStrategy paymentStrategy;
	private PriceCalculationStrategy priceCalculationStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void setPriceCalculationStrategy(PriceCalculationStrategy priceCalculationStrategy) {
		this.priceCalculationStrategy = priceCalculationStrategy;
	}
	
	public void processPayment(Order order) {
		paymentStrategy.pay(order);
	}
	
	public double getFinalPrice(Order order) {
		double finalPrice = priceCalculationStrategy.calculateFinalPrice(order);
		System.out.println(String.format("Ca�kowita cena zam�wienia wynosi %.2f z�: ", finalPrice));
		return finalPrice;
	}
	
	
}
