package pl.adamskim.dp.command.player;

public interface Player {
	void loadFile(String filename);
	void play();
	void stop();
	void closeFile();
}
