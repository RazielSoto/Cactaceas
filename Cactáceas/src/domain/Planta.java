package domain;

public class Planta {

    private int id_planta;
    private String nombre_cientifico;
    private String nombre_comun;
    private String region;
    private int precio;

    public Planta() {
    }
    public Planta(int id_planta) {
        this.id_planta = id_planta;
    }
    public Planta(String nombre_cientifico, String nombre_comun, String region, int precio) {
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.region = region;
        this.precio = precio;
    }
    public Planta(int id_planta, String nombre_cientifico, String nombre_comun, String region, int precio) {
        this.id_planta = id_planta;
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.region = region;
        this.precio = precio;
    }

    public int getId_planta() {
        return id_planta;
    }
    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
    public String getNombre_comun() {
        return nombre_comun;
    }
    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return " Planta{" + "id_planta=" + id_planta + ",nombre cientifico=" + nombre_cientifico + ",nombre_comun=" + nombre_comun + ",region=" + region + ",precio=" + precio + "}";
     }
}
