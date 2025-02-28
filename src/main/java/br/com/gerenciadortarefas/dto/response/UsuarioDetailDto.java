package br.com.gerenciadortarefas.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.util.List;

@Builder
public record UsuarioDetailDto(
        Long id,
        String nome,
        String email,
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        List<TarefaDto> tarefas
) {
}
