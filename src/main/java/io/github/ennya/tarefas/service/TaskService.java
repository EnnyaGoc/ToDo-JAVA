import java.util.LinkedHashMap;
import java.util.Map;

import io.github.ennya.model.Tarefa;

public class TaskService {
    private final Map<Long, Tarefa> tarefas = new LinkedHashMap<>();
    private long proximoId = 1;
}
