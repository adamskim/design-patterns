package pl.adamskim.dp.state.atm;


public class HasCardState implements ATMState {
	
	private ATMMachine atmMachine;
	
	public HasCardState(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Ups...");
		atmMachine.setState(new OutOfOrderState());
	}

	@Override
	public void enterPin(int pin) {
		if (pin == 1222) {
			System.out.println("Correct pin");
			atmMachine.setState(new CorrectPinState(atmMachine));
		} else {
			System.out.println("Incorect pin!");
			int pinEnterLeftAttempts = atmMachine.getPinEnterLeftAttempts();
			pinEnterLeftAttempts--;
			atmMachine.setPinEnterLeftAttempts(pinEnterLeftAttempts);
			if (pinEnterLeftAttempts == 0) {
				System.out.println("Card blocked. Contact with bank!");
				atmMachine.setState(new NoCardState(atmMachine));
			}
		}
	}

	@Override
	public void requestMoney(int amount) {
		System.out.println("You have to enter pin first!");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected!");
		atmMachine.setState(new NoCardState(atmMachine));
	}

}
