package ni.edu.uam.gestionproducto.repository;

import ni.edu.uam.gestionproducto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}