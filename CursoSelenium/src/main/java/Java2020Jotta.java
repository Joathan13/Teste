
public class Java2020Jotta {
	
	import static org.junit.Assert.assertArrayEquals;
	import static org.junit.Assert.assertEquals;

	import java.awt.Dimension;
	import java.sql.Driver;
	import java.sql.DriverManager;

	import org.eclipse.jetty.util.preventers.DriverManagerLeakPreventer;
	import org.junit.Assert;
	import org.junit.Test;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.ie.InternetExplorerDriverService;
	import org.openqa.selenium.interactions.ClickAction;
	import org.openqa.selenium.interactions.SendKeysAction;
	import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
	import org.openqa.selenium.remote.service.DriverService;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.collect.Interners;

	public class TesteGoogle {

		@Test 
		public void teste() {
			                   System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
			               System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
			
	                     WebDriver driver = new FirefoxDriver(); 
		            WebDriver driver = new ChromeDriver();
		                           // NÃO FUNCIONOUWebDriver driver = new InternetExplorer();
	        river.manage().window()setsize()new Dimension(1200, 765)):S
		    
			
		driver.get("file:///C:/Users/55119/eclipse-workspace/CursoSelenium/src/main/resources/componentes.html");
			
		              System.out.println(driver.getTitle());
		    
		       Assert.assertEquals("Campo de Treinamento", driver.getTitle());
		    
		              
		       driver.findElement(By.id("elementosForm:nome")).sendKeys("JOATHAN ");
		    driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("JULIO");
		//driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("Value") 
		   //OCORREU ERRO.Assert.assertEquals("Texto de Escrita", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("Value"));
		    
		 new Select(driver.findElement(By.id("elementosForm:esportes")))
		 .selectByVisibleText("Natacao");
		 
		 
		             driver.findElement(By.id("elementosForm:sugestoes")).sendKeys
		             ("Texto de Teste 3\njoathan(\nbarra N)é para pular linhas");
		   
		          driver.findElement(By.id("elementosForm:sexo")).click();
		  
		     driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		     
		   WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		   Select combo = new Select(element); 
		 //combo.selectByIndex(7);
		   // OU PODE SER POR VALOR combo.deselectByValue("superior");
		   // OU POR VALOR VISTO combo.selectByVisibleText("2o grau incompleto");
		   
		 combo.selectByIndex(4);
		 //combo.selectByIndex(6);
		 //combo.selectByIndex(3);
		driver.findElement(By.id("buttonSimple")).click();
		driver.findElement(By.linkText("Voltar")).click();
		//driver.findElement(By.tagName("body"));
		System.out.println(driver.findElement(By.tagName("body"))
				.getText().contains("Campo de Treinamento"));
		 
		Assert.assertEquals("Cuidado onde clica, muitas armadilhas...",
		 driver.findElement(By.className("facilAchar")).getText());
		 
	//driver.findElement(By.id("alert")).click();
	            
	          //driver.findElement(By.id("confirm")).click(); 
	        //Alert alerta = driver.switchTo().alert();
	         //PARA DAR OK - 
	       // alerta.accept();
	        // PARA CANCELAR - alerta.dismiss();Assert.assertEquals("Negado", alerta.getText());
	         //alerta.accept();
	        
	        // PARA CONFIRMAR alerta.accept();
		///driver.findElement(By.id("Prompt")).click();
		//Alert alerta = driver.switchTo().alert();
		//Assert.assertEquals("Digite um numero", alerta.getText());
	      // alerta.sendKeys("12"); 
	      // alerta.accept();
	       //Assert.assertEquals("Era 12?", alerta.getText());
	       // alerta.accept();
	              //Assert.assertEquals(":D", alerta.getText());
	                //alerta.accept();
		//driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		driver.switchTo().frame("frame1"); 
		
		driver.findElement(By.id("frameButton")).click();
		driver.findElement(By.id("elementosForm:nome")).

	        
	        
	           
				 
				 
				 
				//driver.quit();	
				   
		    
		     
	    }
	}


}
