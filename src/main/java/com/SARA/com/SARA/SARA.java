package com.SARA.com.SARA;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:target/cucumber.json"}
		,features="Feature8"
		,glue= {"step_definition"}
		
		
		
		)
public class SARA {

}
