//Algoritmo feito por Kauê Andrade dos Santos

import java.util.ArrayList; //Importa java.util.ArrayList
import java.util.Scanner; //Importa java.util.Scanner

public class Exemplo4 {
    public static void main(String[] args){

        int posicaoVetor = 0; //posicaoVetor recebe 0

        Scanner ler = new Scanner(System.in); //Criamos um scanner

        // O array serve para armazenar vários valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[5]

        //Uma sala escolar quer armazenar 3 notas, para isso iremos criar um array, armazenar, consultar, alterar e deletar dados

        ArrayList<Double> notas = new ArrayList<Double>(); //Cria um array com o tipo Double que dá a possibilidade de armazenar 5 nomes
        //0, 1, 2, 3...

        notas.add(0, 6.8); //Armazena a nota 6.8 na posição 0
        notas.add(1, 5.5); //Armazena a nota 5.5 na posição 1
        notas.add(2, 9.8); //Armazena a nota 9.8 na posição 2
        notas.add(3, 6.1); //Armazena a nota 6.1 na posição 3
        notas.add(4, 7.6); //Armazena a nota 7.6 na posição 4

        System.out.println("\nArray versão inicial: " + notas); //Imprime a array notas

        //Estrutura básica para realizar o input

        System.out.print("\nPrimeira posição que deseja consultar: "); //Imprime a mensagem
        int primeiraposi = ler.nextInt();

        System.out.println("\nNome na posição " + primeiraposi + ": " + notas.get(primeiraposi) + "\n"); //Consulta o nome na posição desejada pelo usuário

        System.out.print("Segunda posição que deseja consultar: "); //Imprime a mensagem
        int segundaposi = ler.nextInt();

        System.out.println("Nome na posição " + segundaposi + ": " + notas.get(segundaposi) + "\n"); //Consulta o nome na posição desejada pelo usuário

        notas.set(3, 8.2); //Altera a nota do índice 3 para 8.2

        notas.remove(0); //Remove a nota no índice 2

        System.out.println("\nArray versão final: " + notas + "\n"); //Imprime a array notas

        //posicaoVetor < 4 porque temos 3 números

        while (posicaoVetor < 4){ //Usa o laço de repetição while (enquanto) e cria a variável do tipo int denominada posicaoVetor
            System.out.println("Número na posição " + posicaoVetor + ": " + notas.get(posicaoVetor) + " "); //Imprime a nota correspondente a posicaoVetor
            posicaoVetor++; //posicaoVetor recebe + 1
        }
    }
}