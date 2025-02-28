package br.com.gerenciadortarefas.controller;

import br.com.gerenciadortarefas.dto.request.UsuarioRequestDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDetailDto;
import br.com.gerenciadortarefas.dto.response.UsuarioDto;
import br.com.gerenciadortarefas.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
@RequestMapping("/usuarios")
public class UsuarioController {
    UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> buscarUsuarios() {
        return new ResponseEntity<>(usuarioService.buscarUsuarios(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDetailDto> buscarUsuarioDetalhe(@PathVariable Long id) {
        return new ResponseEntity<>(usuarioService.buscarUsuarioPorId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> criarUsuario(@Valid @RequestBody UsuarioRequestDto usuario) {
        return new ResponseEntity<>(usuarioService.criarUsuario(usuario), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDto> atualizarUsuario(@PathVariable Long id,
                                             @Valid @RequestBody UsuarioRequestDto usuario) {
        return new ResponseEntity<>(usuarioService.atualizarUsuario(id, usuario), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> removerUsuario(@PathVariable("id") Long id) {
        usuarioService.removerUsuario(id);
        return new ResponseEntity<>("Usuário removido com sucesso!.", HttpStatus.OK);
    }

}
