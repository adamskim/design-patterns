package pl.adamskim.dp.state.atm;


public class NoCardState implements ATMState {
	
	private ATMMachine atmMachine;

	public NoCardState(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Card inserted.");
		atmMachine.setState(new HasCardState(atmMachine));
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Insert card first!");
	}

	@Override
	public void requestMoney(int amount) {
		System.out.println("Insert card first!");
	}

	@Override
	public void ejectCard() {
		System.out.println("No card inserted!");
	}

}
