package pl.adamskim.dp.command.cmd;

import pl.adamskim.dp.command.player.Player;

public class LoadFileCommand implements Command {
	
	private Player player;
	private String filename;

	public LoadFileCommand(Player player, String filename) {
		this.player = player;
		this.filename = filename;
	}
	
	@Override
	public void execute() {
		player.loadFile(filename);
	}
	
	@Override
	public void undo() {
		player.closeFile();
	}

}
