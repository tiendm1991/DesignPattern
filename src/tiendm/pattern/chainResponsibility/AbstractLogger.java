package tiendm.pattern.chainResponsibility;

public abstract class AbstractLogger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	
	protected int level;
	protected AbstractLogger nextLogger;
	
	public void logMessage(int level, String message){
		if(this.level <= level){
			write(message);
		}
		if(nextLogger!=null){
			nextLogger.logMessage(level, message);
		}
	}
	
	public abstract void write(String message);
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public AbstractLogger getNextLogger() {
		return nextLogger;
	}
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
}
