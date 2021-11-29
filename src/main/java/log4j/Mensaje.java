package log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Mensaje {
	final static Logger logger = LogManager.getLogger(Mensaje.class);
	
	void logMessagesError(String parameter) {
		
		logger.error("Este es un mensaje del tipo Error: "+parameter);
	}
	
	void logMessagesInformativo(String parameter) {
		
		logger.debug("Este es un mensaje del tipo Info: "+parameter);
	}
}