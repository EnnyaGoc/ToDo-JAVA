package io.github.ennya.tarefas.repository;
import java.util.List;
import java.util.Optional;

import io.github.ennya.model.Tarefa;

public interface TaskRepository {
    public void salvar(Integer id);
    public Optional<Tarefa> buscarPorId(Integer id);
    public List<Tarefa> listar();
    public void deletar(Integer id);
}
