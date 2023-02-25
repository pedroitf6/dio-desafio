package heranca.exercio2;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
// UPCAST
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

// DOWCAST

        /*Vendedor vendedor1 = (Vendedor) new Funcionario();
        Gerente gerente1 = (Gerente) new Funcionario();
        Faxineiro faxineiro1 = (Faxineiro) new Funcionario();
        */

    }
}
