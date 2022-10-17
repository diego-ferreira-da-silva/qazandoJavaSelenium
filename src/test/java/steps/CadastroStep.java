package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runners.RunCucumberTest;

public class CadastroStep extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);
    @Dado("que estou no site de automação com batista na área de cadastro de novo usuário")
    public void que_estou_no_site_de_automação_com_batista_na_área_de_cadastro_de_novo_usuário() {
        cadastroPage.acessarAplicacao();
    }

    @Quando("preencho os dados necessários no formulário")
    public void preencho_os_dados_necessários_no_formulário() {
        cadastroPage.preencherFormulario();
    }

    @Quando("clico no botão criar")
    public void clico_no_botão_criar() {
        cadastroPage.clicarBotaoCriarUsuario();
    }

    @Então("vejo a mensagem Usuário Criado com sucesso")
    public void vejo_a_mensagem_usuário_criado_com_sucesso() {
        cadastroPage.validarCadastro();
    }

    @Dado("que tenha realizado o cadastro")
    public void que_tenha_realizado_o_cadastro() {
        cadastroPage.acessarAplicacao();
        cadastroPage.preencherFormulario();
        cadastroPage.clicarBotaoCriarUsuario();
    }
    @Quando("clico no botão voltar")
    public void clico_no_botão_voltar(){
        cadastroPage.clicarBotaoVoltar();
    }

    @Então("sou direcionado a tela de usuários cadastrados")
    public void sou_recionado_a_tela_de_usuários_cadastrados(){
        cadastroPage.validarTelaListaUsuarios();
    }
}