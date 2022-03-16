package parameterization;

import org.testng.annotations.Test;

public class jenkinsparameter {

	
	@Test
	public void test() {
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
}
