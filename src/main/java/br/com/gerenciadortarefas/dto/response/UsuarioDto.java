package br.com.gerenciadortarefas.dto.response;

import lombok.Builder;

@Builder
public record UsuarioDto(
        Long id,
        String nome,
        String email
) {
}
