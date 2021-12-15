package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Base {

    // 1 - Mapeamentos
    @FindBy(css = 'div.col-md-9 div.col-md-7.prod-info:nth-child(6) > h1:nth-child(1)')
    private WebElement producTitle;

    @FindBy(css = 'div.price-current')
    private WebElement priceCurrent;

    // 2 - Construtores
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Metodos e funcoes

    // Ler o nome do produto
    public String readProductTitle(){
        return this.producTitle.getText();
    }

    // Ler o preco atual
    public String readPriceCurrent(){
        return this.priceCurrent.getText();
    }


}
