package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListPage extends Base {

    // 1 - Mapeamentos
    @FindBy(css = "h2Categoria nomeCategoria")
    private WebElement lblResultBy;


    // 2 - Construtor
    public ListPage(WebDriver driver) {
        super(driver);
    }

    // 3 - Metodos e funçoes baseadas no mapeamento

    // Le o titulo da guia e retorna o texto
    public String readTitleTab(){
        return driver.getTitle(); // Retorna titula da guia
    }

    // Clique no produto desejado
    public void clickAtDesiredProduct(String product){
        driver.findElement(By.xpath("//h3[contains(text(),'"+ product +"')]")).click();
    }

    // Le a frase Resultado para "Produto"
    public String readResultBy(){
        return this.lblResultBy.getText();
    }
}
