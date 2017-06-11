package pl.adamskim.dp.state.atm;


public class ATMMachine implements ATMState {

	private ATMState state;
	private int pinEnterLeftAttempts;
	
	public ATMMachine() {
		state = new NoCardState(this);
		pinEnterLeftAttempts = 3;
	}
	
	void setState(ATMState state) {
		this.state = state;
	}

	@Override
	public void insertCard() {
		state.insertCard();
	}

	@Override
	public void enterPin(int pin) {
		state.enterPin(pin);
	}

	@Override
	public void requestMoney(int amount) {
		state.requestMoney(amount);
	}

	@Override
	public void ejectCard() {
		state.ejectCard();
	}
	
	public int getPinEnterLeftAttempts() {
		return pinEnterLeftAttempts;
	}
	
	public void setPinEnterLeftAttempts(int pinEnterLeftAttempts) {
		this.pinEnterLeftAttempts = pinEnterLeftAttempts;
	}
	
}
