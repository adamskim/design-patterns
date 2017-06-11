package pl.adamskim.dp.command.cmd;

import java.util.List;

import pl.adamskim.dp.command.player.Player;

public class PlayFileListCommand implements Command {

	private Player player;
	private List<String> fileList;

	public PlayFileListCommand(Player player, List<String> fileList) {
		this.player = player;
		this.fileList = fileList;
	}
	
	@Override
	public void execute() {
		for (String file : fileList) {
			new LoadFileCommand(player, file).execute();
			new PlayFileCommand(player).execute();
		}
	}
	
	@Override
	public void undo() {
		player.stop();
		player.closeFile();
	}
}
