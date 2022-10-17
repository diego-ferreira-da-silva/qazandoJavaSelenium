package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.RunCucumberTest;


public class Utils extends RunCucumberTest {

    //Método aguarda até elemento ser clicável em tela. Comentado pois não está em uso.
    /*public void esperarElementoAparecer(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo;
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }*/
}
