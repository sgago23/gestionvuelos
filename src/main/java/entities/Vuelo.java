package entities;

import java.time.LocalDate;
/**
 * Representa un vuelo con información detallada sobre su origen, destino,
 * fechas y compañía. Esta entidad se utiliza para almacenar y manipular
 * los datos necesarios para aplicar filtros por fecha.
 */
public class Vuelo {
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private  String lugarLlegada;
    private LocalDate fechaSalida;
    private  LocalDate fechaLlegada;
    /**
     * Crea un nuevo objeto {@code Vuelo}.
     *
     * @param id           Identificador único del vuelo.
     * @param nombreVuelo  Código o nombre del vuelo (ej: H001-V).
     * @param empresa      Compañía aérea responsable del vuelo.
     * @param lugarSalida  Ciudad desde donde sale el vuelo.
     * @param lugarLlegada Ciudad donde aterriza el vuelo.
     * @param fechaSalida  Fecha de salida del vuelo.
     * @param fechaLlegada Fecha de llegada del vuelo.
     */
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada){
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    /** @return el identificador del vuelo */
    public int getId() {
        return id;
    }
    /** @param id nuevo identificador del vuelo */
    public void setId(int id) {
        this.id = id;
    }
    /** @return la fecha de llegada del vuelo */
    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
    /** @param fechaLlegada nueva fecha de llegada */
    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    /** @return el nombre o código del vuelo */
    public String getNombreVuelo() {
        return nombreVuelo;
    }
    /** @param nombreVuelo nuevo nombre o código del vuelo */
    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }
    /** @return la aerolínea encargada del vuelo */
    public String getEmpresa() {
        return empresa;
    }
    /** @param empresa nueva aerolínea del vuelo */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    /** @return ciudad de salida del vuelo */
    public String getLugarSalida() {
        return lugarSalida;
    }
    /** @param lugarSalida nueva ciudad de salida */
    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }
    /** @return ciudad de llegada del vuelo */
    public String getLugarLlegada() {
        return lugarLlegada;
    }
    /** @param lugarLlegada nueva ciudad de llegada */
    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }
    /** @return la fecha de salida del vuelo */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    /** @param fechaSalida nueva fecha de salida del vuelo */
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLlegada='" + lugarLlegada + '\'' +
                ", fechaSalida=" + fechaSalida +
                ", fechaLlegada=" + fechaLlegada +
                '}';
    }
}
