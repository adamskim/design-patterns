package pl.adamskim.dp.command.player;

public class VideoPlayer implements Player {

	private String filename;

	@Override
	public void loadFile(String filename) {
		System.out.println("Load video file: " + filename);
		this.filename = filename;
	}

	@Override
	public void play() {
		System.out.println("Play video from file: " + filename);
	}

	@Override
	public void stop() {
		System.out.println("Stop playing video from file: " + filename);
	}
	
	@Override
	public void closeFile() {
		System.out.println("Close video file: " + filename);
		filename = null;
	}

}
