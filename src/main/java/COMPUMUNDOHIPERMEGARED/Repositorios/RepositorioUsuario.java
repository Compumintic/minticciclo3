package COMPUMUNDOHIPERMEGARED.Repositorios;

import COMPUMUNDOHIPERMEGARED.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Empleado, Long> {
}
