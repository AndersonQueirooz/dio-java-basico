import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        imprimirSelecionados();
    }

    static void imprimirSelecionados() { // Método que imprime os candidatos selecionados
        String[] candidatos = { "Ana", "Bia", "Carlos", "Daniel", "Rafaela" }; // Array com os nomes dos candidatos
        System.out.println("Imprimindo a lista de candidatos selecionados para o processo seletivo");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato selecionado foi: " + candidatos[i]);
        }
    }

    static void selecaoCandidatos() { // Método que seleciona candidatos até preencher 5 vagas de acordo com o salário pretendido
        String[] candidatos = { "Ana", "Bia", "Carlos", "Daniel", "Rafaela", "Gui", "Rebeca", "Arthur", "Paula",
                "João" }; // Array com os nomes dos candidatos
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { // Enquanto não preencher 5 vagas e houver candidatos
            String candidato = candidatos[candidatoAtual]; // Pega o nome do candidato atual
            double salarioPretendido = valorPretendido(); // Chama a função que retorna o valor pretendido

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200); // Função que retorna um valor randomico entre 1800 e 2200
    }

    static void analisarCandidato(double salarioPretendido) { // Método que analisa o candidato de acordo com o salário pretendido
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardar o resultado dos demais candidatos.");
        }
    }
}
