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
public class ArithmeticUnitTest {

    BBLoggerUtil mLoggerUtil;

    @Before
    public void setUp() {
        mLoggerUtil = new BBLoggerUtil();
    }

    @Test
    public void addition_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("addition_isCorrect");
        TEST_STATUS status = TEST_STATUS.SUCCESS;
        try {
            assertEquals(4, 2 + 2);
        } catch (AssertionError ae) {
            status = TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("addition_isCorrect", startTime, status);
        }
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("subtraction_isCorrect");
        TEST_STATUS status = TEST_STATUS.SUCCESS;
        try {
            assertEquals(2, 4 - 2);
        } catch (AssertionError ae) {
            status = TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("subtraction_isCorrect", startTime, status);
        }
    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("multiplication_isCorrect");
        TEST_STATUS status = TEST_STATUS.SUCCESS;
        try {
            assertEquals(2, 1 * 2);
        } catch (AssertionError ae) {
            status = TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("multiplication_isCorrect", startTime, status);
        }
    }

    @Test
    public void division_isCorrect() throws Exception {
        long startTime = mLoggerUtil.startLog("division_isCorrect");
        TEST_STATUS status = TEST_STATUS.SUCCESS;
        try {
            assertEquals(2, 4 / 2);
        } catch (AssertionError ae) {
            status = TEST_STATUS.FAILURE;
            throw new AssertionError();
        } finally {
            mLoggerUtil.endLog("division_isCorrect", startTime, status);
        }
    }
}