package ucb.aplicacao.model;

import java.time.LocalDateTime;

public class Tarefa {

    private long id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;

    public Tarefa(){
        this.dataAgora = LocalDateTime.now();
        this.completa = false;

    }
    public Tarefa(String titulo){
        this();
        this.titulo = titulo;
    }
    public Tarefa(String titulo, String descricao){
        this(titulo);
        this.descricao = descricao;
    }
    public Tarefa(Long id, String titulo, String descricao, boolean completa){
        this(titulo, descricao);
        this.id = id;
        this.completa = completa;
    }

}
