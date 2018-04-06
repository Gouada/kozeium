package core;

//this class provide time utility
import java.util.Date;

import org.apache.log4j.Level;

public class Timer {

	public long starStamp;

	public Timer() {
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	public void start() {
		starStamp = new Date().getTime();
	}

	public static long getTheTimeStamp() {
		return new Date().getTime();
	}

	// for checking i.e if a UI-Element appear or disappear after a given number
	// of seconds
	public boolean isExpired(int seconds) {
		int difference = (int) (getTheTimeStamp() - starStamp) / 1000;
		return difference > seconds;
	}

}
