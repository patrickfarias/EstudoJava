package farias.eugene.patrick.estudojava.java.basico.util.queue;

import farias.eugene.patrick.estudojava.java.utilidades.Message;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Deque;

public class ExemploQueue {

    public static void main(String[] args) {

        Message log = new Message();

        // QUEUE e usado para gerenciar filas

        System.out.println("======================================================================");

        log.info("Vamos simular uma fila de banco.");
        log.info("Por lei, os bancos devem colocar uma protecao visual, para que ninguem veja o atendimento.");
        log.info("Entao o Caixa, nao consegue ver se tem alguem ou nao na fila.");
        log.info("O caixa chamou o proximo cliente.");

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Cliente 1");
        filaBanco.add("Cliente 2");

        System.out.println(filaBanco);

        // Nunca podemos alterar um elemento que esta no meio da lista.
        // Logicamente sempre vamos alterar um elemento que foi adicionado primeiro.
        // Vamos analisar alguns elementos da dessa fila.

        //poll
        // Retornna e remove a cabeca dessa fila
        // Se a fila estiver vazia ele retorna null

        // peek
        // Ele nao remove o elemento da fila
        // retorna null se a fila estiver vazia

        // element
        // igual ao peek, ele nao remove o item da lista.
        // porem se a fila estiver vazia ele retorna uma excessao.

        String proximoCliente = filaBanco.poll();

        log.info("O Cliente chamado foi: " + proximoCliente);

        log.info("Perceba que o cliente 1 nao esta mais na lista:");
        System.out.println(filaBanco);

        log.info("Agora pense na seguinte situacao.");
        log.info("O caixa vai chamar o proximo, mas nao vai atende-lo,\nsera apenas para avisar que o sistema esta fora e que ele sera o proximo, mas tera que esperar um pouco..");
        log.info("Entao a fila deve continuar como esta");
        log.info("Agora quem seria o proximo?");
        log.info(filaBanco.peek());
        log.info("Isso mesmo, visto que o cliente 1 ja foi atendido.");
        log.info("Agora o cliente 2 tambem ja foi atendido");
        filaBanco.poll();
        log.info("Agora minha lista esta vazia.\nO que acontece se eu chamar o proximo?");
        log.info("Depende de qual metodo vc usar");
        log.info("Se usar o speek, ele retorna null se a lista estiver vazia");
        log.info("Se usar o element, ele retorna uma excessao caso a lista estiver vazia");
        log.info("Vamos testar primeiro a speek");
        log.info("Proximo: " + filaBanco.peek());
        log.info("Retornou null");
        log.info("Vamos agora ao element: Ele vai gerar uma [ java.util.NoSuchElementException ]");

        try {
            log.info("Proximo: " + filaBanco.element());
        } catch (java.util.NoSuchElementException e ) {
            log.info("Exception gerada e tratada: " + e );
        }

        log.info("Em seguida chegaram mais clientes");

        filaBanco.add("Cliente 3");
        filaBanco.add("Cliente 4");
        filaBanco.add("Cliente 5");


        log.info("Quantos sao?: " + filaBanco.size());

        log.info("Quem sao?");


        for (String clientes: filaBanco){

            log.info("-->"+ clientes);
        }

        log.info("O mesmo acima porem usando o while:");

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while(iteratorFilaBanco.hasNext()){
            log.info("==>" + iteratorFilaBanco.next());
        }

       log.info("Existe um cliente 6 nessa fila? " + filaBanco.contains("Cliente 6"));

        // Limpa a fila
        filaBanco.clear();

        log.info("Fila esta vazia: " + filaBanco.isEmpty() );

        log.info("======================================================================");
    }
}
