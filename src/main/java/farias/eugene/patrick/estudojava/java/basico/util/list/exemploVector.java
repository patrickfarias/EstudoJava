package farias.eugene.patrick.estudojava.java.basico.util.list;

import java.util.*;

public class exemploVector {


    public static void main(String[] args) {

        List<String> esportes  = new Vector<String>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tenis");
        esportes.add("Handbol");

        System.out.println(esportes);

        // metodo set atualiza pela posicao
        esportes.set(1, "Ping Pong");

        // remove pelo nome
        esportes.remove("Handbol");

        System.out.println(esportes);

        // pegar um elemento da lista pelo indice
        System.out.println(esportes.get(0));

        // Navegar nos esportes
        for (String listaEsportes: esportes){
            System.out.println(listaEsportes);
        }
    }
}
