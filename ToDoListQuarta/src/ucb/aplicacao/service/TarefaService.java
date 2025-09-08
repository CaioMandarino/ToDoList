package ucb.aplicacao.service;

import ucb.aplicacao.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

<<<<<<< Updated upstream
    public Tarefa criarTarefa(String nome, String descricao) {
        Tarefa tarefa = new Tarefa(nome, descricao);
        tarefas.add(tarefa);
        return tarefa;
    }

    public Tarefa alterarTarefa(){
  //      System.out.println("Teste");
  //      return tarefa;
  //       BASE
    }



    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
=======
        private List<Tarefa> tarefas = new ArrayList<Tarefa>();
        private long id = 0;

        public Tarefa criarTarefa (String titulo, String descricao,boolean completa) {

            Tarefa tarefa = new Tarefa(id++ ,titulo, descricao, completa);
                 tarefas.add(tarefa);
                 tarefas.add(tarefa);


            return tarefa;

        }

        public List<Tarefa> listarTarefas() {
           // for(int i =0; i< tarefas.size(); i+=1){
                return listarTarefas();

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
>>>>>>> Stashed changes
