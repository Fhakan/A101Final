package StepDefinitions;


import Utilities.GWD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



import java.io.IOException;


public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo Starting....");
    }

    @After
    public void after(Scenario scenario) throws IOException {
        System.out.println("Senaryo End.......");
        System.out.println("Scenario Result = "+ scenario.getStatus());
        System.out.println("Scenario is Failed ?  ="+ scenario.isFailed());




        GWD.quitDriver();
    }



}
