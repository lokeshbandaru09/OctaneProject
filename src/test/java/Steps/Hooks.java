package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hooks extends BaseUtil {


    private BaseUtil base;
    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @BeforeClass
    public void intializeTest (){

    }

    @AfterClass
    public void DemonatizeTest(){

    }

    @AfterTest
    public void AfterTest(){

    }

  @Test
    public void Test(){}
}
