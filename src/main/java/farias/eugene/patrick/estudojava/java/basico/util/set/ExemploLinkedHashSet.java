package farias.eugene.patrick.estudojava.java.basico.util.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        // Mantem a ordem de insercao
        // Faz com que ela seja mais lenta em relacao ao HashSet

        Set<Integer> sequenciaNumerica = new HashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(10);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(7);
        System.out.println(sequenciaNumerica);

        System.out.println("Lista pelo for:");
        for (Integer valor: sequenciaNumerica){
            System.out.println(valor);
        }

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        System.out.println("Lista pelo While:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println( "Quantidade: "   + sequenciaNumerica.size());

    }
}
