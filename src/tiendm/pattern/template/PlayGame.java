package tiendm.pattern.template;

public abstract class PlayGame {
	
	protected void play() {
		initialize();
		start();
		end();
	}

	protected abstract void initialize();
	protected abstract void start();
	protected abstract void end();
}
