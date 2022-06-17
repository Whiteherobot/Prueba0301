package modeloPartido;
//@michi
public class Partido {
    private int codigoPartido;
    private String direccionPartido;
    private String nombreSede;
    private String entrenadorEquipo;

    public Partido(int codigoPartido, String direccionPartido, String nombreSede, String entrenadorEquipo) {
        this.codigoPartido = codigoPartido;
        this.direccionPartido = direccionPartido;
        this.nombreSede = nombreSede;
        this.entrenadorEquipo = entrenadorEquipo;
    }
    public Partido(){
        
    }

    public int getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(int codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public String getDireccionPartido() {
        return direccionPartido;
    }

    public void setDireccionPartido(String direccionPartido) {
        this.direccionPartido = direccionPartido;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getEntrenadorEquipo() {
        return entrenadorEquipo;
    }

    public void setEntrenadorEquipo(String entrenadorEquipo) {
        this.entrenadorEquipo = entrenadorEquipo;
    }

    @Override
    public String toString() {
        return "Partido{" + "codigoPartido=" + codigoPartido + 
                ", direccionPartido=" + direccionPartido + ", nombreSede=" +
                nombreSede + ", entrenadorEquipo=" + entrenadorEquipo + '}';
    }
    
}
