package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CadastroPage {
    WebDriver driver;
    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://automacaocombatista.herokuapp.com/users/new");
        assertTrue("Não acessou a aplicação", driver.findElement(By.xpath("//h5[@class='center']")).isDisplayed());
    }
    public void preencherFormulario(){
        driver.findElement(By.id("user_name")).sendKeys("Teste");
        driver.findElement(By.id("user_lastname")).sendKeys("Tester QA");
        driver.findElement(By.id("user_email")).sendKeys("teste@teste.com");
        driver.findElement(By.id("user_address")).sendKeys("Rua dos alfeneiros 4");
        driver.findElement(By.id("user_university")).sendKeys("Hogwarts");
        driver.findElement(By.id("user_profile")).sendKeys("Tester");
        driver.findElement(By.id("user_gender")).sendKeys("Masculino");
        driver.findElement(By.id("user_age")).sendKeys("30");
    }
    public void clicarBotaoCriarUsuario(){
        driver.findElement(By.name("commit")).click();
    }
    public void validarCadastro(){
        String texto_confirm = driver.findElement(By.id("notice")).getText();
        String criadoComSucesso = "Usuário Criado com sucesso";
        assertEquals(criadoComSucesso, texto_confirm);
    }

    public void clicarBotaoVoltar(){
        driver.findElement(By.xpath("//a[@class='btn waves-light red']")).click();
    }

    public void validarTelaListaUsuarios(){
        String userList = driver.findElement(By.className("center")).getText();
        System.out.println(userList);
    }
}
