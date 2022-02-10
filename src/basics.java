import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id className, androidUIautomator
		/*
		 * 	xpath syntax
		 *	//tagName[@attribute='value']
		 * 
		 * 
		 */
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		//How to take ID Elements
		
		driver.findElementById("android:id/checkbox").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//How to call index via xpath
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		driver.findElementById("android:id/edit").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		driver.findElementById("android:id/button1").click();
	}

}
