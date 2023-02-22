/*Desafio
Seu sobrinho começou a ganhar mesada dos pais. 
No auge dos seus 8 anos recebendo 50 reais por mês, 
ele quer saber quanto terá se juntar todo o dinheiro, 
sem gastar nada, durante alguns meses. E você, 
como um bom tio com habilidades de programação, vai criar 
um programa que com as entradas do seu sobrinho vai calcular 
automaticamente a quantidade de dinheiro que ele terá em X meses. */

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 


import java.util.Scanner;

public class MesadaSobrinho {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
                       
        int entrada = leitor.nextInt();
        
        int mesada = 50;
        int total = mesada * entrada;
        
        System.out.print(total);
        

    }


}
