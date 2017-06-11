package pl.adamskim.dp.state.atm;


public class CorrectPinState implements ATMState {
	

	private ATMMachine atmMachine;

	public CorrectPinState(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You have already inserted card!");
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("You have already entered pin.");

	}

	@Override
	public void requestMoney(int amount) {
		System.out.println("Withdrawed " + amount);
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected.");
		atmMachine.setState(new NoCardState(atmMachine));
	}

}
