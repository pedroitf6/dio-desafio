/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista. 
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, 
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc). 
*/

package collectionsList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercioProposto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        int count = 0;
        while(true){
            if(count == 6) break;

            System.out.println("Digite a temperatura: ");
            Double temp = scanner.nextDouble();
            temperaturas.add(temp);
            count++;
        }

        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t + " "));

         Iterator<Double> iterator = temperaturas.iterator();
         Double soma = 0.0; 
         while(iterator.hasNext()){
             Double proximo = iterator.next();
             soma += proximo;
            }

            Double media = (soma/temperaturas.size());

        System.out.println("Média de temperaturas dos primeiros 6 meses: " + media);

        System.out.println("Temperaturas acima da média: ");
        Iterator<Double> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()){
            Double proximo = iterator1.next();
            if(proximo > media) {
                System.out.println(proximo);
            }
        }
        
    }
    
}