package br.com.gerenciadortarefas.repository;

import br.com.gerenciadortarefas.model.Tarefa;
import br.com.gerenciadortarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
