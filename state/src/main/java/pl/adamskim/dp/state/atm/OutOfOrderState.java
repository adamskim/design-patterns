package pl.adamskim.dp.state.atm;

public class OutOfOrderState implements ATMState {

	@Override
	public void insertCard() {
		System.out.println("Out of order!");
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Out of order!");
	}

	@Override
	public void requestMoney(int amount) {
		System.out.println("Out of order!");
	}

	@Override
	public void ejectCard() {
		System.out.println("Out of order!");
	}

}
