package com.buddybuild.bbandroidsampletests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StringUnitTest {

    BBLoggerUtil mLoggerUtil;

    @Before
    public void setUp() {
        mLoggerUtil = new BBLoggerUtil();
    }

    @Test
    public void length_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("length_isCorrect");
        BBLoggerUtil.TEST_STATUS status = BBLoggerUtil.TEST_STATUS.SUCCESS;
        try {
            assertEquals(4, "test".length());
        } catch (AssertionError ae) {
            status = BBLoggerUtil.TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("length_isCorrect", startTime, status);
        }
    }

    @Test
    public void substring_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("substring_isCorrect");
        BBLoggerUtil.TEST_STATUS status = BBLoggerUtil.TEST_STATUS.SUCCESS;
        try {
            assertEquals("ha", "sha".substring(1));
        } catch (AssertionError ae) {
            status = BBLoggerUtil.TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("substring_isCorrect", startTime, status);
        }
    }

    @Test
    public void indexOf_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("indexOf_isCorrect");
        BBLoggerUtil.TEST_STATUS status = BBLoggerUtil.TEST_STATUS.SUCCESS;
        try {
            assertEquals(3, "hello".indexOf("lo"));
        } catch (AssertionError ae) {
            status = BBLoggerUtil.TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("indexOf_isCorrect", startTime, status);
        }
    }
}