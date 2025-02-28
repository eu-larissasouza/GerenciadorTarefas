package br.com.gerenciadortarefas.service;

import br.com.gerenciadortarefas.dto.request.UsuarioRequestDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDetailDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDto;
import br.com.gerenciadortarefas.exceptions.NotFoundException;
import br.com.gerenciadortarefas.factory.UsuarioFactory;
import br.com.gerenciadortarefas.model.Usuario;
import br.com.gerenciadortarefas.repository.UsuarioRepository;
import br.com.gerenciadortarefas.utils.EResponses;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;
    UsuarioFactory usuarioFactory;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioFactory usuarioFactory) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioFactory = usuarioFactory;
    }

    public List<UsuarioDto> buscarUsuarios() {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        if (usuarioList.isEmpty()) {
            throw new NotFoundException(EResponses.USERS_NOT_FOUND.getMessage());
        }

        return usuarioList.stream().map(usuarioFactory::convertUsuarioToDto).toList();
    }

    public UsuarioDetailDto buscarUsuarioPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(EResponses.USERS_NOT_FOUND.getMessage()));

        return usuarioFactory.convertUsuarioToDetailDto(usuario);
    }

    public UsuarioDto criarUsuario(UsuarioRequestDto requestDto) {
        Usuario novo = usuarioFactory.convertDtoToUsuario(requestDto);
        Usuario salvo = usuarioRepository.save(novo);

        return usuarioFactory.convertUsuarioToDto(salvo);
    }

    public UsuarioDto atualizarUsuario(Long id, UsuarioRequestDto requestDto) {
        Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(EResponses.USER_NOT_FOUND.getMessage() + id));

        usuarioExistente.setNome(requestDto.nome());
        usuarioExistente.setEmail(requestDto.email());

        Usuario atualizado = usuarioRepository.save(usuarioExistente);

        return usuarioFactory.convertUsuarioToDto(atualizado);
    }

    public void removerUsuario(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new NotFoundException(EResponses.USER_NOT_FOUND.getMessage() + id);
        }
        usuarioRepository.deleteById(id);
    }


}
