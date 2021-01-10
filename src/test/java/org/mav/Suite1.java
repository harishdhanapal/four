package org.mav;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



public class Suite1 {

	@Test
	public void tc1() {
		// TODO Auto-generated method stub

		Result rc = JUnitCore.runClasses(SuiteA.class,SuiteB.class);
		
		System.out.println("runtime:"+rc.getRunTime());
		System.out.println("run count:"+rc.getRunCount());
		System.out.println("failure count"+rc.getFailureCount());
		System.out.println("ignore count"+rc.getIgnoreCount());
	
		
		 List<Failure> f = rc.getFailures();
		
		 for (Failure failure : f) {
			
			 System.out.println(failure);
			 
		}
		 
		 
	}
	
	
}




