package ni.edu.uam.gestionproducto.repository;

import ni.edu.uam.gestionproducto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByCategoriaId(Integer categoriaId);

    // Agrega esta línea:
    List<Producto> findByEtiquetasId(Integer etiquetaId);
}