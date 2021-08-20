package model.vo;


public class Consulta1VO_19 {
    private int idProyecto;
    private String fechaInicio;
    private String constructora;
    private Double numeroBanos;
    private Double numeroHabitaciones;
    private String bancoVinculado;
    private Double porcentajeCuotaInicial;
    private String ciudad;
    private String clasificacion;
    private String acabados;
    private String serial;
    private int idTipo;
    private int idLider;

    public Consulta1VO_19() {
    }

    public Consulta1VO_19(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    
    public Consulta1VO_19(int idProyecto, String fechaInicio, String constructora, String serial) {
        this.idProyecto = idProyecto;
        this.fechaInicio = fechaInicio;
        this.constructora = constructora;
        this.serial = serial;
    }


    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Double getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(Double numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public Double getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Double numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVincualado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    public Double getPorcentajeCuotaInicial() {
        return porcentajeCuotaInicial;
    }

    public void setPorcentajeCuotaInicial(Double porcentajeCuotaInicial) {
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdLider() {
        return idLider;
    }

    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }


}