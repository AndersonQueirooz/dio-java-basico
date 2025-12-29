public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println("Sigla: " + estado.getSigla() + ", Nome: " + estado.getNome() + ", Nome Maiúsculo: " + estado.getNomeMaiusculo());
        }
    }
}
