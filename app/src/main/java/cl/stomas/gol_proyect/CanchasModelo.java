package cl.stomas.gol_proyect;

public class CanchasModelo {

    private String nombre, horario;
    private int imgCancha;

    public CanchasModelo() {
    }

    public CanchasModelo(String nombre, String horario, int imgCancha) {
        this.nombre = nombre;
        this.horario = horario;
        this.imgCancha = imgCancha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getImgCancha() {
        return imgCancha;
    }

    public void setImgCancha(int imgCancha) {
        this.imgCancha = imgCancha;
    }
}
