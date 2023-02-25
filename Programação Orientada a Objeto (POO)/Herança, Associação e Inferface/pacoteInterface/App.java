package pacoteInterface;
public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        calculadora.soma(10, 10);
        calculadora.divisao(20, 10);
        calculadora.multiplicacao(10, 8);
        calculadora.subtracao(10, 8);
    }
}
