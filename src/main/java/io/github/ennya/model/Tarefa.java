package io.github.ennya.model;
import java.time.LocalDate;

public class Tarefa {
    private Integer id;
    private String nome;
    private String descricao;
    private Status status;
    private Prioridade prioridade;
    private LocalDate dataConclusao;

    public Tarefa(LocalDate dataConclusao, String descricao, String nome, Prioridade prioridade) {
        this.dataConclusao = dataConclusao;
        this.descricao = descricao;
        this.nome = nome;
        this.prioridade = prioridade;
        this.status = Status.PENDENTE;
    }

    public void concluir() {
        this.status = Status.CONCLUIDA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("A tarefa precisa ter um nome!");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarefa{");
        sb.append("nome=").append(nome);
        sb.append(", descricao=").append(descricao);
        sb.append(", status=").append(status);
        sb.append(", prioridade=").append(prioridade);
        sb.append(", dataConclusao=").append(dataConclusao);
        sb.append('}');
        return sb.toString();
    }

}
