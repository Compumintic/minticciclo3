package COMPUMUNDOHIPERMEGARED.Repositorios;

import COMPUMUNDOHIPERMEGARED.Entidades.Autenticacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutenticacion extends JpaRepository<Autenticacion, Long> {
    Autenticacion findByEmail(String email);
}
