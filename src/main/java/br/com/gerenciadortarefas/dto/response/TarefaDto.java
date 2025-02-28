package br.com.gerenciadortarefas.dto.response;

import br.com.gerenciadortarefas.utils.Prioridade;
import br.com.gerenciadortarefas.utils.Status;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record TarefaDto(
        Long id,
        String titulo,
        String descricao,
        LocalDate prazoVencimento,
        Prioridade prioridade,
        Status status
) {
}
