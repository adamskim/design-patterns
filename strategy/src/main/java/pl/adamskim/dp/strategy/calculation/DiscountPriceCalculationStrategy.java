package pl.adamskim.dp.strategy.calculation;

import pl.adamskim.dp.strategy.order.Order;
import pl.adamskim.dp.strategy.order.OrderItem;

public class DiscountPriceCalculationStrategy implements PriceCalculationStrategy {
	
	private int discountPercent;

	public DiscountPriceCalculationStrategy(int discountPercent) {
		this.discountPercent = discountPercent;
		
	}

	@Override
	public double calculateFinalPrice(Order order) {
		int finalPrice = 0;
		for (OrderItem item : order.getItems()) {
			float discount = (item.getPrice() * discountPercent) / 100;
			float priceAfterDiscount = item.getPrice() - discount;
			finalPrice += (priceAfterDiscount * item.getQuantity()); 
		}
		return finalPrice;
	}


}
