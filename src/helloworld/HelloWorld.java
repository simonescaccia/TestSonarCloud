package helloworld;

import java.util.logging.Logger;
import java.util.logging.Level;

public class HelloWorld{
	
	private static Logger logger = Logger.getLogger("HelloWorld");
	
	public static void main(String[] args) {
		
		logger.log(Level.INFO, "Hello Travis CI!!");
	
		logger.log(Level.INFO, "Try to commit all folder project!!");
	}
}
