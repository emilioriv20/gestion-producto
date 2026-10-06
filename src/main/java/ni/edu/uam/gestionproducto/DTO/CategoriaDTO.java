package ni.edu.uam.gestionproducto.DTO;

public class CategoriaDTO {

    private Integer id;
    private String nombre;
    private boolean activa;

    public CategoriaDTO() {}

    public CategoriaDTO(Integer id, String nombre, boolean activa) {
        this.id = id;
        this.nombre = nombre;
        this.activa = activa;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}