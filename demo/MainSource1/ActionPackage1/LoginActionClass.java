package ActionPackage1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import LocatorPackage1.LoginLocatorClass;
import UtilsPackage1.HelperClass;

public class LoginActionClass {
	
	LoginLocatorClass log = null;
	
    public LoginActionClass() {
    	
        this.log= new LoginLocatorClass();
        
        PageFactory.initElements(HelperClass.getDriver(),log);
    }
    
	public void enterUserName(String name) {
		log.userId.sendKeys(name);
		HelperClass.sleep(1000);
	}

	public void enterPassword(String pass) {
		// TODO Auto-generated method stub
		log.pass.sendKeys(pass);
		log.pass.sendKeys(Keys.ENTER);
		HelperClass.sleep(1000);
	}

}
