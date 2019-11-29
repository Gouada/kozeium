package core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class DateUtils {

    private static Calendar tmps = Calendar.getInstance();
    private static SimpleDateFormat sdf;

    public static String getMonthStr() {
        sdf = new SimpleDateFormat("M");
        String monthStr = sdf.format(tmps.getTime());
        return monthStr.substring(0, 3);
    }

    public static String getNextMonday() {
        int nexMonday = Calendar.MONDAY;
        String nextMondayStr = "";
		/*int currentDay = 
			if(currentDay != 1)
			{
			 nexMonday = (7-currentDay) + tmps.DAY_OF_MONTH;
			}
			*/
        nextMondayStr = "Montag, " + nexMonday + ". " + getMonthStr() + " Verfügbar";
        return nextMondayStr;
    }

    public static String getNextFriday() {
        sdf = new SimpleDateFormat("M");
        return "Freitag, " + Calendar.FRIDAY + ". " + getMonthStr() + " Verfügbar";
    }

    public static String getRandomDate() {
        Random rand = new Random();
        int today = Calendar.DAY_OF_MONTH;
        int randomDay = rand.nextInt(30 - today);

        //return tmps.DAY_OF_WEEK + "
        //int randomDate = tmps.DAY_OF_MONTH +
        return null;
    }
}
