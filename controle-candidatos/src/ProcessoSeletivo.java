import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        entrandoEmContato();
    }
    
    static void entrandoEmContato() { // Método que simula o contato com os candidatos
        String[] candidatos = { "Ana", "Bia", "Carlos", "Daniel", "Rafaela" }; // Array com os nomes dos candidatos
        for (int i = 0; i < candidatos.length; i++) {
            int tentativas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando) {
                    tentativas++;
                } else {
                    System.out.println(
                            "Contato realizado com o candidato " + candidatos[i] + " na tentativa " + tentativas);
                }
            } while (continuarTentando && tentativas <= 3);
            if (atendeu) {
                System.out.println("Candidato " + candidatos[i] + " selecionado.");
            } else {
                System.out.println("Não foi possível contato com o candidato " + candidatos[i]
                        + ", número máximo de tentativas atingido.");
            }
        }
    }
    static boolean atender() { 
        return ThreadLocalRandom.current().nextInt(1, 3) == 1; // Retorna true ou false aleatoriamente
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
