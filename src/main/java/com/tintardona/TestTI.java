package com.tintardona;

// Front end for automation framework seltest
// will take parameters:
// String build = url of site to launch or apk/ipk of app, could possibly take in multiple urls and run multiple suites
// String[] testSuite: names of tests to run
// driverConfig Desired capabilites for automation driver for now pass chromedriver
// can possibly pass other data, login credentials etc.

public class TestTI {
    public static void main(String[] args) {

        // Process args
        // String url = args[0];
        // String testSuite = args[1];
        System.out.println(args[0]);
        System.out.println(args[1]);
        // Find the test to run
        // we want to take the argument string and execute the testSuite with the
        // parameters and configuration
        //

    }

}
