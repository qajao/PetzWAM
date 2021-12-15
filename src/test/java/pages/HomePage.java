package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    // Mapeamento de elementos
    @FindBy(id = "search")
    private WebElement txtInputSearch;

    @FindBy(css = "button-search")
    private WebElement btnSearch;



    // Construtor
    public HomePage(WebDriver driver, Base base) {
        super(driver);
    }

    // Acoes dos elementos

    public void search(String product){
        this.txtInputSearch.click(); // Clicar na caixa de pesquisa
        this.txtInputSearch.clear(); // limpar o conteudo da caixa de texto
        this.txtInputSearch.sendKeys(product); // Digite o texto na caixa de pesquisa
    }

    public void searchWithMagnifierButton(String product) {
        search(product);
        this.btnSearch.click(); // Clicar no botao de busca
    }

    public void searchWithEnter(String product){
        search(product);
        this.txtInputSearch.sendKeys(Keys.ENTER); // Apertar tecla Enter

    }
}
