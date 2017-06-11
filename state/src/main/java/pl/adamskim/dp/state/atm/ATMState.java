package pl.adamskim.dp.state.atm;

public interface ATMState {
	void insertCard();
	void enterPin(int pin);
	void requestMoney(int amount);
	void ejectCard();
}
