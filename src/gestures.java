import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		// Tap gesture learning starting
		
		TouchAction touchpoint = new TouchAction(driver);
		
		WebElement extandableList= driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		touchpoint.tap(tapOptions().withElement(element(extandableList))).perform();
		
		//longpress learn
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement peopleName = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchpoint.longPress(longPressOptions().withElement(element(peopleName)).withDuration(ofSeconds(2))).release().perform();
		//System.out.println(driver.findElementById("Sample menu").isDisplayed());
	}

}
