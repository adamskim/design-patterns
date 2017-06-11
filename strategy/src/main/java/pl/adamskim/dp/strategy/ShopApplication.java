package pl.adamskim.dp.strategy;

import pl.adamskim.dp.strategy.calculation.DefaultPriceCalculation;
import pl.adamskim.dp.strategy.calculation.DiscountPriceCalculationStrategy;
import pl.adamskim.dp.strategy.calculation.MultiPriceCalculationStrategy;
import pl.adamskim.dp.strategy.order.Order;
import pl.adamskim.dp.strategy.order.OrderService;
import pl.adamskim.dp.strategy.payment.BankTransferPaymentStrategy;
import pl.adamskim.dp.strategy.payment.PayPalPaymentStrategy;

public class ShopApplication {
	public static void main(String[] args) {
		OrderService orderService = new OrderService();
		Order order = new Order();
		order.addItem("Galaxy S7", 2000, 2);
		order.addItem("�adowarka", 100, 3);
		
		orderService.setPriceCalculationStrategy(new DefaultPriceCalculation());
		orderService.setPaymentStrategy(new PayPalPaymentStrategy());
		orderService.getFinalPrice(order);
		orderService.processPayment(order);
		
		orderService.setPriceCalculationStrategy(new DiscountPriceCalculationStrategy(10));
		orderService.setPaymentStrategy(new BankTransferPaymentStrategy());
		orderService.getFinalPrice(order);
		orderService.processPayment(order);

		orderService.setPriceCalculationStrategy(new MultiPriceCalculationStrategy());
		orderService.getFinalPrice(order);
		orderService.processPayment(order);
		
	}
}

