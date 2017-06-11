package pl.adamskim.dp.command.cmd;

import pl.adamskim.dp.command.player.Player;

public class StopFileCommand implements Command {
	
	private Player player;

	public StopFileCommand(Player player) {
		this.player = player;
	}

	@Override
	public void execute() {
		player.stop();
	}
	
	@Override
	public void undo() {
		player.play();
	}

}
