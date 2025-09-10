package ucb.aplicacao.model; //

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {

    private Long id = 0L;//Pode deixar a incrementação automatico
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;


    //Padrão Marcar como concluida
    public Tarefa(){
        this.dataAgora = LocalDateTime.now();
        this.completa = false;
    }

    //Construtor com titulo
    public Tarefa(String titulo){
        this();
        this.titulo = titulo;
    }

    //Construtor com titulo e descrição
    public Tarefa(String titulo, String descricao){
        this(titulo);
        this.descricao = descricao;
    }

    //Construtor completo
    public Tarefa(Long id, String titulo, String descricao, boolean completa){
        this(titulo, descricao);
        this.id = id;
        this.completa = completa;
    }

    //GETS E SETS
    public LocalDateTime getDataAgora() {
        return dataAgora;
    }

    public void setDataAgora(LocalDateTime dataAgora) {
        this.dataAgora = dataAgora;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}