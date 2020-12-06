package cl.stomas.gol_proyect.Entidades;

public class Canchas_Model{

   private int id_cancha;
   private String nombre_can;
   private String direcion;
   private String ciudad;
   private String region;
   private String contacto;
   private String horario;
   private int  precio;
   private int imagen;

    public Canchas_Model() {
    }

    public Canchas_Model(int id_cancha, String nombre_can, String direcion, String ciudad, String region, String contacto, String horario, int precio, int imagen) {
        this.id_cancha = id_cancha;
        this.nombre_can = nombre_can;
        this.direcion = direcion;
        this.ciudad = ciudad;
        this.region = region;
        this.contacto = contacto;
        this.horario = horario;
        this.precio = precio;
        this.imagen = imagen;
    }


    public void setId_cancha(int anInt) {
        this.id_cancha = id_cancha;
    }

    public String getNombre_can() {
        return nombre_can;
    }

    public void setNombre_can(String nombre_can) {
        this.nombre_can = nombre_can;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    @Override
    public String toString() {
        return nombre_can;
    }

    public void add(Canchas_Model canchas_model) {
    }
}

