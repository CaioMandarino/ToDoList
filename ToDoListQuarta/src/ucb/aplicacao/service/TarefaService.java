    package ucb.aplicacao.service;

    import ucb.aplicacao.model.Tarefa;

    import java.util.ArrayList;
    import java.util.List;

    public class TarefaService {

        private List<Tarefa> tarefas = new ArrayList<Tarefa>();
        private long id = 0;

        public Tarefa criarTarefa (String titulo, String descricao,boolean completa) {

            Tarefa tarefa = new Tarefa(id++ ,titulo, descricao, completa);
                 tarefas.add(tarefa);


            return tarefa;

        }

        public List<Tarefa> listarTarefas() {
            for(int i =0; i< tarefas.size(); i+=1){
                return listarTarefas();
                }
            return List.of();
        }
    }
