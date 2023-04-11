package commons;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.testng.Reporter;

/**
 * TestNG requires a call to Reporter.log to insert logging statements into the report
 */
public class TestNGAppender extends AppenderSkeleton {

	@Override
	protected void append(LoggingEvent event) {
		Reporter.log(getLayout().format(event) + "<br>");
	}

	@Override
	public void close() {
		Reporter.log("Logging appender is closed");
	}

	@Override
	public boolean requiresLayout() {
		return true;
	}

	/**
	 * Insert log message into ReportNG
	 * 
	 * @param logMessage
	 */
	public void info(String logMessage) {
		Reporter.log(logMessage);
	}

}