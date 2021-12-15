package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // objeto do selenium WebDriver, vulgo bola
    // ao usar PageFactory mudar de public para protected

    // Criar um construtor e inicializar os eleminetos da PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
