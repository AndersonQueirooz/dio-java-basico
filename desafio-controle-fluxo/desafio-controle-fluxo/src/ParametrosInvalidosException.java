public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    public ParametrosInvalidosException() {
        this("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
