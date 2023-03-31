import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";", 4);
        
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        
        for(String ingredientesLanche : listaIngredientes){ 
          System.out.println(ingredientesLanche);
        }
    
}
