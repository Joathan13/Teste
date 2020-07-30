import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class TesteCampoTreinamento {
 @Test
 public void testeTextField() {
	 //WebDriver driver = new FirefoxDriver();
	 WebDriver driver= new ChromeDriver();
	 
	 //WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
	     //driver.manage().window().setSize(new dimension(1200, 765));
	          //driver.get("https://www.mercadolivre.com.br/");
	          //driver.findElement(By.id("h_search-input")).click();
	          //driver.findElement(By.id("h_search-input")).sendKeys("Ventilador de Coluna Mega Turbo 40 Preto 127v");
	          //driver.findElement(By.id("h_search-btn")).click();
	         
	         //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btn-buy\"]/div")));
	          //driver.findElement(By.id("btn-buy")).click();
	         
	          //Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content-middle\"]/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[2]/div[1]/h2")).getText(), "Ventilador de Coluna Mega Turbo 40 Preto");
             

	          
	          
	          //driver.findElement(By.xpath("//*[@id=\"content-middle\"]/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[1]/div/div/picture/img")).click();	         
	          //driver.findElement(By.xpath("//*[@id=\"btn-buy\"]/div/span")).click();
	          
	          //IWebElement element = wait.Until(driver => driver.FindElement(By.Name("q")));
	  //TESTE MERCADO LIVRE ------------------------------
	         
	 
	 driver.get("https://www.netshoes.com.br//");
     driver.findElement(By.xpath("//*[@id=\"search-input\"]")).click();
     driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("mochila");
     driver.findElement(By.xpath("//*[@id=\"header-content\"]/header/div[1]/section[2]/section/form/div/button")).click();

     driver.findElement(By.xpath("//*[@id=\"item-list\"]/div[1]/div[1]/div[2]/a[1]/span")).click();
     driver.findElement(By.xpath("//*[@id=\"buy-button-now\"]/span")).click();
    
     
     
        
}
 


}
