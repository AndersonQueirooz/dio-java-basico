package lanchonete;

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
    }

    public void prepararLanche() {
        System.out.println("Preparando lanche natural.");
    }

    public void prepararVitamina() {
        System.out.println("Preparando vitamina.");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("Selecionando Pão, Salada, Ovo e Carne.");
    }

    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionando Frutas, Leite e Mel.");
    }

    public void lavarIngredientes() {
        System.out.println("Limpando os ingredientes selecionados.");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("Bater os ingredientes no liquidificador.");
    }

    public void fritarIngredientesLanche() {
        System.out.println("Fritando os ingredientes necessários.");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
