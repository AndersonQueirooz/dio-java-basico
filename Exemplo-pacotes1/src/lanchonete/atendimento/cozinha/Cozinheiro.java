package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural no balcão.");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco natural no balcão.");
    }
    
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
        prepararCombo();
    }

    private void prepararLanche() {
        selecionarIngredientesLanche();
        lavarIngredientes();
        fritarIngredientesLanche();
        System.out.println("Preparando lanche natural.");
    }

    private void prepararVitamina() {
        selecionarIngredientesVitamina();
        baterVitaminaLiquidificador();
        System.out.println("Preparando vitamina.");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando Pão, Salada, Ovo e Carne.");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionando Frutas, Leite e Mel.");
    }

    private void lavarIngredientes() {
        System.out.println("Limpando os ingredientes selecionados.");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Bater os ingredientes no liquidificador.");
    }

    private void fritarIngredientesLanche() {
        System.out.println("Fritando os ingredientes necessários.");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
