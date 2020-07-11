package com.kavinschool.shape;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("ListenerExample.onTestStart");
        System.out.println("result = " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("ListenerExample.onTestSuccess");
        System.out.println("result = " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("ListenerExample.onTestFailure");
        System.out.println("result = " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("ListenerExample.onTestSkipped");
        System.out.println("result = " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("ListenerExample.onTestFailedButWithinSuccessPercentage");
        System.out.println("result = " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("ListenerExample.onTestFailedWithTimeout");
        System.out.println("result = " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("ListenerExample.onStart");
        System.out.println("context = " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("ListenerExample.onFinish");
        System.out.println("context = " + context.getName());
    }
}
