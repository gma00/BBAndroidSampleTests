package com.buddybuild.bbandroidsampletests;

import com.buddybuild.bbandroidsampletests.BBLoggerUtil.TEST_STATUS;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FailUnitTest {

    BBLoggerUtil mLoggerUtil;

    @Before
    public void setUp() {
        mLoggerUtil = new BBLoggerUtil();
    }

    @Test
    public void assert_IsNotCorrect() throws Exception {
        long time = mLoggerUtil.startLog("assert_IsNotCorrect");
        TEST_STATUS status = TEST_STATUS.SUCCESS;
        try {
            assertEquals(4, 3);
        } catch (AssertionError ae) {
            status = TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("assert_IsNotCorrect", time, status);
        }
    }
}