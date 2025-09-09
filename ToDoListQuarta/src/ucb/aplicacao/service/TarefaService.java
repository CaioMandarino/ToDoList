package ucb.aplicacao.service;

import ucb.aplicacao.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();
    private long id = 0;

    public Tarefa criarTarefa (String titulo, String descricao, boolean completa) {

        Tarefa tarefa = new Tarefa(id++ ,titulo, descricao, completa);

        tarefas.add(tarefa);

        return tarefa;
    }

    public List<Tarefa> listarTarefas() {
      
        if( !tarefas.isEmpty() ) {
            for (int i = 0; i < tarefas.size(); i += 1) {
                System.out.println("\n-+-+-+-+-+-+-+-+-+-+\n");
                System.out.println("\nID: " + tarefas.get(i).getId());
                System.out.println("\nTitulo: " + tarefas.get(i).getTitulo());
                System.out.println("Data-Criação: " + tarefas.get(i).getDataAgora());
                System.out.println("\nDescrição: " + tarefas.get(i).getDescricao());
                System.out.println("\nCompleta: " + tarefas.get(i).isCompleta() + "\n");

            }
            System.out.println("\n-+-+-+-+-+-+-+-+-+-+\n");
        }
        return tarefas;
    }

    public Tarefa consultarTarefa(long id ){
        for (Tarefa tarefa  : tarefas ){
            if (tarefa.getId().equals(id)){
                return tarefa;
            }
        }
        return null;
    }
}
