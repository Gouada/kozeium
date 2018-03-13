package core;

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

	public boolean isExpired(int seconds) {
		int difference = (int) (getTheTimeStamp() - starStamp) / 1000;
		return difference > seconds;
	}

}
