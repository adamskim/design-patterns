package pl.adamskim.dp.command.player;

public class MusicPlayer implements Player {

	private String filename;

	@Override
	public void loadFile(String filename) {
		System.out.println("Load music file: " + filename);
		this.filename = filename;
	}

	@Override
	public void play() {
		System.out.println("Play music file: " + filename);
	}

	@Override
	public void stop() {
		System.out.println("Stop playing music file: " + filename);
	}
	
	@Override
	public void closeFile() {
		System.out.println("Close music file: " + filename);
		filename = null;
	}

}
