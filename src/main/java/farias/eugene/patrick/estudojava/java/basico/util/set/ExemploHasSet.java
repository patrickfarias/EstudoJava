package farias.eugene.patrick.estudojava.java.basico.util.set;

import farias.eugene.patrick.estudojava.java.utilidades.Message;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHasSet {

    public static void main(String[] args) {

        Message log = new Message();

        log.info("Esta e a implementacao SET mais utilizada em producao");

        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(1.0);
        notaAlunos.add(1.5);
        notaAlunos.add(2.0);
        notaAlunos.add(2.5);
        notaAlunos.add(3.0);
        notaAlunos.add(3.5);
        notaAlunos.add(4.0);
        notaAlunos.add(4.5);
        notaAlunos.add(5.0);
        notaAlunos.add(5.5);

        log.info("Note que nao esta na mesma ordem em que foi inserido");
        System.out.println(notaAlunos);

        log.info("Isso para que haja mais velocidade na insercao, remocao e leitura");

        // Na API JDBC
        // quando vc faz uma consulta nativa vc recebe um ResultSet<>
        // porque o set tem mais performance.

        log.info("Quantidade: " + notaAlunos.size());

        notaAlunos.remove(4.0);

        log.info("Quantidade: " + notaAlunos.size());

        Iterator<Double> iterator = notaAlunos.iterator();

        System.out.println("Lista pelo While:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // agora pelo for
        System.out.println("Lista pelo for:");


        for (Double valor: notaAlunos){
            System.out.println(valor);
        }


    }
}
