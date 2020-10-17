package farias.eugene.patrick.estudojava.java.basico.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exemploList {

    public static void main(String[] args) {

        List<String> nomes  = new ArrayList();

        nomes.add("Jose");
        nomes.add("Quem sou eu?");
        nomes.add("Sabrina");
        nomes.add("Helena");
        nomes.add("Patrick");
        nomes.add("Priscila");
        nomes.add("Altair");
        nomes.add("Samuel");
        nomes.add("Miguel");
        System.out.println(nomes);

        // metodo set atualiza pela posicao
        nomes.set(1, "Carlos");

        System.out.println(nomes);

        // Ordenando a lista de nomes
        Collections.sort(nomes);

        System.out.println(nomes);

        // remove pelo indice
        nomes.remove(1);

        // remove pelo nome
        nomes.remove("Carlos");

        // agora o carlos nao esta mais presente na lista
        System.out.println(nomes);

        // pegar um elemento da lista pelo indice
        String aluno = nomes.get(1);

        System.out.println(aluno);

        // se colocar um indice que nao existe,
        // o metodo get vai lancar uma expecption de:
        // java.lang.IndexOutOfBoundsException

        // quantos alunos tem nessa lista?
        int quantidadeNomes = nomes.size();

        System.out.println("Temos " +  quantidadeNomes + " nomes na lista");

        // remove pelo nome
        nomes.remove("Samuel");

        // agora deve ter menos um nome
        System.out.println(nomes.size());

        // agora quero saber se nessa lista existe um nome determinado
        // o metodo contains retorna um boolean

        System.out.println("Lista atualizada: " + nomes);
        System.out.println("Existe alguem de nome Renata nessa lista?: " + nomes.contains("Renata"));
        System.out.println("Existe alguem de nome Helena nessa lista?: " + nomes.contains("Helena"));


        // quero saber se existe determinado nome e qual o posicao dele na lista.
        // se retornar -1
        // siginifica que o elemento nao existe
        int posicao = nomes.indexOf("Helena");
        System.out.println("Helena esta na posicao: " + posicao);

        System.out.println("Minha lista esta vazia: " + nomes.isEmpty());

        System.out.println("apagando a lista");

        // limpar a lista
        nomes.clear(); // limpa a lista
        System.out.println("e agora?: " + nomes.isEmpty());


        // quero saber se existe determinado nome e qual o posicao dele na lista.
        // se retornar -1
        // siginifica que o elemento nao existe
        posicao = nomes.indexOf("Helena");
        System.out.println("Helena esta na posicao: " + posicao);


    }

}
