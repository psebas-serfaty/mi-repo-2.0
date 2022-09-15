package fna;
import java.time.*;

public class RecursoMuseo {
    private LocalDate fecha;
    private Ejercito item;

    public RecursoMuseo(LocalDate fecha, Ejercito item) {
        this.fecha = LocalDate.now();
        this.item = item;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Ejercito getItem() {
        return item;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setItem(Ejercito item) {
        this.item = item;
    }

    public String imprimir() {
        return "[RecursoMuseo] " + "Fecha de muerte: " + this.fecha + " " + "Nombre: " + this.item.getNombre();

    }

}
