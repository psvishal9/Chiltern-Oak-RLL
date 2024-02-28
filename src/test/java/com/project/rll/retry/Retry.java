package com.project.rll.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private static final int max_Count = 3;

	int retryCount = 0;

	@Override
	public boolean retry(ITestResult result) {

		if (retryCount < max_Count) {
			retryCount++;
			return true;
		}

		return false;
	}

}
