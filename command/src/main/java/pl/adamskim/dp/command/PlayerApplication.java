package pl.adamskim.dp.command;
import java.util.Arrays;
import java.util.List;

import pl.adamskim.dp.command.cmd.LoadFileCommand;
import pl.adamskim.dp.command.cmd.PlayFileCommand;
import pl.adamskim.dp.command.cmd.PlayFileListCommand;
import pl.adamskim.dp.command.cmd.StopFileCommand;
import pl.adamskim.dp.command.player.MusicPlayer;
import pl.adamskim.dp.command.player.Player;
import pl.adamskim.dp.command.player.VideoPlayer;


public class PlayerApplication {

	public static void main(String[] args) {
		// create receivers
		Player musicPlayer = new MusicPlayer();
		Player videoPlayer = new VideoPlayer();
		
		// create invoker
		PlayerController playerController;
		
		playerController = new PlayerController(new LoadFileCommand(musicPlayer, "Michael Jackson - Bad.mp3"));
		playerController.pressButton();
		
		playerController = new PlayerController(new PlayFileCommand(musicPlayer));
		playerController.pressButton();
		
		playerController = new PlayerController(new StopFileCommand(musicPlayer));
		playerController.pressButton();
		
		// create invoker with command
		playerController = new PlayerController(new LoadFileCommand(videoPlayer, "Michael Jackson - Bad (video clip).avi"));
		playerController.pressButton();
		
		playerController = new PlayerController(new PlayFileCommand(videoPlayer));
		playerController.pressButton();
		
		playerController = new PlayerController(new StopFileCommand(videoPlayer));
		playerController.pressButton();
		playerController.pressUndo();
		
		List<String> playlist = Arrays.asList("track1.mp3", "track2.mp3", "track3.mp3"); 
		playerController = new PlayerController(new PlayFileListCommand(musicPlayer, playlist));
		playerController.pressButton();
		playerController.pressUndo();
		
	}
}
