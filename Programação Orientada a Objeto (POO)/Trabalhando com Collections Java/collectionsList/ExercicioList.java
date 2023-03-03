package collectionsList;

/*
[x] Iniciar
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
[x] Generics
[x] Diamond Operator
https://www.baeldung.com/java-diamond-operator
[x] toString()
[x] indexOf()
[x] add()
[x] set()
[x] contains()
[x] toString()
[x] get()
[x] Collections.min()
[x] Collections.max()
[x] iterator()
[x] iterator().hasNext()
[x] iterator().next()
[x] size()
[x] remove()
[x] iterator().remove()
[x] clear()
[x] isEmpty()
 */


import java.util.LinkedList;

public class ExercicioList {

    public static void main(String[] args) {
        

        /* Resolva esses exerciocios utilizando os métodos da implementação LinkedList:         */
        
        //Coloque todos os elementos da List ArrayList nessa nova lista: 
        System.out.println("Crie uma lista chamada notas2 ");

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-a: ");
        System.out.println("A nota da primeira posição é: " + notas2.get(0));
        notas2.remove(0);
        System.out.println("A nota da primeira posição foi Excluida !" + notas2);



    }
    
}
