//Algoritmo feito por Kauê Andrade dos Santos

import java.util.ArrayList; //Importa java.util.ArrayList

public class Exemplo1 {
    public static void main(String[] args){

        int posicaoVetor = 0; //posicaoVetor recebe 0

        // O array serve para armazenar vários valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[5]

        //Uma escola quer armazenar 4 nomes e depois mostrar no

        ArrayList<String> nomes = new ArrayList<String>();; //Cria um array com o tipo String que dá a possibilidade de armazenar 5 nomes
        //Lembrando: começa da posição 0. 0, 1, 2, 3

        //nomes[0] = "Kauê"; //Armazena o nome Breno Araújo na posição 0
        //nomes[1] = "Breno Araújo"; //Armazena o nome Kauê na posição 1
        //nomes[2] = "João"; //Armazena o nome João na posição 2
        //nomes[3] = "Maria"; //Armazena o nome Maria na posição 3

        nomes.add(0, "Kauê"); //Armazena o nome Breno Araújo na posição 0
        nomes.add(1, "Breno Araújo"); //Armazena o nome Kauê na posição 1
        nomes.add(2, "João"); //Armazena o nome João na posição 2
        nomes.add(3, "Maria"); //Armazena o nome Maria na posição 3

        System.out.println("\nArray versão inicial: " + nomes); //Imprime a array nomes

        System.out.println("\nNome na posição 1: " + nomes.get(1)); //Consulta o nome na posição 1 no array
        System.out.println("Nome na posição 3: " + nomes.get(3)); //Consulta o nome na posição 3 do array

        nomes.set(2, "José"); //Altera o nome do índice 2 para José

        nomes.remove(3); //Remove o nome no índice 3

        System.out.println("\nArray versão final: " + nomes + "\n"); //Imprime a array nomes

        //for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) { //Usa o laço de repetição for e cria a variável do tipo int denominada posicaoVetor
            //System.out.println("Nome na posição" + posicaoVetor + " : " + nomes.get(posicaoVetor) + " "); //Imprime o nome correspondente a posicaoVetor
        //}

        while (posicaoVetor < 5){
            System.out.println("Nome na posição " + posicaoVetor + ": " + nomes.get(posicaoVetor) + " "); //Imprime o nome correspondente a posicaoVetor
            posicaoVetor++; //posicaoVetor recebe + 1
        }
    }
}
