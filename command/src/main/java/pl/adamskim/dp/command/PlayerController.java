package pl.adamskim.dp.command;

import pl.adamskim.dp.command.cmd.Command;

public class PlayerController {
	private Command command;

	public PlayerController(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
	
	public void pressUndo() {
		command.undo();
	}
}
