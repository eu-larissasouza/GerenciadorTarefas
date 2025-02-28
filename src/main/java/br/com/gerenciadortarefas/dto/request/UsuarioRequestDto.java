package br.com.gerenciadortarefas.dto.request;

import br.com.gerenciadortarefas.utils.ValidationMessages;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public record UsuarioRequestDto(
        @NotBlank(message = ValidationMessages.USER_NAME_NOT_BLANK)
        @Length(max = 20, message = ValidationMessages.USER_NAME_LENGTH)
        @Pattern(regexp = "^[a-zA-Zà-úÀ-Ú0-9 ]+$", message = ValidationMessages.USER_NAME_INVALID)
        String nome,

        @NotNull(message = ValidationMessages.USER_EMAIL_NOT_NULL)
        @Email(message = ValidationMessages.USER_EMAIL_INVALID)
        String email
) {
}
