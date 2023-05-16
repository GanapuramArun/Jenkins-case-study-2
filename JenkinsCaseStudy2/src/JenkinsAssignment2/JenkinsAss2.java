package JenkinsAssignment2;

import org.testng.annotations.Test;

public class JenkinsAss2 {
	
	@Test(groups = {"Apple"})
public void Apple1() {
	System.out.println("Test Apple Device.");
}

	@Test(groups = {"M1"})
public void M1() {
	System.out.println("Test Apple Device.");
}

	@Test(groups = {"motog"})
public void motog() {
	System.out.println("Test Apple Device.");
}

	@Test(groups = {"lenova"})
public void lenova() {
	System.out.println("Test Apple Device.");
}



}
