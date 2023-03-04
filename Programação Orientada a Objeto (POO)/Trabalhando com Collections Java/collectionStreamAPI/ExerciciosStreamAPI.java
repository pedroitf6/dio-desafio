package collectionStreamAPI;

/*
[x] classe anônima
[x] functional interface
Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.
https://www.baeldung.com/java-8-functional-interfaces
[x] Comparator
[x] lambda '->'
É uma função anônima com a qual podemos lidar como um cidadão de língua de primeira classe. Por exemplo, podemos passá-lo ou retorná-lo de um método.
https://www.baeldung.com/java-8-lambda-expressions-tips
[] reference method '::'
É um tipo especial de expressões lambda. Eles costumam ser usado para criar expressões lambda simples fazendo referência a métodos existentes.
https://www.baeldung.com/java-method-references
 
[x] stream - Fluxo de dados que não altera a coleção
https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
https://medium.com/@racc.costa/streams-no-java-8-e-no-java-9-36177c5c3313
https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
[x] operações intermediárias - Permite operações encadeadas
[x] operações finais - Fecha o fluxo
https://www.geeksforgeeks.org/stream-in-java/
---
[x] forEach(new Consumer())
[x] skip()
[x] collect(Collectors.joining())
[x] distinct()
[x] count()
[x] limit()
[x] collect(Collectors.toSet())
[x] map(new Function())
[x] collect(Collectors.toList())
[x] filter (new Function())
[x] sorted()
[x] mapToInt
[x] sum()
[x] average()
[x] ifPresent()
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html
https://www.baeldung.com/java-optional
[x] min
[x] max
*[x] removeIf(new Predicate())
[x] collect(Collectors.groupingBy(new Function())

*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream()
//                 .forEach(System.out::println);
//        numerosAleatorios.forEach(System.out::println);

//        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());
//        System.out.println(numerosAleatorios5Primeiros);

//        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
//        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //.forEach(System.out::println);


//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2))
//                .collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

//        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios1.stream()
//                .average()
//                .ifPresent(System.out::println);
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

//        System.out.println("Remova os valores ímpares: ");
//        numerosAleatorios1.removeIf(integer -> integer % 2 != 0);
//        System.out.println(numerosAleatorios1);
//        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
//        System.out.println(numerosAleatoriosInteger);

//        Para você
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}