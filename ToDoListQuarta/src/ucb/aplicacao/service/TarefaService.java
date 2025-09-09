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
                System.out.println("ID: " + tarefas.get(i).getId());
                System.out.println("Titulo: " + tarefas.get(i).getTitulo());
                System.out.println("Data-Criação: " + tarefas.get(i).getDataAgora());
                System.out.println("Descrição: " + tarefas.get(i).getDescricao());
                String status = tarefas.get(i).isCompleta() ? "Concluída" : "Pendente";
                System.out.println("Status: " + status + "\n");
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

    public Tarefa atualizarTarefa(long id, String novoTitulo, String novaDescricao) {
        Tarefa tarefaSelecionada = consultarTarefa(id);
        if (tarefaSelecionada == null) { return null; }
        tarefaSelecionada.setTitulo(novoTitulo);
        tarefaSelecionada.setDescricao(novaDescricao);
        return tarefaSelecionada;
    }

    public boolean removerTarefa(long id) {
        return tarefas.removeIf(tarefa -> tarefa.getId().equals(id));
    }

    public boolean marcarComoConcluida(long id, boolean completa) {
        Tarefa tarefaSelecionada = consultarTarefa(id);
        if (tarefaSelecionada == null) { 
            return false; 
        }
        tarefaSelecionada.setCompleta(completa);
        return true;
    }
}