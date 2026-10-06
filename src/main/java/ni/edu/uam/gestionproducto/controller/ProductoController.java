package ni.edu.uam.gestionproducto.controller;

import ni.edu.uam.gestionproducto.DTO.ProductoRequestDTO;
import ni.edu.uam.gestionproducto.entity.Producto;
import ni.edu.uam.gestionproducto.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listar() {
        return productoService.listar();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Integer id) {
        return productoService.buscarPorId(id);
    }

    @PostMapping
    public Producto guardar(@RequestBody ProductoRequestDTO dto) {
        return productoService.guardar(dto);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Integer id, @RequestBody ProductoRequestDTO dto) {
        return productoService.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        productoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> listarPorCategoria(@PathVariable Integer categoriaId) {
        return productoService.listarPorCategoria(categoriaId);
    }

    @PostMapping("/{productoId}/etiquetas/{etiquetaId}")
    public Producto agregarEtiqueta(@PathVariable Integer productoId, @PathVariable Integer etiquetaId) {
        return productoService.agregarEtiqueta(productoId, etiquetaId);
    }

    @DeleteMapping("/{productoId}/etiquetas/{etiquetaId}")
    public Producto eliminarEtiqueta(@PathVariable Integer productoId, @PathVariable Integer etiquetaId) {
        return productoService.eliminarEtiqueta(productoId, etiquetaId);
    }

    @GetMapping("/etiqueta/{etiquetaId}")
    public List<Producto> listarPorEtiqueta(@PathVariable Integer etiquetaId) {
        return productoService.listarPorEtiqueta(etiquetaId);
    }
}