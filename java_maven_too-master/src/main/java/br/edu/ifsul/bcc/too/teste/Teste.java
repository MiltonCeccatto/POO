package br.edu.ifsul.bcc.too.teste;

public class Teste {
    /** Método construtor
     * - Não tem retorno
     * - O nome do método é o mesmo da classe
     * - Pode se ter mais do que um médodo construtor na classe, no enteanto devem ter assionaturas diferentes
     * -
     * */

    public Teste(){

    }
    /** quaundo for primitivo os tipos de variáveis e passagem de parâmetros por valor*/
    public float funcaoMedia(float v1, float v2){
        return (v1 + v2)/2.0f;
    }
    /** quando for um tipo primitivo com letras maiúsculas quer dizer que este tipo é derivado e possui
     * algumas características próprias e métodos próprios, e estes vão utilizar valores passados por referência
     * */
    public Float funcaoMedia(Float v1, Float v2){
        return (v1 + v2)/2f;
    }

//    public static void  main(String args[]){
//        System.out.println("chamou a function");
//
//        /** Criação da variável/objeto
//         * nesse cado a variável t é Teste
//         * o objeto t está sendo inicializado com uma nova instãncia da classe Teste
//         * */
//        Teste t  = new Teste();
//
//        float media = t.funcaoMedia(33,33);
//
//        System.out.println("Média" + media);
//    }
}
