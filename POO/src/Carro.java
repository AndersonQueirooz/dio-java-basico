public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado.");
    }

    private void confereCombustivel() {
        System.out.println("Nível de combustível OK.");
    }

    private void confereCambio() {
        System.out.println("Conferir se o câmbio está em P.");
    }
}