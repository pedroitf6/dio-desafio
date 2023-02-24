
/*ClASSE
 * É uma estrutura que abstrai um conjunto de objetos com
 * características similares. Uma classe define o comportamento
 * de seus objetos através de métodos e os estados possíveis
 * destes objetos através de atributos. Em outros termos, uma 
 * classe descreve os serviços providos por seus objetos e quais
 * informações eles podem armazenar.
 * 
 * EX: public class Carro {
 * }
 * 
 */

public class Carro {

    /*ATRIBUTO
     * É o elemento de uma classe responsável por definir sua
     * estrutura de dados. O conjunto destes será responsável
     * por representar suas características e fará parte dos
     * objetos criados a partir da classe.
     * 
     * EX:
     * String cor;
     * String modelo;
     * int capacidadeTanque;
     * 
     */

    String cor;
    String modelo;
    int capacidadeTanque;
    
    
    

    /*METODO
     *É uma porção de código (sub-rotina) que é disponibilizada pela classe.
     * Este é executado quando é feita uma requisição a ele. Um método serve para 
     * identificar quais serviços, ações, que a classe oferece. Eles são responsáveis 
     * por definir e realizar um determinado comportamento
     * 
     * Construtor
     * Ex: Carro (){
     * }
     * 
     * Destrutor
     * Ex: void finalize (){
     * }
     * 
     * Sobrecarga
     * EX: m1()
     * m1(int i)
     * m1(float f)
     * m1(String s, long l)
     * 
     */

// -------------Construtor inicio aqui --------------
     Carro(){

     }

     public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

// -------------Construtor fim aqui --------------


// -------------GET e SET inicio aqui --------------
    public String getCor() {
        return cor;
    }
        
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
// -------------GET e SET fim  aqui --------------


    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel ;

    }


}
