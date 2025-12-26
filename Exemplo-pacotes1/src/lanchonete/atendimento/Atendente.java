package lanchonete.atendimento;

public class Atendente {
    
    public void servindoMesa() {
        pegarLancheNaCozinha();
        pegarPedidoBalcao();
        System.out.println("Servindo a mesa com os pedidos.");
        
    }

    private void pegarLancheNaCozinha() {
        System.out.println("Pegando o lanche na cozinha.");
    }

    public void receberPagamento() {
        System.out.println("Recebendo o pagamento do cliente.");
    }

    void trocarGas() {
        System.out.println("Atendente trocando o gás do fogão.");
    }

    private void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no balcão.");
    }
}
