package ucb.aplicacao.service;

import ucb.aplicacao.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public Tarefa criarTarefa(String nome, String descricao) {
        Tarefa tarefa = new Tarefa(nome, descricao);
        tarefas.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
