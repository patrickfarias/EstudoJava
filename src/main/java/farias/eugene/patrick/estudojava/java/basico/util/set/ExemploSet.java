package farias.eugene.patrick.estudojava.java.basico.util.set;

import java.util.HashSet;
import java.util.TreeSet;

public class ExemploSet {


    public static void main(String[] args) {

       // java util set

        // Nao garante a ordem de insercao

        // serve para grande conjuntos de dados
        // feito para ser performatico, por isso ela NAO PERMITE ORDENAR.

        // nao permite valores repetidos

        // permite adicao e remocao

        // nao permite busca por item especifico

        // Mas ela permite a navegacao atraves de for e iterator com while.


        // EXISTEM TRES IMPLEMENTACOES DE SET


        // HASHSET

        // Quando utilizar:
        // Quando nao e necessario manter ordenacao


        // Ordenacao
        // Nao permite ordenacao e nao permite dado repedido

        // performance
        // Por nao ter ordenacao e dados repetidos, se torna muito performatico.



        //LINKEDHASHSET

        // Quando utilizar:
        // Quando e necessario manter a ordem ordenacao

        // Ordenacao
        // mantem a ordem de insercao

        // performance
        // E a mais lenta por permitir ordenacao

        //TREESET
        // implementacao de arvore binaria

        // Quando utilizar:
        // Quando e necessario alterar a ordem atraves do uso de compartors

        // Ordenacao
        // mantem a ordem de insercao, e pode ser reordenado

        // performance
        // E performatico para leitura. Para modificacao em a necessidade de reordenar, sendo mais lento que LinkedSet.

    }
}
