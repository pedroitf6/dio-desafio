import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = frase.split("/", 3);
        
        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        String imovelDisponivel = "Imovel: " + array[0] + " R$" + array[1] + "  " + array[2];
        
        System.out.println(imovelDisponivel);
        
    }
    
}
