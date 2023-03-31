import java.util.Scanner;

public class CamaroteBlueColdIceClubes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = (tamanhoDaFila / 2) + (tamanhoDaFila % 2);
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        System.out.print(pessoasNoCamarote + " pessoas no camarote");

    }
    
}
