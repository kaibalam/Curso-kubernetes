package org.rvalenzuela.springcloud.msvc.cursos.services;

import org.rvalenzuela.springcloud.msvc.cursos.models.Usuario;
import org.rvalenzuela.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
    void eliminarCursoUsuarioPorId(Long id);

    Optional<Curso> porIdConUsuarios(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> eliminar(Usuario usuario, Long cursoId);
}
