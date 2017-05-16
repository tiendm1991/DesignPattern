package tiendm.pattern.chainResponsibility;

public class Demo {
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
	    loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
	    loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.");
	    loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
	}
	
	private static AbstractLogger getChainOfLoggers(){
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
}
