package ucb.aplicacao.cli;

import ucb.aplicacao.model.Tarefa;
import ucb.aplicacao.service.TarefaService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaService service = new TarefaService();
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("===============GERENCIADOR DE TAREFAS===============");
            System.out.println(" (1). Cadastrar ");
            System.out.println(" (2). Listar Tarefas ");
            System.out.println(" (3). Atualizar Tarefa ");
            System.out.println(" (4). Remover Tarefa ");
            System.out.println(" (5). Consultar Tarefa ");
            System.out.println(" (6). Marcar como Concluida ");
            System.out.println(" (7). Sair ");
            System.out.println(" Escolha uma opção ");
            int opcao = entrada.nextInt();
            entrada.nextLine();
          
            switch (opcao) {
                case 1 -> {
                    System.out.println("==================================================");
                    System.out.println("Titulo");
                    String titulo = entrada.nextLine();

                    System.out.println("Descrição");
                    String descricao = entrada.nextLine();

                    System.out.println("Tarefa está concluída? (s/n)");
                    String resposta = entrada.nextLine().trim();
                    boolean completa = resposta.equalsIgnoreCase("s");

                    Tarefa nova = service.criarTarefa(titulo, descricao, completa);
                    nova.getDataAgora();
                    System.out.println("==================================================");
                    System.out.println("                    Resultados");
                    System.out.println("==================================================");
                    System.out.println("ID :" + nova.getId());
                    System.out.println("Tarefa Criada: " + nova.getTitulo());
                    System.out.println("Data: " + nova.getDataAgora());
                    System.out.println("Status: " + (nova.isCompleta() ? "Concluída" : "Pendente"));
                }

                case 2 -> {
                    List<Tarefa> tarefas = service.listarTarefas();
                    if (tarefas.isEmpty()) {
                        System.out.println("A lista esta vazia");
                    }
                }
                case 3 -> {
                    System.out.println("========= Atualizar tarefa =========");
                    System.out.println("Digite o valor do ID para Atualizar a tarefa");
                    long pegaID = entrada.nextLong();
                    entrada.nextLine();

                    System.out.println("Novo Titulo: ");
                    String novoTitulo = entrada.nextLine();

                    System.out.println("Nova Descricao: ");
                    String novaDescricao = entrada.nextLine();

                    Tarefa tarefaAtualizada = service.atualizarTarefa(pegaID, novoTitulo, novaDescricao);
                    if (tarefaAtualizada == null) {
                        System.out.println("Tarefa não encontrada");
                    } else {
                        System.out.println("A tarefa " + tarefaAtualizada.getTitulo() + " foi atualizada");
                    }
                }
                case 4 -> {
                    System.out.println("========= Remover Tarefa =========");
                    service.listarTarefas(); 
                    System.out.print("Digite o ID da tarefa que deseja remover: ");
                    long pegaID = entrada.nextLong();
                    entrada.nextLine();
                    boolean RemoveID = service.removerTarefa(pegaID);
                    if (RemoveID) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("ERRO: Tarefa com ID " + pegaID + " não foi encontrada.");
                    }
                }
                case 5 -> {
                    System.out.println("========= Consultar tarefa =========");
                    System.out.println("Digite o valor do ID para Consultar a tarefa");

                    long pegaID = entrada.nextLong();
                    entrada.nextLine();

                    Tarefa IdAlvo = service.consultarTarefa(pegaID);
                    if (IdAlvo != null) {
                        System.out.println("ID: " + IdAlvo.getId());
                        System.out.println("Título: " + IdAlvo.getTitulo());
                        System.out.println("Descrição: " + IdAlvo.getDescricao());
                        String status = IdAlvo.isCompleta() ? "Concluída" : "Pendente";
                        System.out.println("Status da tarefa: " + status);
                    }
                }
                case 6 -> {
                    System.out.println("========= Marcar tarefa como concluída =========");
                    service.listarTarefas();
                    System.out.print("Digite o ID da tarefa que deseja atualizar o status: ");
                    long pegaID = entrada.nextLong();
                    entrada.nextLine();

                    System.out.print("Deseja marcar como concluída? (s/n): ");
                    String resposta = entrada.nextLine().trim();
                    boolean completa = resposta.equalsIgnoreCase("s");

                    boolean atualizado = service.marcarComoConcluida(pegaID, completa);
                    if (atualizado) {
                        System.out.println("Status da tarefa atualizado com sucesso!");
                    } else {
                        System.out.println("ERRO: Tarefa com ID " + pegaID + " não encontrada.");
                    }
                }
                case 7 -> {
                    System.out.println("Saindo do programa...");
                    return;
                }
            }
        }
    }
}