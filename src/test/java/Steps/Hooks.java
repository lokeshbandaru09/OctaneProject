package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.http.client.protocol.RequestAddCookies;




public class Hooks extends BaseUtil {


    private BaseUtil base;
    public Hooks(BaseUtil base) {
        this.base = base;
    }




    @Before
    public void intializeTest (){



       /* DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("requireWindowFocus", true);
        WebDriver driver = new InternetExplorerDriver(capabilities);
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Downloads\\IEDriverServer_x64_3.5.0\\IEDriverServer.exe");
    */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @After
    public void DemonatizeTest(){

    }


}
