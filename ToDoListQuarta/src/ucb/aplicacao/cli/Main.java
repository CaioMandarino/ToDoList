package ucb.aplicacao.cli;


import ucb.aplicacao.model.Tarefa;
import ucb.aplicacao.service.TarefaService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaService service = new TarefaService();
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("===============GERENCIADOR DE TAREFAS===============");
            System.out.println(" (1). Cadastrar ");
            System.out.println(" (2). Listar Tarefas ");
            System.out.println(" (3). Atualizar Tarefa ");
            System.out.println(" (4). Remover Tarefa ");
            System.out.println(" (5). Consultar Tarefa ");
            System.out.println(" (6). Sair ");
            System.out.println(" Escolha uma opção ");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        switch (opcao){
            case 1 -> {
                System.out.println("Titulo");
                String titulo = entrada.nextLine();
                System.out.println("Descrição");
                String descricao = entrada.nextLine();
                Tarefa nova = service.criarTarefa(titulo,descricao);
                System.out.println("Tarefa Criada:" + nova.getTitulo());

            }

            case 2 -> {
                List<Tarefa> tarefas = service.getTarefas();
            }

        }
        }
        }
    }