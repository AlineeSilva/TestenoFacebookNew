package Tests;

import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class UsuarioTest{
    @Test
    public void testAdicionarUmaInformacaoAdicionaldoUsuario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AlineSilvaeSilva\\Documents\\Aline\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("http://www.facebook.com");
        

        //assertEquals(expected: 1,actual: 5);
        navegador.quit();
    }
}
