package com.buddybuild.bbandroidsampletests;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Utility class created to log test events
 * Created by Gary on 2/25/2017.
 */
public class BBLoggerUtil {

    /**
     * enum used as possible test status: success and failed
     */
    public enum TEST_STATUS {
        SUCCESS,
        FAILURE
    }

    public BBLoggerUtil() {

    }

    public void log(String message) {
        System.out.print(message);
    }

    /**
     * Starts the logging for each test by returning the time when it started
     *
     * @param methodName name of the test method
     * @return current system time in milliseconds
     */
    public long startLog(String methodName) {
        log("BuddyBuild Starting Test: " + methodName + "\n");

        return System.currentTimeMillis();
    }

    /**
     * Logs the end of a test method
     *
     * @param methodName name of the test method
     * @param startTime  time when the test first started
     * @param status     status is SUCCESS or FAILURE
     */
    public void endLog(String methodName, long startTime, TEST_STATUS status) {
        // determining how long the test took to run
        NumberFormat formatter = new DecimalFormat("#0.000");
        long calculatedTime = (System.currentTimeMillis() - startTime);

        String result = String.format("BuddyBuild Finished Test: %s [%ss] - %s",
                methodName,
                formatter.format(calculatedTime / 1000L),
                status.name());
        log(result);
    }
}
