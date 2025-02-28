package br.com.gerenciadortarefas.dto.request;


import br.com.gerenciadortarefas.utils.Prioridade;
import br.com.gerenciadortarefas.utils.Status;

import java.time.LocalDate;

public record TarefaRequestDto(
        String titulo,
        String descricao,
        LocalDate prazoVencimento,
        Prioridade prioridade,
        Status status,
        String usuarioId
) {
}
