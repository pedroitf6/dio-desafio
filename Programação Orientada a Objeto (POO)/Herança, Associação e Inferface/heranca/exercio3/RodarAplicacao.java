package heranca.exercio3;

public class RodarAplicacao {

    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // SOBRESCRITA COM POLIMORFISMO
        for(ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for(ClasseMae classe: classes){
            classe.metodo2();
        }


// SOBRESCRITA
        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
    
}
