package com.tintardona;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testrunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(HeaderTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Result Succesfull: " + result.wasSuccessful());
    }
}