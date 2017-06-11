package pl.adamskim.dp.command.cmd;

import pl.adamskim.dp.command.player.Player;

public class PlayFileCommand implements Command {
	
	private Player player;

	public PlayFileCommand(Player player) {
		this.player = player;
	}

	@Override
	public void execute() {
		player.play();
	}
	
	@Override
	public void undo() {
		player.stop();
	}

}
