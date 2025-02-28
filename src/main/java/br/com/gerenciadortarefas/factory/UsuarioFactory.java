package br.com.gerenciadortarefas.factory;

import br.com.gerenciadortarefas.dto.request.UsuarioRequestDto;
import br.com.gerenciadortarefas.dto.response.TarefaDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDetailDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDto;
import br.com.gerenciadortarefas.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UsuarioFactory {

    TarefaFactory tarefaFactory;

    public UsuarioFactory(TarefaFactory tarefaFactory) {
        this.tarefaFactory = tarefaFactory;
    }

    public Usuario convertDtoToUsuario(UsuarioRequestDto request){
        return Usuario.builder()
                .nome(request.nome())
                .email(request.email())
                .build();
    }

    public UsuarioDto convertUsuarioToDto(Usuario usuario) {
        return UsuarioDto.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .build();
    }

    public UsuarioDetailDto convertUsuarioToDetailDto(Usuario usuario) {
        List<TarefaDto> tarefaDtos = new ArrayList<>();
        if(usuario.getTarefas() != null){
             tarefaDtos = usuario.getTarefas().stream().map(tarefaFactory::convertTarefaToDto).collect(Collectors.toList());
        }

        return UsuarioDetailDto.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .tarefas(tarefaDtos)
                .build();
    }
}
