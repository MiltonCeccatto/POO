package br.edu.ifsul.bcc.too.teste;
import java.util.Scanner;
/**
 * Exercício: Criar rotina para ler dois valores e imprimir a média
 * opção: por interface gráfica. (javax.swing.JOoptionPane)
 * opção: Por linha de comando. (java.util.Scanner)
 * */
public class ExemploMedia {

    public  ExemploMedia(){

    }

    public  float media(float v1, float v2){
        return (v1 + v2)/2.0f;
    }

    public  static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe um número: ");
        float n1 = ler.nextFloat();
        ler.nextLine();
        System.out.printf("Informe um número: ");
        float n2 = ler.nextFloat();
        ler.nextLine();

        ExemploMedia ex = new ExemploMedia();
        float resultado = ex.media(n1, n2);

        System.out.printf("Resultado: " + resultado);


    }

}
