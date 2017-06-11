package pl.adamskim.dp.strategy.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderItem> items = new ArrayList<>();
	
	public void addItem(String productName, int price, int quantity) {
		items.add(new OrderItem(productName, price, quantity));
	}
	
	public List<OrderItem> getItems() {
		return items;
	}

}
