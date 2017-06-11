package pl.adamskim.dp.state;

import pl.adamskim.dp.state.atm.ATMMachine;

public class ClientApplication {
	public static void main(String[] args) {
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.enterPin(1222);
		atmMachine.requestMoney(1000);
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		atmMachine.enterPin(3333);
		atmMachine.enterPin(3333);
		atmMachine.enterPin(3333);
		atmMachine.enterPin(1222);
		atmMachine.requestMoney(50);
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		atmMachine.insertCard();
		atmMachine.enterPin(1222);
		atmMachine.enterPin(1222);
	}
}
