package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base; // objeto local para comunicar com o objeto da classe extendida

    public Hooks(Base base) {
        this.base = base;
    }

    // Before
    @Before
    public void setUp(){
        // Onde esta o browser
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver.exe");
        // Instanciar o driver do Chrome
        base.driver = new ChromeDriver();
        // Maximizar a tela
        base.driver.manage().window().maximize();
        // Definir a espera implicada do selenium webdriver
        base.driver.manage().timeouts().implicitlyWait((6000, TimeUnit.MILLISECONDS));



    }

    // After
    @After
    public void tearDown(){
        base.driver.quit(); // Destruir o objeto da Selenium
    }
}
