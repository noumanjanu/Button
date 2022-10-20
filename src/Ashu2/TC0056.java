package Ashu2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Ashu.General;

public class TC0056
{
	@Test
	public  void tc002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General time = new General(); 
		time.openapplication();
		time.login();
		time.enterframe();
		time.addbutton();
		   time.exitframe();
		time.logout();
		time.closeapplication();
}
}