import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SalvandoMusicas {
    public static void main(String[] args) {
    
        
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        List<String> arquivos = new ArrayList<>();
        
        arquivos.add(arquivoDoPc.toLowerCase());
        
        for(String arquivo : arquivos) {
            if(arquivo.contains(".mp3")){
                System.out.println("Salvar " + arquivo);
                
            }else{
                System.out.println("Deletar " + arquivo);
                arquivos.remove(arquivo);
            }

            System.out.println(arquivos);
        }


    }
}

