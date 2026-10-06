package ni.edu.uam.gestionproducto.DTO;

public class EtiquetaDTO {

    private Integer id;
    private String nombre;

    public EtiquetaDTO() {}

    public EtiquetaDTO(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}