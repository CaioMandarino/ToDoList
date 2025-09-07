    package ucb.aplicacao.service;

    import ucb.aplicacao.model.Tarefa;

    import java.util.ArrayList;
    import java.util.List;

    public class TarefaService {

        private List<Tarefa> tarefas = new ArrayList<Tarefa>();
        public Tarefa criarTarefa (String titulo, String descricao, boolean completa) {

            Tarefa tarefa = new Tarefa(titulo, descricao);
            tarefas.add(tarefa);
            return tarefa;

        }

        public List<Tarefa> listarTarefa() {

            return tarefas;
        }
    }
