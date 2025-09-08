package ucb.aplicacao.cli;


import ucb.aplicacao.model.Tarefa;
import ucb.aplicacao.service.TarefaService;

import java.time.LocalDateTime;
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
                System.out.println("==================================================");
                System.out.println("Titulo");
                String titulo = entrada.nextLine();

                System.out.println("Descrição");
                String descricao = entrada.nextLine();

                System.out.println("Tarefa Completa");
                boolean completa = entrada.nextBoolean();


                Tarefa nova = service.criarTarefa(titulo,descricao,completa);
                nova.getDataAgora();
                System.out.println("==================================================");
                System.out.println("                    Resultados");
                System.out.println("==================================================");
                System.out.println("ID :" + nova.getId());
                System.out.println("Tarefa Criada: " + nova.getTitulo());
                System.out.println("Data: " + nova.getDataAgora());


            }

            case 2 -> {
                List<Tarefa> tarefas = service.listarTarefas();
                if (tarefas.isEmpty()){
                    System.out.println("A lista esta vazia");
                }
                else {

                }

            }
            case 3 -> {
                System.out.println("========= Atualizar Tarefa =========");
            }
            case 4 -> {
                System.out.println("========= Remover Tarefa =========");
            }
            case 5 -> {
                System.out.println("========= Consultar tarefa =========");
            }

        }
        }
        }
    }