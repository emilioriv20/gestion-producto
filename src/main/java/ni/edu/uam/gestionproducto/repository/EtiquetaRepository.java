package ni.edu.uam.gestionproducto.repository;

import ni.edu.uam.gestionproducto.entity.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {
}