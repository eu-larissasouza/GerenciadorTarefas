package br.com.gerenciadortarefas.dto.response;

import br.com.gerenciadortarefas.utils.Prioridade;
import br.com.gerenciadortarefas.utils.Status;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record TarefaDetailDto(
        Long id,
        String titulo,
        String descricao,
        LocalDate prazoVencimento,
        Prioridade prioridade,
        Status status,
        UsuarioDto usuario
) {
}
