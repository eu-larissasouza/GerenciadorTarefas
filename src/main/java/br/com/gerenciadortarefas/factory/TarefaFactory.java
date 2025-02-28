package br.com.gerenciadortarefas.factory;

import br.com.gerenciadortarefas.dto.request.TarefaRequestDto;
import br.com.gerenciadortarefas.dto.response.TarefaDto;
import br.com.gerenciadortarefas.dto.response.TarefaDetailDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDto;
import br.com.gerenciadortarefas.model.Tarefa;
import br.com.gerenciadortarefas.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class TarefaFactory {

    public Tarefa convertDtoToTarefa(TarefaRequestDto request, Usuario usuario){
        return Tarefa.builder()
                .titulo(request.titulo())
                .descricao(request.descricao())
                .prazoVencimento(request.prazoVencimento())
                .prioridade(request.prioridade())
                .status(request.status())
                .usuario(usuario)
                .build();
    }

    public TarefaDto convertTarefaToDto(Tarefa tarefa){
        return TarefaDto.builder()
                .id(tarefa.getId())
                .titulo(tarefa.getTitulo())
                .descricao(tarefa.getDescricao())
                .prazoVencimento(tarefa.getPrazoVencimento())
                .prioridade(tarefa.getPrioridade())
                .status(tarefa.getStatus())
                .build();
    }

    public TarefaDetailDto convertTarefaToDetailDto(Tarefa tarefa){
        Usuario usuario = tarefa.getUsuario();
        UsuarioDto usuarioDto = UsuarioDto.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail()).build();

        return TarefaDetailDto.builder()
                .id(tarefa.getId())
                .titulo(tarefa.getTitulo())
                .descricao(tarefa.getDescricao())
                .prazoVencimento(tarefa.getPrazoVencimento())
                .prioridade(tarefa.getPrioridade())
                .status(tarefa.getStatus())
                .usuario(usuarioDto)
                .build();
    }
}
